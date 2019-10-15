package com.example.daggertwoexampleb;

import java.util.Random;

import dagger.Module;
import dagger.Provides;

@Module
public class RandomInjectionModule {

    private static Sangue sangue;

    public RandomInjectionModule(){

    }

    @Provides
    static Sangue provideSangue(){

        if(sangue != null){
            return sangue;
        }

        Random rdn = new Random();
        int rdnNumber = rdn.nextInt(3);

        switch(rdnNumber){

            case 0: sangue = new Sangue_A(); break;
            case 1: sangue = new Sangue_B(); break;
            case 2: sangue = new Sangue_AB(); break;
            case 3: sangue = new Sangue_O(); break;
            default: sangue = new Sangue_A();

        }
        return sangue;
    }

}
