package edu.wctc;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class ConsoleInput implements ISalesInput {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public List<Sale> getSales() {

        System.out.println("enter your name: ");
        String name = scanner.nextLine();

        System.out.println("enter your country: ");
        String country = scanner.nextLine();

        System.out.println("enter your amount. not including tax: ");
        double amount = Double.parseDouble(scanner.nextLine());

        System.out.println("enter your tax: ");
        double tax = Double.parseDouble(scanner.nextLine());

        List<Sale> listo = new ArrayList<>();

        listo.add(new Sale(name, country, amount, tax));

        return listo;
    }
}
