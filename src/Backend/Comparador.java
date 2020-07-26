/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author dany
 */
public class Comparador {

    public static final String colorVerde = "\u001B[32m";
    public static final String coloreAmarillo = "\u001B[33m";
    public static final String colorReset = "\u001B[0m";

    /**
     *
     * @param cadena1 almacena la primera cadena string
     * @param cadena2 almacena la segunda cadena string
     */
    public Comparador(String secuenciaA, String secuenciaB) {

        String resultado = "";

        for (int i = secuenciaA.length(); i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (secuenciaB.contains(secuenciaA.substring(j, i))
                        && resultado.length() < secuenciaA.substring(j, i).length()) {
                    resultado = secuenciaA.substring(j, i);

                }

            }

        }
        System.out.println("----------------------------------------------------");
        System.out.println(colorVerde + "El Resultado del analisis es: " + coloreAmarillo + resultado + colorReset);
        System.out.println("----------------------------------------------------");

    }

}
