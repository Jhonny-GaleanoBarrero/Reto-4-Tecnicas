package com.company;

import javax.swing.*;

public class BaseDtsMesas {

    private int j,i,respuesta;
    private int[] capacidad = new int[7];
    private String[] descripciones = new String[7];
    public void infoMesas() {

        respuesta= Integer.parseInt(JOptionPane.showInputDialog("Desea ver la informacion de las mesas?\n" +
                " si es así pn < 1 > de lo contrario < 2 >"));

        if(this.respuesta == 1) {

            descripciones[0] = "mesa con vista al mirador";
            descripciones[1] = "mesa en la mitad del salon";
            descripciones[2] = "mesa ideada para familias con bebes";
            descripciones[3] = "mesa con vista al exterior";
            descripciones[4] = "mesa con una ventanal cerca";
            descripciones[5] = "mesa cerca a la entrada";
            descripciones[6] = "mesa ideada para familias grandes";

            capacidad[0] = 1;
            capacidad[1] = 3;
            capacidad[2] = 4;
            capacidad[3] = 5;
            capacidad[4] = 2;
            capacidad[5] = 3;
            capacidad[6] = 6;

            for (this.i = 0; this.i < 7; this.i++) {
                System.out.print("la capacidad de la mesa " + i + " es de " + capacidad[i] + " personas ");
                System.out.println("|| Descripcion: " + descripciones[i]);
                System.out.println(" ");
            }

        }

        if(respuesta==2){
            System.out.println("Quiza quieras verlo luego");
        }


    }
}
