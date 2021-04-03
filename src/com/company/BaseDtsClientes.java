package com.company;

import java.util.Scanner;

public class BaseDtsClientes {


        private int i,j,k;
        private String[] nombre = new String[10];
        private int[] numeroDeDocumento = new int[10];
        private String[] tipoDocumento = new String[10];

        public void ingresarDatos() {

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

            System.out.println("Nombres y Documentos de los clientes que reservaron" +"\n");
            System.out.println("------------------------");
            for(this.k =0;this.k <10 ; this.k++){

                System.out.println("Nombre: " + nombre[k] + "\n");
                System.out.println("Indentificación: " + numeroDeDocumento[k] + "\n");
                System.out.println("------------------------");
            }
        }
}    //metodo vacio
//clase
