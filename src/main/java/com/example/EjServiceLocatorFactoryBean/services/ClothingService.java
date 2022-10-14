package com.example.EjServiceLocatorFactoryBean.services;

import com.example.EjServiceLocatorFactoryBean.application.adapter.AdapterEmpresaService;
import org.springframework.stereotype.Service;

//A la anotación de Service le añadimos el nombre del servicio, que es con lo que se localizará el servicio
//requerido
@Service("clothing")
public class ClothingService implements AdapterEmpresaService {
    @Override
    public String marketingService() {
        System.out.println("Ofrecemos las mejores prendas al mejor precio!");

        return "Ofrecemos las mejores prendas al mejor precio!";
    }
}
