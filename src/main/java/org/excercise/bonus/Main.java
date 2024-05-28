package org.excercise.bonus;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        BigDecimal km;

        System.out.println("Insert name:");
        name = scanner.nextLine();
        System.out.println("Insert age");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Insert km");
        km = new BigDecimal(scanner.nextLine());

        Ticket ticket = new Ticket(name, age, km);
        System.out.println(ticket.toString());
        scanner.close();
    }
}
