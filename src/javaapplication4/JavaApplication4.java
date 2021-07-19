/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Karolayn Posada
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese dos numeros enteros separados por un espacio");
        String nombre = sc.nextLine();
        String[] numeros = nombre.split(" ");

        validarNumeros val = new validarNumeros();

        boolean aux = val.validarNumero(numeros[0]);
        boolean aux2 = val.validarNumero(numeros[1]);

        if (!aux || !aux2) {
            System.out.println("Validar Entrada se requieren numeros");
            main(args);
        } else {
            if (numeros.length != 2) {
                System.out.println("Tamaño invalido");
                main(args);
            } else {
                int n = Integer.parseInt(numeros[0]);
                int m = Integer.parseInt(numeros[1]);

                if ((n > 3 && n < pow(10, 7)) && (m > 1 && n < (pow(10, 5) * 2))) {
                    imprimirMatriz matriz = new imprimirMatriz();
                    matriz.crearMatriz(n, m);
                }else{
                    System.out.println("Numeros invalidos");
                    main(args);
                }

            }

        }

    }

}
