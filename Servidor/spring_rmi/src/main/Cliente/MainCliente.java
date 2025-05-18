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
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainCliente {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ClientAppConfig.class);
        CalculatorServiceClient client = context.getBean(CalculatorServiceClient.class);
        client.performOperations();
        context.close();
    }
}