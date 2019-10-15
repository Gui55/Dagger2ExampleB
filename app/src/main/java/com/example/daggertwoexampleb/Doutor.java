package com.example.daggertwoexampleb;

import dagger.Component;

@Component(modules = RandomInjectionModule.class)
public interface Doutor {

    Corpo injetarSangue();

}
