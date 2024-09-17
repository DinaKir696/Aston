package org.example;
import java.lang.String;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(printThreeWords());
        System.out.println(checkSumSign());
        System.out.println(printColor());
        System.out.println(compareNumers());
        System.out.println(sumInt());
        System.out.println(nul());
        System.out.println(nul2());
        System.out.println(repeat());
        System.out.println(ears());
        System.out.println(nulOne());
        System.out.println(massivSto());
        System.out.println(lessSix());
        System.out.println(createKub());
        System.out.println(createArrae());
    }




    public static String printThreeWords(){
        String[] threeWords = {"Orange", "Banana", "Apple"};
        int i;
        for (i=0; i<threeWords.length; i++) {
            System.out.println (threeWords[i]);
        }
        return "";
    }
    public static String checkSumSign() {
        int a = 2;
        int b = 6;
        int sum = a + b;
        if (sum >= 0) {
            return  "Сумма положительная";
        }
        if (sum < 0) {
            return "Сумма отрицательная";
        }
        return "";
    }
    public static String printColor() {
        int value = 56;
        if (value <=0) {
            return "Красный";
        }
        if (value > 0 & value <=100) {
            return "Желтый";
        }
        if (value>100) {
            return "Зеленый";
        }
        return "";
    }
    public static String compareNumers() {
        int a = 15;
        int b = 85;
        if (a >=b){
            return "a >= b";
        }
        if (a < b) {
            return "a < b";
        }
        return "";
    }
    public static boolean sumInt (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввведите первое число");
        int a = scan.nextInt();
        System.out.println("Ввведите второе число");
        int b = scan.nextInt();
        boolean c = a+b >= 10 & a+b <= 20;
        return (c);

    }
    public static String nul () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввведите число");
        int a = scan.nextInt();
        if (a >=0){
            return "Число положителное";
        }
        if (a < 0) {
            return "Число отрицательное";
        }
        return "";
    }
    public static boolean nul2 () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввведите число");
        int a = scan.nextInt();
        boolean c = a < 0;
        return (c);
    }
    public static String repeat () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввведите строку");
        String string = scan.nextLine();
        System.out.println("Ввведите число повторений");
        int a = scan.nextInt();
        return (string.repeat(a));
    }
    public static boolean ears (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввведите год");
        int a = scan.nextInt();
        if (a<100) {
            int c = a % 4;
            boolean d = c==0;
            return (d);
        }
        if (a>=100) {
            int c = a % 400;
            boolean d = c==0;
            return (d);
        }
        return false;
    }
    public static String nulOne () {
        int i;
        int[] nuleOne = {1, 0, 0, 0, 1, 1, 0, 1};
        for (i = 0; i < nuleOne.length; i++) {
            if (nuleOne[i] == 1) {
                nuleOne[i] = 0;
            } else {
                nuleOne[i] = 1;
            }
        }
        return (Arrays.toString(nuleOne));
    }
    public static String massivSto () {
        int[] sto = new int[100];
        for (int i = 0; i < sto.length; i++) {
            sto[i] = i+1;
        }
        return (Arrays.toString(sto));
    }
    public static String lessSix () {
        int[] six = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i<six.length; i++) {
            if (six[i]<6) {
                six [i] = six[i]*2;
            }
        }
        return (Arrays.toString(six));
    }
    public static String createKub (){
        int [] [] kub= new int [5] [5];
        for (int i = 0; i<kub.length; i++){
            for (int j=0; j<5; j++) {
                if (i==j) {
                    kub[i][j]=1;
                }
                kub [i][4-i]=1;
            }
        }
         Arrays.stream(kub).map(Arrays::toString).forEach(System.out::println);
        return "";
    }
    public static String createArrae () {
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввведите длину массива");
        int len = scan.nextInt();
        System.out.println("Ввведите значение ячеек массива");
        int initialValue = scan.nextInt();
        int [] nnn = new int[len];
        for (i=0; i<nnn.length; i++){
            nnn[i] = initialValue;
        }
        return (Arrays.toString(nnn));
    }
}
