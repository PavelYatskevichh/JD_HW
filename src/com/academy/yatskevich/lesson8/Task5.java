package com.academy.yatskevich.lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String string = "+20667026407+6sdga04706+14+6716761616  zxvzx 66+7adg20710adsg67206770 60606+0 asdg+6060616";
        printPhoneNumbers(string);
    }

    public static void printPhoneNumbers(String str) {
        Pattern pattern = Pattern.compile("[+]\\d{7,14}");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
