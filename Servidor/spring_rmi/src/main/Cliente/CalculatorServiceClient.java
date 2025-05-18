/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd.lab1;

/**
 *
 * @author arles
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculatorServiceClient {

    @Autowired
    private CalculatorService calculatorService;

    public void performOperations() {
        try {
            int sum = calculatorService.add(5, 3);
            int diff = calculatorService.subtract(10, 4);
            System.out.println("Suma: " + sum);
            System.out.println("Resta: " + diff);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
