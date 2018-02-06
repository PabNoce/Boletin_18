/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

import java.util.Scanner;

/**
 *
 * @author pnocedalopez
 */
public class Boletin18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Buzon buzon = new Buzon();
        Correo correo = new Correo(scan.nextLine());
        buzon.engade(correo);
        correo = new Correo(scan.nextLine());
        buzon.engade(correo);
        correo = new Correo(scan.nextLine());
        buzon.engade(correo);
        correo = new Correo(scan.nextLine());
        buzon.engade(correo);
        System.out.println("O primer correo non lido é (1): " + buzon.amosaPrimerNonLido());
        System.out.println("O tercer correo é (3): " + buzon.amosa(2));
        System.out.println("O seguinte correo non lido é (2): " + buzon.amosaPrimerNonLido());
        if (buzon.porLer()) {
            System.out.println("quedan por leer (verdad)");
        } else {
            System.out.println("non quedan por leer(falso)");
        }
        System.out.println("numero de correos (4): " + buzon.numeroDeCorreos());
        System.out.println("O seguinte correo non lido é (4): " + buzon.amosaPrimerNonLido());
        buzon.elimina(2);
        System.out.println("numero de correos (3): " + buzon.numeroDeCorreos());

    }

}
