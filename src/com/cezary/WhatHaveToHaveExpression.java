package com.cezary;

import java.io.IOException;
import java.time.LocalDate;

/**
 * Small interface that shows how interfaces works and how we can use it to implement classes. Interfaces can implements
 * static methods and default methods
 */

interface WhatHaveToHaveExpression {
    static String options = "echo text - prints text on output\n" +
            "date - prints local date\n" +
            "options - show this\n" +
            "clear - clears the screen\n" +
            "version - shows version of terminal\n" +
            "exit - exit from terminal";

    void choice() throws IOException;

    String echoString();

    static String showOptions() { return options; }

    static int showDay() { return LocalDate.now().getDayOfMonth(); }

    static int showMonth() { return LocalDate.now().getMonthValue(); }

    static int showYear() { return LocalDate.now().getYear(); }

    static String showDate() {
        StringBuilder date = new StringBuilder();
        date.append(showDay() + " " + showMonth() + " " + showYear());

        return date.toString();
    }

    static String clearScreen() { return "\n\n\n\n\n\n\n\n\n\n"; }

    static void exit() { System.exit(0); }
}
