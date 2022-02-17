package com.company;

import com.company.Interface.Converter;

public class ConverterApplication {
    public static void main(String[] args) {
        Converter converterIf = new ConverterIf();
        Converter converterSwitch = new ConverterSwitch();

        String dayOfWeek = converterIf.convertDay(1);
        System.out.println(dayOfWeek);
        String notOfWeek = converterIf.convertDay(45);
        System.out.println(notOfWeek);

        String month = converterIf.convertMonth(8);
        System.out.println(month);
        String notMonth = converterIf.convertMonth(30);
        System.out.println(notMonth);

        String switchDay = converterSwitch.convertDay(2);
        System.out.println(switchDay);
        String switchNotd = converterSwitch.convertDay(12);
        System.out.println(switchNotd);

        String switchMonth = converterSwitch.convertMonth(9);
        System.out.println(switchMonth);
        String switchNotm = converterSwitch.convertMonth(17);
        System.out.println(switchNotm);

    }
}
