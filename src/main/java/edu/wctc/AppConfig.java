package edu.wctc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc")
public class AppConfig {

    @Bean
    public ISalesInput salesInput(){
        return new ReadInput();
    }

    @Bean
    public IShippingPolicy shippingPolicy(){
        return new FreeShipping();
    }

    @Bean
    public ISalesReport salesReport(){
        return new DetailSalesReport();
    }

}
