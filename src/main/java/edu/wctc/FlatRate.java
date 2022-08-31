package edu.wctc;

import org.springframework.stereotype.Component;

@Component
public class FlatRate implements IShippingPolicy {

    @Override
    public void applyShipping(Sale sale) {
        sale.setShipping(4.95);
    }
}
