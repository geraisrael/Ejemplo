/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerardo.gonzalez.uabc.ejerciciosmatriz;

/**
 *
 * @author israe
 */
public class MatrizNumerosRacionales {
    private int filas = 5; 
    private int columnas = 5; 
    private NumeroRacional[][] matriz;

    public MatrizNumerosRacionales()
    {
        matriz = new NumeroRacional[filas][columnas];
    }
    
    public void llenarMatriz()
    {
        //llena la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = NumeroRacional.generarNumeroRacional();
            }
        }

        // Imprimir la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public int getFilas()
    {
        return filas;
    }
    
    public int getColumnas()
    {
        return columnas;
    }
    
    public NumeroRacional getNumeroRacional(int i, int j) {
        if (i >= 0 && i < filas && j >= 0 && j < columnas) {
            return matriz[i][j];
        } else {
             return null; 
        }
    }
    
}
