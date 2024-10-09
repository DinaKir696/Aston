package org.example;

public class Person {
    String name;
    String post;
    String email;
    String phone;
    int salary;
    int age;

    public Person(String name, String post, String email, String phone, int salary, int age){
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

     public void info(){
         System.out.println(String.format("Информация о сотруднике: ФИО - %s, должность - %s, email - %s, телефон - %s, зарплата - %s, возраст - %s",
                 name, post, email, phone, salary, age));
    }
}
