/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author alvo
 */
public class Bot{
    static String minPrice,maxPrice,avPrice; 
    static boolean isLoggedIn, isClosed=false;
   //count number of available orders
   static int availableOrders(WebDriver driver){
       
        WebDriverWait waitForOrderCount=new WebDriverWait(driver,100);
        WebElement foundOrders=waitForOrderCount.until(ExpectedConditions.visibilityOfElementLocated(By.className("irbJoc")));
        String foundOrdersString=foundOrders.getText();
        String[] foundArray=foundOrdersString.split(" ");
        int numberOfOrders = Integer.parseInt(foundArray[1]);
       return numberOfOrders;
   } 
   public static JSONArray selectors(){
       try {
           URL url = new URL("https://sb.clink.co.ke/getElements.php");
           HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
           httpURLConnection.setRequestMethod("GET");
           
           String line="";
           InputStreamReader inputStreamReader=new InputStreamReader(httpURLConnection.getInputStream());
           BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
           StringBuilder response=new StringBuilder();
           while ((line=bufferedReader.readLine())!=null){
               response.append(line);
           }
           bufferedReader.close();

           //adding square brackets t0 make a valid json array
           String datas="["+response+"]";
           JSONArray jsonArray=new JSONArray(response.toString());
           
           JSONObject rec = jsonArray.getJSONObject(0);
           System.out.println(jsonArray.getJSONObject(2).getString("locator"));
           System.out.println("Submit "+ jsonArray);
           
           
           return jsonArray;
           
       }catch (Exception e){
           System.out.println("Error in Making Get Request"+e);
           return null;
       }            
   }
   public static boolean login(WebDriver driver,String email,String password){
       JSONArray jsonArray = Bot.selectors();
       
       //open the browser and log in
    driver.get("https://studybay.app/");
    
    //email
    WebDriverWait wait=new WebDriverWait(driver,10);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(jsonArray.getJSONObject(0).getString("locator")))).sendKeys(email);
    //password
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(jsonArray.getJSONObject(1).getString("locator")))).sendKeys(password);
    //submit
    driver.findElement(By.xpath(jsonArray.getJSONObject(2).getString("locator"))).sendKeys(Keys.RETURN);

    //wrong_email_password
    try{
    if(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(jsonArray.getJSONObject(15).getString("locator")))).isDisplayed()){
        isLoggedIn=false;
    }    
    
    }catch(Exception e){
        isLoggedIn=true;
        driver.get("https://studybay.app/order/search");
    }
    
    return isLoggedIn;
   }
   
   public static void bid(WebDriver driver,int delay,String priceLevel,Boolean refreshAfterBid,String[] filter, javax.swing.JTextArea displayLog) throws InterruptedException, IOException{
       int errorHeperer=0;
        int i=0;     
        JSONArray jsonArray = Bot.selectors();
        WebDriverWait wait=new WebDriverWait(driver,15);
        WebDriverWait waitKiasi=new WebDriverWait(driver,3);
        WebDriverWait waitx2=new WebDriverWait(driver,30);
        List<String> list = Arrays.asList(filter);
        Boolean unwantedsZiko=false;
       //first time refresh
        if(errorHeperer==0){
           errorHeperer++;
           driver.navigate().refresh();
        }
        //end of first time refresh
        //order_list
        while(i>=0){
        //List<WebElement> orders=driver.findElements(By.xpath("//div[@class='orderA__order' or @class=' orderA__order--read' or @class='orderA__order--paid'  or @class='orderA__order--premium'] "));
        List<WebElement> orders=driver.findElements(By.xpath(jsonArray.getJSONObject(3).getString("locator")));
        //if no new order,wait before refresh
        if(orders.size()<=0){
         driver.manage().timeouts().implicitlyWait(delay, TimeUnit.SECONDS);
         //order_list 
         //orders=driver.findElements(By.xpath("//div[@class='orderA__order' or @class=' orderA__order--read' or @class='orderA__order--paid'  or @class='orderA__order--premium'] "));
         try{
         orders=driver.findElements(By.xpath(jsonArray.getJSONObject(3).getString("locator")));
         }catch(Exception e){}
        }
        
        displayLog.append("found "+orders.size()+" order(s) \n");
        displayLog.append("-----------------------------------------------------------------------------"+"\n");
        
        int unwanteds=0;
        for(WebElement order:orders){
                
                //check for unwanted orders
                if(filter.length>0){
                  //subject
                  String subjectPlusType="";
                  String subject="";
                  System.out.println(order.findElement(By.xpath("//div/div[@class='orderA__contentWrapper']/div/div/div[@class='orderA__row5']/a")).getText());
                  try{
                  subjectPlusType=waitKiasi.until(ExpectedConditions.visibilityOf(order.findElement(By.xpath("//div/div[@class='orderA__contentWrapper']/div/div/div[@class='orderA__category']")))).getText();
                  }catch(Exception e){
                      System.out.println("kuna shida na sub");
                  }
                  
                  String[] subjectPlusTypeArray=subjectPlusType.split(",");
                  
                  try{
                      subject=subjectPlusTypeArray[1];
                  }catch(ArrayIndexOutOfBoundsException e){
                      subject="nothing";
    
                  }
                  
                  subject=subject.trim().toLowerCase();
                  System.out.println("subject is "+subject);
                  
                  if(!list.contains(subject)){
                    //close
                    //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='orderA__order' or @class=' orderA__order--read' or @class='orderA__order--paid'  or @class='orderA__order--premium']/div[@class='orderA__order__wrapper']/div[@class='orderA__contentWrapper']/div[@class='orderA__wrapper']/div[@class='orderA__meta']/div[@class='orderA__actions']/button[contains(.,'Hide')]"))).click();
//                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(jsonArray.getJSONObject(6).getString("locator")))).click();
                    //div[@class='orderA__order' or @class=' orderA__order--read' or @class='orderA__order--paid'  or @class='orderA__order--premium']/div[@class='orderA__order__wrapper']/div[2]/button[1]
                    displayLog.append("["+subject+"]"+" is unwanted, looking for new orders... \n");
                    try{
                        order.findElement(By.xpath("//div[@class='orderA__order' or @class=' orderA__order--read' or @class='orderA__order--paid'  or @class='orderA__order--premium' or @class='orderA__order orderA__order--paid']/div[@class='orderA__order__wrapper']/div[2]/button[1]")).click();

                    }catch(Exception e){
                    break;
                    }
                    break;
                     
                  }else{
                      displayLog.append("Subject "+"["+subject+"]"+"\n");
                  }
                  
              
              }
                
                // end of check for unwanted orders
                //more
                try{
                    //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='orderA__order' or @class=' orderA__order--read' or @class='orderA__order--paid'  or @class='orderA__order--premium']/div[@class='orderA__order__wrapper']/div[@class='orderA__contentWrapper']/div[@class='orderA__wrapper']/div[@class='orderA__meta']/div[@class='orderA__actions']/button[contains(.,'More')]"))).click();
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(jsonArray.getJSONObject(4).getString("locator")))).click();
                    System.out.println("expand btn clicked");
                    displayLog.append("Bidding order... \n");
                    
                }catch(ElementClickInterceptedException e){
                    displayLog.append("clicking the more button was intercepted, fixing... \n");
//                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@aria-label='Close']"))).click();
//                    driver.findElement(By.xpath("//span[@aria-label='Close']")).click();
                    Config.errorFileWriter(e.toString());
                    break;
                }
                catch(StaleElementReferenceException e){
                    Config.errorFileWriter(e.toString());
                    displayLog.append("the \"more\" button is stale, fixing... \n");
                    break;
                    //this will try clicking the element again and refreshes on failure
//                    if(retryingFindClick(driver,"//button[contains(., 'More')]")==false){
//                        driver.navigate().refresh();
//                        continue;
//                    }
                }
                catch(Exception e){
                    Config.errorFileWriter(e.toString());
                    displayLog.append("failed to click the more button, fixing... \n");
                    break;
                }
              
                 

                //click start bidding button
                try{
                   //start_bidding 
                   //div[@class='orderA__order' or @class=' orderA__order--read' or @class='orderA__order--paid'  or @class='orderA__order--premium'or @class='orderA__order orderA__order--paid']/div[@class='orderA__order__wrapper']/div[@class='orderA__contentWrapper']/div[@class='ui-collapse-item ui-collapse-item-active']/div[@class='ui-collapse-content ui-collapse-content-active']/div/div/div/div[2]/button
                  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(jsonArray.getJSONObject(7).getString("locator")))).click();
//                  order.findElement(By.xpath(jsonArray.getJSONObject(7).getString("locator"))).click();
                }
                catch(NoSuchElementException e){
//                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@aria-label='Close']")));
                    Config.errorFileWriter(e.toString());
//                    driver.navigate().refresh();
                    break;
                }
                catch(Exception e){
                    displayLog.append("Failed to click the start bidding button[1]... \n");
                    Config.errorFileWriter(e.toString());
//                    driver.navigate().refresh();
                    break;
                }
                //end of click start bidding button  
       
                  //message_dropDown
                  try{
                       //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='styled__Field-sc-13g4w8f-1 ePCfsj'])[last()]"))).click();
                       wait.until(ExpectedConditions.elementToBeClickable(By.xpath(jsonArray.getJSONObject(8).getString("locator")))).click();
                     }catch(Exception e){
                        displayLog.append("message placing failed,looking for a fix... \n"); 
                        driver.navigate().refresh();
                        Config.errorFileWriter(e.toString());
                        Thread.sleep(delay*1000);
                        break;
                    }
                    
                    //message_select    
                        try{
                        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='styled__Wrapper-sc-4f1cbs-0 gTBVTO'])[last()]"))).click();
                        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(jsonArray.getJSONObject(9).getString("locator")))).click();
                        System.out.println("message placed"); 
                        displayLog.append("message placed \n");
                        }catch(Exception e){
                        System.out.println("message was not selected");  
                        displayLog.append("message was not selected \n");
                        driver.navigate().refresh();
                        Config.errorFileWriter(e.toString());
                        Thread.sleep(delay*1000);
                        break;
                        }
                    //end of message placing
                    if(!priceLevel.equalsIgnoreCase("none")){   
                        minPrice=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(jsonArray.getJSONObject(10).getString("locator")))).getText().substring(1);
                        avPrice=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(jsonArray.getJSONObject(11).getString("locator")))).getText().substring(1);
                        maxPrice=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(jsonArray.getJSONObject(12).getString("locator")))).getText().substring(1);
                        
                        //price_input
                        WebElement inputAmount=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(jsonArray.getJSONObject(13).getString("locator"))));

                            switch(priceLevel){
                                case "Minimum":
                                    inputAmount.sendKeys(minPrice);
                                    displayLog.append("price set: "+"$ "+minPrice+"\n");
                                    break;
                                case "Average":
                                    inputAmount.sendKeys(avPrice);
                                    displayLog.append("price set: "+"$ "+avPrice+"\n");
                                    break;
                                case "Maximum":
                                    inputAmount.sendKeys(maxPrice);
                                    displayLog.append("price set: "+"$ "+maxPrice+"\n");
                                    break;
                                default:
                                    //inputAmount.sendKeys(" ");
                                    break;    
                            }
                            
                    }
                   //end of check price level
                   
                        //start_bidding
                        try{
                        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(jsonArray.getJSONObject(14).getString("locator")))).click();
                        }
                        catch(Exception e){
                        driver.navigate().refresh();
                        Config.errorFileWriter(e.toString());
                        Thread.sleep(delay*1000);
                        break;
                        }
                        displayLog.append("-----------------------------------------------------------------------------"+"\n");
                        
                        
                        //if its one bid per refresh
                        System.out.println(refreshAfterBid);
                        if(refreshAfterBid){    
                            try{
                            List<WebElement>closeReads=waitKiasi.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(jsonArray.getJSONObject(16).getString("locator"))));
                            for(WebElement closeRead:closeReads){
                                closeRead.click();
                            }
                            displayLog.append("refreshing..... "+"\n");
                            }
                            catch(Exception e){
                            break;    
                            }
                            
                            break;
                        }
                        
               
        }
                        //closing all unwanteds
//                         if(unwantedsZiko){
//                            displayLog.append("clearing unwanted subjects..... "+"\n");
//                            for (WebElement anOrder : orders) {
//                                //div[@class='orderA__order' or @class=' orderA__order--read' or @class='orderA__order--paid'  or @class='orderA__order--premium' or @class='orderA__order orderA__order--paid']/div[@class='orderA__order__wrapper']/div[@class='orderA__contentWrapper']/div[@class='orderA__wrapper']/div[@class='orderA__content']/div[@class='orderA__category']
//                                String subjectPlusType=anOrder.findElement(By.xpath("//div[@class='orderA__order__wrapper']/div[@class='orderA__contentWrapper']/div[@class='orderA__wrapper']/div[@class='orderA__content']/div[@class='orderA__category']")).getText();
//                                String[] subjectPlusTypeArray = subjectPlusType.split(",");
//                                String subject;
//                                try {
//                                    subject = subjectPlusTypeArray[1];
//                                } catch (ArrayIndexOutOfBoundsException e) {
//                                    subject = "nothing";
//                                }
//
//                                subject = subject.trim().toLowerCase();
//
//                                if (!list.contains(subject)) {
//                                    //close
//                                    waitx2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='orderA__order' or @class=' orderA__order--read' or @class='orderA__order--paid'  or @class='orderA__order--premium']/div[@class='orderA__order__wrapper']/div[2]/button[1]"))).click();                                    //div[@class='orderA__order' or @class=' orderA__order--read' or @class='orderA__order--paid'  or @class='orderA__order--premium']/div[@class='orderA__order__wrapper']/div[2]/button[1]
//                                }
//                            unwantedsZiko=false;
//                            displayLog.append("-----------------------------------------------------------------------------"+"\n");
//                          }
//                         }
                         
        driver.navigate().refresh();
        }
        
    
   
   
   }
   
   public static void exitBrowser(WebDriver driver){
       driver.close();
   }
   
   
}
