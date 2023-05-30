package com.parkinghamzamar.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ismael
 */
public class Utils {

    public static String fechaActual() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date = new Date();
        return sdf.format(date);
    }

    public Date stringToDate(String fechaString) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date = null;
        try{
            date = sdf.parse(fechaString);
        }catch(ParseException e){
            System.out.println("");
        }
        return date;
    }
}
