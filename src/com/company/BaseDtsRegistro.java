package com.company;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class BaseDtsRegistro {
    private int i;
    private String[] platos = new String[11];
    private double[] valorPlatos = new double[11];
    private  String[] mesas = new String[7];
    private LocalDate fechaA;
    private LocalTime horaA;
    private String[] nombre = new String[10];
    private int[] numeroDeDocumento = new int[10];
    private String[] tipoDocumento = new String[10];
    private double[] valorFinal = new double[11];

    public void platillos(){

        //Fechas
        this.fechaA = LocalDate.now();
        this.horaA = LocalTime.now();

        //platos
        this.platos[0] = "pasta Alfredo\n";
        this.platos[1] = "Sopa de campesina\n";
        this.platos[2] = "Wrap Americano\n";
        this.platos[3] = "Ensalda de frutas\n";
        this.platos[4] = "Pollo teriyaki\n";
        this.platos[5] = "Ropa vieja en salsa BBQ\n";
        this.platos[6] = "Pizza margarita\n";
        this.platos[7] = "Desayuno íngles\n";
        this.platos[8] = "Ensalada Cesar\n";
        this.platos[9] = "Carne con verduras\n";
        this.platos[10] = "Gelatina de frutos rojos\n";

        //valor de los platos
        this.valorPlatos[0]= 16000;
        this.valorPlatos[1]= 11000;
        this.valorPlatos[2]= 10000;
        this.valorPlatos[3]= 8000;
        this.valorPlatos[4]= 12000;
        this.valorPlatos[5]= 11000;
        this.valorPlatos[6]= 30000;
        this.valorPlatos[7]= 20000;
        this.valorPlatos[8]= 10000;
        this.valorPlatos[9]= 16000;
        this.valorPlatos[10]= 10000;

        //mesas
        mesas[0] = "mesa 1";
        mesas[1] = "mesa 2";
        mesas[2] = "mesa 3";
        mesas[3] = "mesa 4";
        mesas[4] = "mesa 5";
        mesas[5] = "mesa 6";
        mesas[6] = "mesa 7";

        //nombre de los clientes
        this.nombre[0] = "Andres";
        this.nombre[1] = "Juliana";
        this.nombre[2] = "Valentina";
        this.nombre[3] = "Sara";
        this.nombre[4] = "Juana";
        this.nombre[5] = "Johan";
        this.nombre[6] = "Esteban";
        this.nombre[7] = "Juan";
        this.nombre[8] = "Felipe";
        this.nombre[9] = "Camila";

        //documentos de los clientes
        this.numeroDeDocumento[0] = 1651231;
        this.numeroDeDocumento[1] = 9563132;
        this.numeroDeDocumento[2] = 2341652;
        this.numeroDeDocumento[3] = 9682134;
        this.numeroDeDocumento[4] = 4562315;
        this.numeroDeDocumento[5] = 2168423;
        this.numeroDeDocumento[6] = 6546513;
        this.numeroDeDocumento[7] = 4451321;
        this.numeroDeDocumento[8] = 9432142;
        this.numeroDeDocumento[9] = 1651114;

        //tipo de documento del cliente
        this.tipoDocumento[0] = "Cedula";
        this.tipoDocumento[1] = "Cedula";
        this.tipoDocumento[2] = "Nit";
        this.tipoDocumento[3] = "Cedula";
        this.tipoDocumento[4] = "Cedula";
        this.tipoDocumento[5] = "Nit";
        this.tipoDocumento[6] = "cedula";
        this.tipoDocumento[7] = "cedula";
        this.tipoDocumento[8] = "Nit";
        this.tipoDocumento[9] = "Nit";

        //suma
        this.valorFinal[0] = valorPlatos[4] + valorPlatos[10];
        this.valorFinal[1] = valorPlatos[2] + valorPlatos[1] + valorPlatos[4];
        this.valorFinal[2] = valorPlatos[0] + valorPlatos[3] + valorPlatos[7] + (valorPlatos[10] * 2);
        this.valorFinal[3] = valorPlatos[5] + valorPlatos[4] + valorPlatos[6] + (valorPlatos[9] * 2);
        this.valorFinal[4] = (valorPlatos[10] * 2) + valorPlatos[6];
        this.valorFinal[5] = valorPlatos[4] + valorPlatos[7] + valorPlatos[5];
        this.valorFinal[6] = valorPlatos[6] + valorPlatos[2] + valorPlatos[8] + (valorPlatos[9] * 2);

        this.i = Integer.parseInt(JOptionPane.showInputDialog("Si desea ver la factura de los pedidos \n "+
                " ingrese <1> de lo contrario ingrese <2>"));
        if (this.i == 1){
            //mesa 1
            System.out.println(mesas[0] + "\nFECHA: " + fechaA + "//" + horaA + "\n"+"\n"
                    + platos[4] + "Cantida: 1" + "\n" + "Precio: "+ valorPlatos[4] + "\n" +"\n"
                    + platos[10] + "Cantida: 1" + "\n" + "Precio: " + valorPlatos[10] + "\n" +"\n"
                    + "Valor total: " + valorFinal[0] + "\n"
                    + "Cedula del cliente: " + numeroDeDocumento[0] + "\n"
                    + "Tipo de documento: " + tipoDocumento[0]);
            System.out.println("_________________________________________");

            //mesa 2
            System.out.println(mesas[1] + "\nFECHA: " + fechaA + "//" + horaA + "\n" + "\n"
                    + platos[2] + "Cantida: 1" + "\n" + "Precio: " + valorPlatos[2] + "\n" + "\n"
                    + platos[1] + "Cantida: 1" + "\n" + "Precio: " + valorPlatos[1] + "\n" + "\n"
                    + platos[4] + "Cantida: 1" + "\n" + "Precio: " + valorPlatos[4] + "\n" + "\n"
                    + "Valor total: " + valorFinal[1] + "\n"
                    + "Cedula del cliente: " + numeroDeDocumento[1] + "\n"
                    + "Tipo de documento: " + tipoDocumento[1]);
            System.out.println("_________________________________________");

            //mesa 3
            System.out.println(mesas[2] + "\nFECHA:" + fechaA + "//" + horaA + "\n" + "\n"
                    + platos[0] + "Cantida: 1" + "\n" + "Precio: " + valorPlatos[0] + "\n" + "\n"
                    + platos[3] + "Cantida: 1" + "\n" + "Precio: " + valorPlatos[3] + "\n" + "\n"
                    + platos[7] + "Cantida: 1" + "\n" + "Precio: " + valorPlatos[7] + "\n" + "\n"
                    + platos[10] + "Cantida: 2" + "\n" + "Precio: " + valorPlatos[10]*2 + "\n" + "\n"
                    + "Valor total: " + valorFinal[2] + "\n"
                    + "Cedula del cliente: " + numeroDeDocumento[2] + "\n"
                    + "Tipo de documento: " + tipoDocumento[2]);
            System.out.println("_________________________________________");

            //mesa 4
            System.out.println(mesas[3] + "\nFECHA:" + fechaA + "//" + horaA + "\n" + "\n"
                    + platos[5] + "Cantidad: 1" + "\n" + "Precio: " + valorPlatos[5] + "\n" + "\n"
                    + platos[4] + "Cantidad: 1" + "\n" + "Precio: " + valorPlatos[4] + "\n" + "\n"
                    + platos[6] + "Cantidad: 1" + "\n" + "Precio: " + valorPlatos[6] + "\n" + "\n"
                    + platos[9] + "Cantidad: 2" + "\n" + "Precio: " + valorPlatos[9] * 2 + "\n" + "\n"
                    + "Valor total: " + valorFinal[3] + "\n"
                    + "Cedula del cliente: " + numeroDeDocumento[3] + "\n"
                    + "Tipo de documento: " + tipoDocumento[3]);
            System.out.println("_________________________________________");

            // mesa 5
            System.out.println(mesas[4] + "\nFECHA: " + fechaA + "//" + horaA + "\n" + "\n"
                    + platos[10] + "Cantidad: 2" + "\n" + "Precio: " + valorPlatos[10] * 2 + "\n" + "\n"
                    + platos[6] + "Canridad: 1" + "\n" + "Precio: " + valorPlatos[6] + "\n" + "\n"
                    + "Valor total: " + valorFinal[4] + "\n"
                    + "Cedula del cliente: " + numeroDeDocumento[4] + "\n"
                    + "Tipo de documento: " + tipoDocumento[4]);
            System.out.println("_________________________________________");

            // mesa 6
            System.out.println(mesas[5] + "\nFECHA:" + fechaA + "//" + horaA + "\n" + "\n"
                    + platos[4] + "Cantidad: 1" + "\n" + "Precio: " + valorPlatos[4] + "\n" + "\n"
                    + platos[7] + "Cantidad: 1" + "\n" + "Precio: " + valorPlatos[7] + "\n" + "\n"
                    + platos[5] + "Cantidad: 1" + "\n" + "Precio: " + valorPlatos[5] + "\n" + "\n"
                    + "Valor total: " + valorFinal[5] + "\n"
                    + "Cedula del cliente: " + numeroDeDocumento[5] + "\n"
                    + "Tipo de documento: " + tipoDocumento[5]);
            System.out.println("_________________________________________");

            // mesa 7
            System.out.println(mesas[6] + "\nFECHA: " + fechaA + "//" + horaA + "\n" + "\n"
                    + platos[6] + "Cantidad: 1" + "\n" + "Precio: " + valorPlatos[6] + "\n" + "\n"
                    + platos[8] + "Cantidad: 1" + "\n" + "Precio: " + valorPlatos[8] + "\n" + "\n"
                    + platos[2] + "Cantidad: 1" + "\n" + "Precio: " + valorPlatos[2] + "\n" + "\n"
                    + platos[9] + "Cantidad: 2" + "\n" + "Precio: " + valorPlatos[9] * 2 + "\n" + "\n"
                    + "Valor total: " + valorFinal[6] + "\n"
                    + "Cedula del cliente: " + numeroDeDocumento[6] + "\n"
                    + "Tipo de documento: " + tipoDocumento[6]);
        }
        if (this.i == 2){
            System.out.println("Quiza quieras verlo mas tarde");
        }
    }
}
