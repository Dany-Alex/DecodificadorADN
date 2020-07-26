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
    public Comparador(String cadena1, String cadena2) {

        String resultado = "";

        for (int i = cadena1.length(); i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (cadena2.contains(cadena1.substring(j, i))
                        && resultado.length() < cadena1.substring(j, i).length()) {
                    resultado = cadena1.substring(j, i);

                }

            }

        }
        System.out.println("----------------------------------------------------");
        System.out.println(colorVerde + "El Resultado del analisis es: " + coloreAmarillo + resultado + colorReset);
        System.out.println("----------------------------------------------------");

    }

}
