/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.util.Scanner;

/**
 *
 * @author dany
 */
public class DecodificadorADN {

    public static final String colorRojo = "\u001B[31m";
    public static final String colorCyan = "\u001B[36m";
    public static final String colorReset = "\u001B[0m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        Scanner sn = new Scanner(System.in);
        String secuenciaA, secuenciaB;
        
        System.out.println("----------------------------------------------------\n"
                + colorCyan + "                Decodificador " + colorReset
                + colorRojo + "ADN\n" + colorReset
                + "----------------------------------------------------\n");

        System.out.println("----------------------------------------------------\n"
                         + "Ingrese la Secuencia A\n"
                         + "----------------------------------------------------");
        secuenciaA=sn.nextLine();
        
        System.out.println("----------------------------------------------------\n"
                         + "Ingrese la Secuencia A\n"
                         + "----------------------------------------------------");
        secuenciaB=sn.nextLine();

        
        Comparador decodificador = new Comparador(secuenciaA,
                                                  secuenciaB);

    }

}
