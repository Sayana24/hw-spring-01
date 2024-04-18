package com.taraskina.top.hwspring01;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class German implements Language{
    @Override
    public void printDay() {
        System.out.println(LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.GERMAN));
    }
}
