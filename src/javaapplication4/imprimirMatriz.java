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
public class imprimirMatriz {

    void crearMatriz(int n, int m) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[m][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }

        for (int i = 0; i < matriz.length; i++) {

            System.out.println("Ingrese tres numeros enteros separados por un espacio");
            String nombre = sc.nextLine();
            String[] numeros = nombre.split(" ");

            if (numeros.length != 3) {
                System.out.println("Tamaño invalido");
                crearMatriz(n, m);
            } else {

                validarNumeros val = new validarNumeros();
                boolean aux = val.validarNumero(numeros[0]);
                boolean aux2 = val.validarNumero(numeros[1]);
                boolean aux3 = val.validarNumero(numeros[2]);

                int a = Integer.parseInt(numeros[0]);
                int b = Integer.parseInt(numeros[1]);
                int k = Integer.parseInt(numeros[2]);

                if (!aux || !aux2 || !aux3) {
                    System.out.println("Validar Entrada se requieren numeros enteros");
                    crearMatriz(n, m);
                } else {
                    if (a >= 1 && b >= a && b <= n && k > 0 && k < pow(10, 9)) {
                        if (i == 0) {
                            for (int j = 0; j < n; j++) {
                                if (j + 1 >= a && j + 1 <= b) {
                                    matriz[i][j] = k;
                                }
                            }
                        } else {
                            for (int j = 0; j < n; j++) {
                                if (j + 1 >= a && j + 1 <= b) {
                                    matriz[i][j] = k + matriz[i - 1][j];
                                } else {
                                    matriz[i][j] = matriz[i - 1][j];
                                }
                            }
                        }
                    } else {
                        System.out.println("Valores Invalidos");
                        crearMatriz(n, m);
                    }

                }
            }

        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }

        validarNumeros val = new validarNumeros();

        val.numeroMayor(matriz);

    }

}
