package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray [0] = new Person("Иванов Сергей Петрович", "директор", "director@mail.ru", "+79582652486", 10000000, 45);
        persArray [1] = new Person("Васина Ольга Сергеевна", "администратор", "olgaV@bk.ru", "89563254895", 50000, 25);
        persArray [2] = new Person("Петров Иван Васильевич", "механик", "mashina@mail.ru", "+79513832532", 30000, 35);
        persArray [3] = new Person("Сидорова Светлана Викторовна", "бухгалтер", "dengi_moi@bk.ru", "89546852468", 50000, 40);
        persArray [4] = new Person("Васечкин Петр Иванович", "дворник", "mety@mail.ru", "89563255723", 20000, 62);

        persArray [3].info();

        Park.Attraction attraction1= new Park.Attraction(); // на всякий случай заполнила
        attraction1.title = "Ромашка";
        attraction1.time = "9:00-20:00";
        attraction1.price = 200;
    }


}