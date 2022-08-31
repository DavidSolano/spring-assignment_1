package edu.wctc;

import org.springframework.stereotype.Component;

@Component
public class FreeShipping implements IShippingPolicy {

    @Override
    public void applyShipping(Sale sale) {
        sale.setShipping(0.00);
    }
}
