package com.bbs.test;

import com.bbs.NextWorkingDay;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        Logger logger = Logger.getLogger("Test");

        logger.log(Level.INFO, String.valueOf(localDate.with(new NextWorkingDay())));
    }
}
