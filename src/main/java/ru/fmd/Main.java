package ru.fmd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        var name = "";

        System.out.println("Как тебя зовут?");
        name = scan.nextLine();
        System.out.printf("Привет, %s!", name);
    }
}