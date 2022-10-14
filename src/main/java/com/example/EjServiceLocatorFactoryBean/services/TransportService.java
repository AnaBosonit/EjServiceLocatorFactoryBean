package com.example.EjServiceLocatorFactoryBean.services;

import com.example.EjServiceLocatorFactoryBean.application.adapter.AdapterEmpresaService;
import org.springframework.stereotype.Service;

//A la anotación de Service le añadimos el nombre del servicio, que es con lo que se localizará el servicio
//requerido
@Service("transport")
public class TransportService implements AdapterEmpresaService {
    @Override
    public String marketingService() {
        System.out.println("Todos las formas de transporte al mejor precio!");

        return "Todos las formas de transporte al mejor precio!";
    }
}
