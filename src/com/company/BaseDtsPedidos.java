package com.company;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class BaseDtsPedidos {

    private LocalTime horaActual = LocalTime.now();
    private LocalDate fechaActual = LocalDate.now();
    private String[] matrizDatos = new String[11];
    private String [] mesas = new String [7];
    private int i,j,k;

    public void infoPedidos(){
        //platillos
        this.matrizDatos[0]=" pasta Alfredo";
        this.matrizDatos[1]= "Sopa de campesina\n";
        this.matrizDatos[2]= "Wrap Americano\n";
        this.matrizDatos[3]= "Ensalda de frutas\n";
        this.matrizDatos[4]= "Pollo teriyaki\n";
        this.matrizDatos[5]="Ropa vieja en salsa BBQ\n";
        this.matrizDatos[6]= "Pizza margarita\n";
        this.matrizDatos[7]= " Desayuno íngles\n";
        this.matrizDatos[8]="Ensalada Cesar\n";
        this.matrizDatos[9]="Carne con verduras\n";
        this.matrizDatos[10]="Gelatina de frutos rojos\n";

        // mesas
        mesas[0] ="mesa 1";// mesa individual
        mesas[1] ="mesa 2";// mesa de tres personas
        mesas[2] ="mesa 3";// mesa de cuatro personas
        mesas[3]= "mesa 4";// mesa de cinco personas
        mesas[4]= "mesa 5";// mesa de dos personas
        mesas[5]= "mesa 6";// mesa de tres personas
        mesas[6]= "mesa 7";// mesa de seis personas

        //mesa1
        this.k = Integer.parseInt(JOptionPane.showInputDialog("Si desea ver el registro de pedidos \n "+
                    " ingrese <1> de lo contrario ingrese <2>"));
        if (this.k == 1) {
            System.out.println(mesas[0] + "\n FECHA: " + fechaActual + "//" + horaActual + "\n 1 "
                    + matrizDatos[4] + "\n1 " + matrizDatos[10]);
            System.out.println("_________________________________________");
            //mesa 2

            System.out.println(mesas[1] + "\nFECHA: " + fechaActual + "//" + horaActual + "\n 1 "
                    + matrizDatos[2] + "\n1 " + matrizDatos[1] + "\n1 " + matrizDatos[4]);
            System.out.println("_________________________________________");
            //mesa 3

            System.out.println(mesas[2] + "\nFECHA:" + fechaActual + "//" + horaActual + "\n 1 "
                    + matrizDatos[0] + "\n1 " + matrizDatos[3] + "\n1 " + matrizDatos[7] + "\n 2"
                    + matrizDatos[10]);
            System.out.println("_________________________________________");
            //mesa 4
            System.out.println(mesas[3] + "\nFECHA:" + fechaActual + "//" + horaActual + "\n 1 "
                    + matrizDatos[5] + "\n1 " + matrizDatos[4] + "\n1 " + matrizDatos[6] + "\n 2 "
                    + matrizDatos[9]);
            System.out.println("_________________________________________");
            // mesa 5

            System.out.println(mesas[4] + "\nFECHA: " + fechaActual + "//" + horaActual + "\n 2 "
                    + matrizDatos[10] + "\n1 " + matrizDatos[6] );
            System.out.println("_________________________________________");
            // mesa 6
            System.out.println(mesas[5] + "\nFECHA:" + fechaActual + "//" + horaActual + "\n 1 "
                    + matrizDatos[4] + "\n1 " + matrizDatos[7] + "\n1 " + matrizDatos[5]);
            System.out.println("_________________________________________");
            // mesa 7

            System.out.println(mesas[6] + "\nFECHA: " + fechaActual + "//" + horaActual + "\n 1 "
                    + matrizDatos[6] + "\n1 " + matrizDatos[8] + "\n1 " + matrizDatos[2] + "\n 2 "
                    + matrizDatos[9]);

        }

        if(this.k == 2){

            System.out.println("Quiza quieras verlo mas tarde");
        }






    }


}
