package br.edu.cs.poo.figurasgeometricas;

import listadois.Retangulo;

class Quadrado extends Retangulo {

    Quadrado(double lado){
        super(lado, lado);
    }

    public double obterLado(){
        return getLado();
    }
}
