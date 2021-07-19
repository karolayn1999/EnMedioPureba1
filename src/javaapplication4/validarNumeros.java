/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Karolayn Posada
 */
public class validarNumeros {

    public boolean validarNumero(String numero) {
        try {
            Integer.parseInt(numero);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public int numeroMayor(int[][] matriz) {
        int mayor = matriz[0][0];

        for (int x = 1; x < matriz.length; x++) {
            for (int i = 0; i < matriz[x].length; i++) {
                if (matriz[x][i] > mayor) {
                    mayor = matriz[x][i];
                }

            }

        }
        
        System.out.println(mayor);

        return mayor;
    }

}
