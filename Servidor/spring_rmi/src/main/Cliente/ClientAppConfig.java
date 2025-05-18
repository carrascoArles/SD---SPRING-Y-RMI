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
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@Configuration
public class ClientAppConfig {

    @Bean
    public RmiProxyFactoryBean calculatorService() {
        RmiProxyFactoryBean proxy = new RmiProxyFactoryBean();
        proxy.setServiceUrl("rmi://localhost:1099/CalculatorService");
        proxy.setServiceInterface(CalculatorService.class);
        return proxy;
    }

    @Bean
    public CalculatorServiceClient calculatorServiceClient() {
        return new CalculatorServiceClient();
    }
}
