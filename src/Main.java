import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Preguntamos el número de mesa
        int mesa = Integer.parseInt(JOptionPane.showInputDialog("Número de mesa: "));

        //Generamos el objeto del pedido
        Pedido pedido = new Pedido(mesa);

        boolean continuar = true;
        //Configuramos el bucle para el menú con todas las opciones
        while (continuar) {
           String[] opciones = {"MENU 1 15.0€", "MENU 2 17.50€", "MENU 3 20.0€", "MENU 4 22.50€", "MENU 5 25.0€", "Finalizar pedido"};
           int opcion = JOptionPane.showOptionDialog(null, "Seleccione un menú", "Menú" ,
                   JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

           if (opcion >= 0 && opcion <5){
               pedido.agregarMenu(Menu.values()[opcion]);
           }else {
               continuar = false;
           }
            }
        //Al salir del bucle llamamos a la cuenta para que nos genere el total a pagar por la mesa
            JOptionPane.showMessageDialog(null, pedido.generarCuenta());
        }
    }
