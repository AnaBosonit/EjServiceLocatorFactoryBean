package com.example.EjServiceLocatorFactoryBean.infrastructure.controller;

import com.example.EjServiceLocatorFactoryBean.ServiceRegistry;
import com.example.EjServiceLocatorFactoryBean.domain.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmpresaController {
    @Autowired
    ServiceRegistry serviceRegistry;

    @GetMapping("/getService/{typeEmpresa}")
    public void getPubli(@PathVariable String typeEmpresa){
        System.out.println("En el controlador");

        serviceRegistry.getServiceByType(typeEmpresa).marketingService();
        //según el typeEmpresa, que ha de coincidir con el nombre que viene en la anotación @Service de cada servicio
        //se selecciona el servicio en cuestión y se ejecuta su marketingService(), definido en Adapter,
        // ya que los distintos tipos de servicios implementan esa interfaz
    }


}
