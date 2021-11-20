package com.company;

import java.time.LocalDate;
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        int month = input.nextInt();

        LocalDate date = LocalDate.of(2009,month,day);
        String dayOfWeek = date.getDayOfWeek().toString();
        dayOfWeek = dayOfWeek.charAt(0) + dayOfWeek.substring(1,dayOfWeek.length()).toLowerCase();

        System.out.println(dayOfWeek);
    }
}
