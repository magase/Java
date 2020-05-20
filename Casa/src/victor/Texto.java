package victor;
import java.util.Scanner;

class Texto {

    String texto;

    public Texto(String texto) {

    this.texto=texto;

}

public static void main(String[] args) {

    Texto palabra1=new Texto("Palabra");

    Texto palabra2=new Texto("PALABRA");

    if(palabra1.toString().equalsIgnoreCase(palabra2.toString()))

        System.out.println("Son iguales");

    else System.out.println("Son diferentes");

    }

}