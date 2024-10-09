package org.example;

public class Person {
    String name;
    String post;
    String email;
    String phone;
    int salary;
    int age;

    public Person(String _name, String _post, String _email, String _phone, int _salary, int _age){
        name = _name;
        post = _post;
        email = _email;
        phone = _phone;
        salary = _salary;
        age = _age;
    }

     public void info(){
        System.out.println("Информация о сотруднике: ФИО - " + name + ", должность - " + post + ", email - " + email + ", телефон - " + phone + ", зарплата - " + salary + ", возраст - " + age);
    }
}
