package edu.wctc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ApplicationThing {

    ISalesReport salesReport;
    ISalesInput salesInput;
    IShippingPolicy shippingPolicy;

    @Autowired
    public ApplicationThing(ISalesReport salesReport, ISalesInput salesInput, IShippingPolicy shippingPolicy) {
        this.salesReport = salesReport;
        this.salesInput = salesInput;
        this.shippingPolicy = shippingPolicy;
    }


    public void generateReport(){
        List<Sale> allSales = salesInput.getSales();
        for(Sale aSale : allSales)
            shippingPolicy.applyShipping(aSale);
        salesReport.generateReport(allSales);
    }

}
