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
   
   public static void bid(WebDriver driver,int delay,String priceLevel) throws InterruptedException, IOException{
       int errorHeperer=0;
        int i=0;     
        JSONArray jsonArray = Bot.selectors();
        WebDriverWait wait=new WebDriverWait(driver,15);
        WebDriverWait waitKiasi=new WebDriverWait(driver,3);
       //first time refresh
        if(errorHeperer==0){
           errorHeperer++;
           driver.navigate().refresh();
        }
        //end of first time refresh
        //order_list
        while(i>=0){
        List<WebElement> orders=driver.findElements(By.xpath(jsonArray.getJSONObject(3).getString("locator")));
        
        //*if no new order,wait before refresh
        if(orders.size()<=0){
           driver.manage().timeouts().implicitlyWait(delay, TimeUnit.SECONDS);
           orders=driver.findElements(By.xpath(jsonArray.getJSONObject(3).getString("locator")));
        }
      
        for(WebElement order:orders){
            if(orders.isEmpty()){break;}
                //more
                try{
                    wait.until(ExpectedConditions.elementToBeClickable(By.xpath(jsonArray.getJSONObject(4).getString("locator")))).click();
                }catch(Exception e){
                    break;
                }
        
                //click start bidding button
                try{
                   //start_bidding 
                  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(jsonArray.getJSONObject(7).getString("locator")))).click();
                }
                catch(Exception e){
                    break;
                }
       
                  //message_dropDown
                  try{
                       wait.until(ExpectedConditions.elementToBeClickable(By.xpath(jsonArray.getJSONObject(8).getString("locator")))).click();
                     }catch(Exception e){
                        break;
                    }
                    
                    //message_select    
                        try{
                        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(jsonArray.getJSONObject(9).getString("locator")))).click();
                        }catch(Exception e){
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
                                    break;
                                case "Average":
                                    inputAmount.sendKeys(avPrice);
                                    break;
                                case "Maximum":
                                    inputAmount.sendKeys(maxPrice);
                                    break;
                                default:
                                    //inputAmount.sendKeys(" ");
                                    break;    
                            }
                            
                    }
                   //end of check price level
                   
                        //start_bidding 2
                        try{
                        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(jsonArray.getJSONObject(14).getString("locator")))).click();
                        }
                        catch(Exception e){
                        break;
                        }
                //one bid per refresh   
                        break;
        }
                   
                         
        driver.navigate().refresh();
        }
   }
   
   public static void exitBrowser(WebDriver driver){
       driver.close();
   }
   
   
}
