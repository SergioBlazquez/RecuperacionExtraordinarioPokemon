package sample;

import java.util.ArrayList;

public class Pokemon {

    public String nombre;
    public int nivel;
    public int vidaActual;
    public int psMax;
    public char genero;

    public String habilidad;
    public String objeto;

    public int ataque;
    public int defensa;
    public int atcEsp;
    public int defEsp;
    public  int velocidad;


    public Pokemon(String nombre, int nivel, int vidaActual, int psMax, char genero, String habilidad, String objeto, int ataque, int defensa, int atcEsp, int defEsp, int velocidad){

        this.nombre=nombre;
        this.nivel=nivel;
        this.vidaActual =vidaActual;
        this.psMax =psMax;
        this.genero=genero;
        this.habilidad=habilidad;
        this.objeto=objeto;
        this.ataque=ataque;
        this.defensa=defensa;
        this.atcEsp=atcEsp;
        this.defEsp=defEsp;
        this.velocidad=velocidad;

    }
}
