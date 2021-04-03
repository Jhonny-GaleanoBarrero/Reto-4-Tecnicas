package com.company;

import javax.swing.*;
import java.awt.*;

public class BaseDtsPlatos {
        private int j,i,k;
        private int opcion;

    private String [][] matrizDeInformacion = new String[4][11];
    private double [] precioDelplato = new double[11];

    public void infoDelPlatillo(){

        /*String [][] matrizDeInformacion = new String[4][11];
        double [] precioDelplato = new double[11];*/

        //nombres de los platos;
        matrizDeInformacion[0][0]="Pasta Alfredo\n";
        matrizDeInformacion[0][1]= "Sopa de campesina\n";
        matrizDeInformacion[0][2]= "Wrap Americano\n";
        matrizDeInformacion[0][3]= "Ensalda de frutas\n";
        matrizDeInformacion[0][4]= "Pollo teriyaki\n";
        matrizDeInformacion[0][5]="Ropa vieja en salsa BBQ\n";
        matrizDeInformacion[0][6]= "Pizza margarita\n";
        matrizDeInformacion[0][7]= " Desayuno íngles\n";
        matrizDeInformacion[0][8]="Ensalada Cesar\n";
        matrizDeInformacion[0][9]="Carne con verduras\n";
        matrizDeInformacion[0][10]="Gelatina de frutos rojos\n";

        // Ingredientes de los platos

        matrizDeInformacion[1][0]="Pasta spaguetti,\n crema de leche \n champiñones,queso parmesano,\nsal, oregano, agua";
        matrizDeInformacion[1][1]= "Arverja, tomate,\n zanahoria, apio\n papa, pollo en trozos \n sal, ímienta, papa criolla";
        matrizDeInformacion[1][2]= "Pollo, queso,\n huevos, tocineta,\n tortilla de harina";
        matrizDeInformacion[1][3]= "Fresa,papaya,melon \nmango,manzana,piña, jugo de sandia,queso";
        matrizDeInformacion[1][4]= "Pollo, semillas de ajonjoli\n Salsa teriyaki, cilantro\n cebolla blanca,arroz";
        matrizDeInformacion[1][5]="Carne de res, agua\n salsa BBQ,\n pimentones, Arepa de maiz\n maicitos, queso";
        matrizDeInformacion[1][6]= "masa para pizza\n queso mozarella\n tomate, oregano\n albahaca";
        matrizDeInformacion[1][7]= " Huevos, chorizo\n salchicha,bakon,\ntostadas,patatas fritas ";
        matrizDeInformacion[1][8]="lechuga romana\n trozon de pan, ajo,\n pollo, queso \n parmesano,salsa";
        matrizDeInformacion[1][9]="carne de cerdo\n champiñones, crema de leche,\n queso, esparragos\ntomate cherry, cebolla";
        matrizDeInformacion[1][10]="gelatina sin sabor\n pulpa de frutos rojos,\n crema de leche";

        // descripcion del plato

        matrizDeInformacion[2][0]="Pasta bañana en salsa\n alfredo con champiñones";
        matrizDeInformacion[2][1]= "Sopa de verduras y pollo,\n consumida en antioquia";
        matrizDeInformacion[2][2]= "Tortilla de harina\n rellena de ingredientes\n cocinados previamente";
        matrizDeInformacion[2][3]= "Ensalada de diversas\n frutas acompañada\n con queso";
        matrizDeInformacion[2][4]= "Pollo bañado\n en salsa teriyaki\n con arroz";
        matrizDeInformacion[2][5]=" Carne de res\n desmechada\n,con recubierto de queso\n y arepa como acompañante";
        matrizDeInformacion[2][6]= "pizza de albahaca\n con queso y tomate";
        matrizDeInformacion[2][7]= "Desayuno de gran\n tamaño al estilo\n ingles ";
        matrizDeInformacion[2][8]="Ensalada ligera\n y nutritiva de pollo\n con sazonadores y queso";
        matrizDeInformacion[2][9]="Carne en salsa acompañada de\n verduras salteadas \ny previamente asadas ";
        matrizDeInformacion[2][10]="Postre delicioso\n y reducido en azucar";


        // valor de la mano de obra + ingredientes
        matrizDeInformacion[3][0]="10.000$";
        matrizDeInformacion[3][1]= "8.000$";
        matrizDeInformacion[3][2]= "6.000$";
        matrizDeInformacion[3][3]= "4.000$";
        matrizDeInformacion[3][4]= "8.000$";
        matrizDeInformacion[3][5]=" 7,000$";
        matrizDeInformacion[3][6]= "15.000$";
        matrizDeInformacion[3][7]= "16.000$";
        matrizDeInformacion[3][8]="6.000$";
        matrizDeInformacion[3][9]="10.000$";
        matrizDeInformacion[3][10]="5.000$";


        // valor del plato

        precioDelplato[0]= 16000;
        precioDelplato[1]= 11000;
        precioDelplato[2]= 10000;
        precioDelplato[3]= 8000;
        precioDelplato[4]= 12000;
        precioDelplato[5]= 11000;
        precioDelplato[6]= 30000;
        precioDelplato[7]= 20000;
        precioDelplato[8]= 10000;
        precioDelplato[9]= 16000;
        precioDelplato[10]= 10000;

        // nombre de los platos

        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("escoge \n 1.para ver nombre de los platos" +
                    "\n 2. para ver sus ingredientes\n 3. para ver sus descripciones" +
                    "\n 4. para ver el valor de la mano de obra \n 5. para ver el valor del plato\n"));
        switch (this.opcion) {

            case 1://nombres de la receta
                opcion = 1;
                for (this.j = 0; this.j <= 10; this.j++) {

                    System.out.print("Plato numero " + j + ":\n" + matrizDeInformacion[0][j]);
                    System.out.println("_________________________________");
                }
                System.out.println(" ");

                break;
            case 2: // ingredientes de la receta
                opcion = 2;

                for (this.i = 0; this.i <= 10; this.i++) {

                    System.out.print("Ingredientes plato:  " + i + ":\n" + matrizDeInformacion[1][i]);
                    System.out.println("_________________________________-");
                    System.out.println(" ");

                }
                break;
            // Descripcion de los platillos
            case 3:
                opcion = 3;
                for (this.i = 0; this.i <= 10; this.i++) {

                    System.out.print("Descripcion plato:  " + i + ":\n" + matrizDeInformacion[2][i]);
                    System.out.println("_________________________________-");
                    System.out.println(" ");

                }

                break;

            case 4: // Valor de la mano de obra
                opcion = 4;

                for (this.i = 0; this.i <= 10; this.i++) {

                    System.out.print("valor, mano de obra e ingredientes\n plato:  " + i + ":\n" + matrizDeInformacion[3][i]);
                    System.out.println("_________________________________-");
                    System.out.println(" ");

                }

                break;

            case 5:
                opcion = 5;// valor del plato

                for (this.i = 0; this.i <= 10; this.i++) {

                    System.out.print("valor del plato:  " + i + ":\n" + precioDelplato[i]);
                    System.out.println("_________________________________-");
                    System.out.println(" ");

                }
                break;

            default:
                System.out.println("escoja una de las opciones brindadas");

                break;


            }//swithc


            this.k = Integer.parseInt(JOptionPane.showInputDialog("escriba <7> para salir del menu de lo contrario ponga < 8 >:"));

        }while( k != 7 );// do

    }//metodo


}//clasei

