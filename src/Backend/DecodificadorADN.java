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
public class DecodificadorADN {

    public static final String colorRojo = "\u001B[31m";
    public static final String colorCyan = "\u001B[36m";
    public static final String colorReset = "\u001B[0m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("----------------------------------------------------\n"
                + colorCyan + "                Decodificador " + colorReset
                + colorRojo + "ADN\n" + colorReset
                + "----------------------------------------------------\n");

        Comparador comparador = new Comparador("ATGTCTTCCTCGA",
                "TGCTTCCTATGAC");

        Comparador comparador2 = new Comparador("ctgactga",
                "actgagc");

        Comparador comparador3 = new Comparador("cgtaattgcgat",
                "cgtacagtagc");

    }

}
