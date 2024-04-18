package com.taraskina.top.hwspring01;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
@Component("onEnglishBean")
public class English implements Language{
    @Override
    public void printDay() {
        System.out.println(LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
    }
}
