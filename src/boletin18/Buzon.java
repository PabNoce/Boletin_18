/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

import java.util.*;

/**
 *
 * @author pnocedalopez
 */
public class Buzon {

    ArrayList<Correo> buzon = new ArrayList<Correo>();

    int numeroDeCorreos() {
        int num = 0;
        for (Correo i : buzon) {
            num++;
        }
        return num;
    }

    void engade(Correo correo) {
        buzon.add(correo);
    }

    boolean porLer() {
        boolean num = false;
        for (Correo i : buzon) {
            if (i.getLeido() == 0) {
                num = true;
            }
        }
        return num;
    }

    String amosaPrimerNonLido() {
        boolean num = false;
        for (Correo i : buzon) {
            if (i.getLeido() == 0) {
                i.setLeido(1);
                return i.getContido();
            }
        }
        return "No hay correos por leer";
    }

    String amosa(int k) {
        buzon.get(k).setLeido(1);
        return buzon.get(k).getContido();
    }

    void elimina(int k) {
        buzon.remove(k);
    }
}
