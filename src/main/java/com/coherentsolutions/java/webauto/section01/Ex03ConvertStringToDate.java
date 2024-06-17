package com.coherentsolutions.java.webauto.section01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex03ConvertStringToDate {
    public static void main(String args[]) {
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        // G - era
        // M - month
        // m - minutes
        // w - week in year
        // W - week in month
        // H - 0-24
        // h - A.M/P.M
        String str = args.length == 0 ? "2011-13-11" : args[0];

        System.out.print("String " + str + " parsed as ");
        Date parsingDate;
        try {
            parsingDate = ft.parse(str);
            System.out.println(parsingDate);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }
    }
}

