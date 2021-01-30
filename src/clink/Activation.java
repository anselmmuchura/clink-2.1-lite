/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clink;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author alvo
 */
public class Activation {
    public static int activationStatus(String endDay){
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String dateToday = df.format(new Date());
        
	 String dateBeforeString = dateToday;
	 String dateAfterString = endDay;
         float daysBetween=0;
         int daysBetweenInt=0;
	 try {
	       Date dateBefore = df.parse(dateBeforeString);
	       Date dateAfter = df.parse(dateAfterString);
	       long difference = dateAfter.getTime() - dateBefore.getTime();
	       daysBetween = (difference / (1000*60*60*24));
               daysBetweenInt=Math.round(daysBetween);
               
	 } catch (ParseException e) {
	       //e.printStackTrace();
	 }

        return daysBetweenInt;
    } 
}
