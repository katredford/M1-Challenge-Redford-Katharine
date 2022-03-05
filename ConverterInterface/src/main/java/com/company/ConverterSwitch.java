package com.company;

import com.company.Interface.Converter;

public class ConverterSwitch implements Converter {

    @Override
    public String convertMonth(int monthNumber) {
        switch(monthNumber){
            case 12:
                return "December";
            case 11:
                return "November";
            case 10:
                return "October";
            case 9:
                return "September";
            case 8:
                return "August";
            case 7:
                return "July";
            case 6:
                return "June";
            case 5:
                return "May";
            case 4:
                return "April";
            case 3:
                return "March";
            case 2:
                return "February";
            case 1:
                return "January";
            default:
                return "Must be a number between 1 and 12";
        }

    }

    @Override
    public String convertDay(int dayNumber) {
        switch (dayNumber){
            case 7:
                return "Saturday";
            case 6:
                return "Friday";
            case 5:
                return "Thursday";
            case 4:
                return "Wednesday";
            case 3:
                return "Tuesday";
            case 2:
                return "Monday";
            case 1:
                return "Sunday";
            default:
                return "Must be a number between 1 and 7";
        }

    }
}
