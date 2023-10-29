/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardo.gonzalez.uabc.ejerciciosmatriz;

/**
 *
 * @author israe
 */
import java.util.ArrayList;

public class Vector {
    private ArrayList<NumeroRacional> numerosRacionales;

    public Vector() {
        numerosRacionales = new ArrayList<>();
    }

    public void agregarNumeroRacional(NumeroRacional numeroRacional) {
        numerosRacionales.add(numeroRacional);
    }

    public ArrayList<NumeroRacional> obtenerNumerosMayoresAUno() {
        ArrayList<NumeroRacional> numerosMayoresAUno = new ArrayList<>();
        
        for (NumeroRacional numeroRacional : numerosRacionales) {
            double valor = (double) numeroRacional.getNumerador() / numeroRacional.getDenominador();
            if (valor > 1.0) {
                numerosMayoresAUno.add(numeroRacional);
            }
        }
        
        return numerosMayoresAUno;
    }
}

