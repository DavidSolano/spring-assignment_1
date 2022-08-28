package edu.wctc;

public class ReportStuff {
    public void generateReport() {
        List<Sale> allSales = salesInput.getSales();
        for (Sale sales : allSales){
            shippingPolicy.applyShipping(sales);
        }
        salesReport.generateReport(allSales);
    }
}
