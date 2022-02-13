package com.company;

public class Main {

    public static void main(String[] args) {
        String bezhoznoeimuya = "Петя";
        Second person = new Second();
        person.name = "Некое имя";
        person.age = 20;

        int years = person.CalcYearsToRetirement();
        Second microchel = new Second();
        microchel.SetName(bezhoznoeimuya);//присваиваю имя через сеттер
    }
}
class Second {
    String name;
    int age;

    void SetName(String username){name = username;} //сеттер

    int CalcYearsToRetirement(){
        int years = age - 65;
        System.out.println("осталось "+years);
        return years;
    }
}