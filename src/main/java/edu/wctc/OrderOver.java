package edu.wctc;

import org.springframework.stereotype.Component;

@Component
public class OrderOver implements IShippingPolicy {
    @Override
    public void applyShipping(Sale sale) {
        if (sale.getAmount() > 100){
            sale.setShipping(0.00);
        }
    }
}
