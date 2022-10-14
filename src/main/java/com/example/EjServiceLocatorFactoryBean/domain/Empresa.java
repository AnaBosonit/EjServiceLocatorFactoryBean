package com.example.EjServiceLocatorFactoryBean.domain;

import lombok.*;

import javax.persistence.Entity;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Empresa {
    private String name;
    private String type;

}
