package com.example.EjServiceLocatorFactoryBean.config;

import com.example.EjServiceLocatorFactoryBean.ServiceRegistry;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpresaConfig {

    @Bean
    public ServiceLocatorFactoryBean factoryBean(){
    //En esta clase se crea la instancia de ServiceLocatorFactoryBean
    ServiceLocatorFactoryBean slfb = new ServiceLocatorFactoryBean();
    slfb.setServiceLocatorInterface(ServiceRegistry.class); //se establece la interfaz que va a usar el factory (ServiceRegistry)
    System.out.println("Creando el ServiceLocatorFactoryBean");
    return slfb;

    //ServiceLocatorFactoryBean ayuda a localizar la implementación del servicio que te interesa en tiempo de ejecución
    }

}
