package com.taraskina.top.hwspring01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("personBean")
public class Person {
    private Language day;
@Autowired

    public Person(@Qualifier("onItalianBean") Language day) {
        this.day = day;
    }
    public void sayDay(){
        System.out.println("What day of the week is it today?");
        day.printDay();
    }

    public void setDay(Language day) {
        this.day = day;
    }
}
