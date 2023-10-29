/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardo.gonzalez.uabc.ejerciciosmatriz;

/**
 *
 * @author israe
 */
import java.util.Random;

public class NumeroRacional {
    private int numerador;
    private int denominador;

    public NumeroRacional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    
    public static NumeroRacional generarNumeroRacional() {
        Random random = new Random();
        int numerador = random.nextInt(101); 
        int denominador = random.nextInt(100) + 1; 
        return new NumeroRacional(numerador, denominador);
    }
    
    public int getNumerador()
    {
        return numerador;
    }
    
    public int getDenominador()
    {
        return denominador;
    }
    
    public String toString() {
        return numerador + "/" + denominador;
    }
    
    
}
