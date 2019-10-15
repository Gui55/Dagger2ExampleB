package com.example.daggertwoexampleb;

import javax.inject.Inject;

public class Corpo {

    @Inject
    public Sangue sangue;

    @Inject //Com isso, o Dagger injeta a classe Corpo em outra classe quando necessário
    public Corpo(){}

    public Sangue getSangue(){
        return sangue;
    }

    public void setSangue(Sangue sangue){
        this.sangue = sangue;
    }

}
