package edu.wctc;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SummarySalesReport implements ISalesReport {
    @Override
    public void generateReport(List<Sale> saleList) {
        System.out.println("Summary Report\n");

        System.out.printf("%-20s%-20s%-20s%-20s%n", "Country", "Amount", "Tax", "Shipping");

        for (int i = 0; i < 70; i++) {
            System.out.print("-");
        }
        System.out.println("");

        for (Sale sale: saleList) {
            System.out.printf("%-20s", sale.getCountry());
            System.out.printf("%-20s", sale.getAmount());
            System.out.printf("%-20s", sale.getTax());
            System.out.printf("%-20s%n", sale.getShipping());
        }
    }
}
