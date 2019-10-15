package com.example.daggertwoexampleb;

import javax.inject.Inject;

public class Pessoa {

    Corpo corpo;

    @Inject public Pessoa(Corpo corpo){

        this.corpo = corpo;

    }

}
