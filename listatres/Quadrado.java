package listatres;

import listadois.Retangulo;

public class Quadrado extends Retangulo {

    public Quadrado(double lado){
        super(lado, lado);
    }

    public double obterLado(){
        return getLado();
    }
}
