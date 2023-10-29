/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gerardo.gonzalez.uabc.ejerciciosmatriz;
import java.util.ArrayList;
/**
 *
 * @author israe
 */
public class EjerciciosMatriz {

    public static void main(String[] args) {
       
        MatrizNumerosRacionales matriz = new MatrizNumerosRacionales();
        matriz.llenarMatriz();

        
        Vector vector = new Vector();

        // Iterar a través de la matriz y agregar los números racionales al vector
        for (int i = 0; i < matriz.getFilas(); i++) {
            for (int j = 0; j < matriz.getColumnas(); j++) {
                NumeroRacional numeroRacional = matriz.getNumeroRacional(i, j);
                vector.agregarNumeroRacional(numeroRacional);
            }
        }

        // Obtener los números racionales mayores a 1 del vector
        ArrayList<NumeroRacional> numerosMayoresAUno = vector.obtenerNumerosMayoresAUno();

        // Ahora tienes todos los números racionales mayores a 1 en la lista `numerosMayoresAUno`
        System.out.println("Números racionales mayores a 1 en la matriz:");
        for (NumeroRacional numeroRacional : numerosMayoresAUno) {
            System.out.println(numeroRacional);
        }
    }
    
   
}

