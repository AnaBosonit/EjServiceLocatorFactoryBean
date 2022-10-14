package com.example.EjServiceLocatorFactoryBean.services;

import com.example.EjServiceLocatorFactoryBean.application.adapter.AdapterEmpresaService;
import org.springframework.stereotype.Service;

//A la anotación de Service le añadimos el nombre del servicio, que es con lo que se localizará el servicio
//requerido
@Service("food")
public class FoodService implements AdapterEmpresaService {
    @Override
    public String marketingService() {
        System.out.println("Ven a nuestros restaurantes, tenemos la comida más sabrossssssa");

        return "Ven a nuestros restaurantes, tenemos la comida más sabrossssssa";
    }
}
