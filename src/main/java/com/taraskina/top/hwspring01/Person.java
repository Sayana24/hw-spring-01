package com.taraskina.top.hwspring01;

public class Person {
    private Language day;

    public Person(Language day) {
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
