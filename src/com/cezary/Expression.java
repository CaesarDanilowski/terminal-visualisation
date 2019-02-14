package com.cezary;

import java.time.LocalDate;

/**
 * TODO Add more options to make terminal more real: make file, make directory, etc.
 */

public class Expression implements WhatHaveToHaveExpression {
    private String command;
    private String arg;

    public Expression(String command, String argument) {
        this.command = command;
        this.arg = argument;
    }

    public Expression(String command) {
        this.command = command;
    }

    public void choice() {
       if (command.equals("options")) System.out.println(showOptions());
        else if (command.equals("echo")) System.out.println(echoString());
        else if (command.equals("date")) System.out.println(showDate());
        else if (command.equals("clear")) System.out.println(clearScreen());
        else if (command.equals("version")) System.out.println(getVersion());
        else System.out.println("There isn't such command!");
    }

    public String echoString() { return arg; }

    public static String showOptions() { return options; }

    private static int showDay() { return LocalDate.now().getDayOfMonth(); }

    private static int showMonth() { return LocalDate.now().getMonthValue(); }

    private static int showYear() { return LocalDate.now().getYear(); }

    public static String showDate() {
        StringBuilder date = new StringBuilder();
        date.append(showDay() + " " + showMonth() + " " + showYear());

        return date.toString();
    }

    public static String clearScreen() { return "\n\n\n\n\n\n\n\n\n\n"; }

    public static String getVersion() { return "Terminal v1.0 02.01.2019"; }

    public static void exit() {
        System.exit(0);
    }
}