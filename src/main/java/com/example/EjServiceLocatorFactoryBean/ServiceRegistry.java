package com.example.EjServiceLocatorFactoryBean;

import com.example.EjServiceLocatorFactoryBean.application.adapter.AdapterEmpresaService;
import org.springframework.stereotype.Service;

//Interfaz que se pasa a ServiceLocatorFactoryBean
@Service
public interface ServiceRegistry {

    public AdapterEmpresaService getServiceByType(String type);
}
