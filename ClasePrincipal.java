package ingresotipopila;

import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pila pila = new Pila();
        int num = 0, seleccion = 0;

        while (seleccion != 2) {
            System.out.println("Desea realizar la operacion? \n1.Si  2.No");
            seleccion = in.nextInt();
            if (seleccion == 1) {
                System.out.println("Ingrese un elemento: ");
                num = in.nextInt();
                pila.InsertarNodo(num);
            } else if (seleccion == 2) {
                break;
            }
            seleccion = 0;

        }

        if (num == 0) {
            System.out.println("-----------");
            System.out.println("Pila Vacia");
            System.out.println("-----------");
        } else {
            System.out.println("-----------");
            System.out.println("Elemento de la Pila");
            pila.ImprimirNodo();
            System.out.println("-----------");
        }

    }
}
