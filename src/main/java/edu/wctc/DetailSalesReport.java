package edu.wctc;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DetailSalesReport implements ISalesReport {
    @Override
    public void generateReport(List<Sale> saleList) {

        System.out.println("Summary Report\n");

        System.out.printf("%-20s%-20s%-20s%-20s%-20s%n", "Name", "Country", "Amount", "Tax", "Shipping");

        var counter = 0;

        while (counter < 90){
            System.out.print("-");

            counter++;
        }
        System.out.println("");

        for (Sale sale: saleList) {
            System.out.printf("%-20s", sale.getCustomer());
            System.out.printf("%-20s", sale.getCountry());
            System.out.printf("%-20s", sale.getAmount());
            System.out.printf("%-20s", sale.getTax());
            System.out.printf("%-20s%n", sale.getShipping());
        }

    }
}
