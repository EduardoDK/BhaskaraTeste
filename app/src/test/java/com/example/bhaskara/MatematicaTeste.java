package com.example.bhaskara;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MatematicaTeste {

    @Test

    public void calculaPotenciaInteiroPositivo(){

        double valorEsperado = 2;
        double base = 2;
        int    expoente = 1 ;
        double valorReal;

        Matematica m = new Matematica();

        valorReal = m.Exponenciacao(base , expoente);

        assertEquals(valorEsperado,valorReal,0.01);

    }
    @Test

    public void calculaPotenciaZero(){

        double valorEsperado = 1;
        double base = 2;
        int expoente = 0;
        double valorReal;

        Matematica m = new Matematica();

        valorReal = m.Exponenciacao(base,expoente);
        assertEquals(valorEsperado,valorReal ,0.01);

    }

    @Test

    public void calculaNegativo(){

        double valorEsperado = 0.125;
        double base = 2;
        int expoente = -3;
        double valorReal;

        Matematica m = new Matematica();

        valorReal = m.Exponenciacao(base,expoente);
        assertEquals(valorEsperado,valorReal ,0.01);

    }
    @Test
    public void calculaDeltaZero(){

        double entradaA,  entradaB, entradaC;
        entradaA = 1.0;
        entradaB = -2.0;
        entradaC =1.0;
        double valorEsperado = 0.0;
        double valorReal;
        Matematica m = new Matematica();
        valorReal = m.calculaDelta(entradaA,entradaB,entradaC);

        assertEquals(valorEsperado,valorReal,0.01);


    }
    @Test
    public void calculaDeltaPositivo(){

        double entradaA,  entradaB, entradaC;
        entradaA = 1.0;
        entradaB = -1.0;
        entradaC =-2.0;
        double valorEsperado = 9.0;
        double valorReal;
        Matematica m = new Matematica();
        valorReal = m.calculaDelta(entradaA,entradaB,entradaC);

        assertEquals(valorEsperado,valorReal,0.01);


    }
    @Test
    public void calculaDeltaNegativo(){

        double entradaA,  entradaB, entradaC;
        entradaA = 2.0;
        entradaB = -3.0;
        entradaC =4.0;
        double valorEsperado = -23.0;
        double valorReal;
        Matematica m = new Matematica();
        valorReal = m.calculaDelta(entradaA,entradaB,entradaC);

        assertEquals(valorEsperado,valorReal,0.01);


    }







}
