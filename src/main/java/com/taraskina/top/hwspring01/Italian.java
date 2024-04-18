package com.taraskina.top.hwspring01;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
@Component("onItalianBean")
public class Italian implements Language{
    @Override
    public void printDay() {
        System.out.println(LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALIAN));
    }
}
