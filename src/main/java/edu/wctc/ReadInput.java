package edu.wctc;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class ReadInput implements ISalesInput {

    @Override
    public List<Sale> getSales() {

        List<Sale> result = new ArrayList<>();
        BufferedReader br = null;

        try{
            br = new BufferedReader(new FileReader("src/main/java/edu/wctc/sales.txt"));

            String line;
            String[] pain;

            while ((line = br.readLine()) != null){
                pain = line.split(",");

                result.add(new Sale(pain[0], pain[1], Double.parseDouble(pain[2]), Double.parseDouble(pain[3])));
            }

        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }

        System.out.println(result.get(0));
        return result;

    }
}
