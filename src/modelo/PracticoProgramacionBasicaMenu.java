package modelo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticoProgramacionBasicaMenu {

    public static int[] arregloUltEjercicios = new int[5];

    //lector de entrada usuario
    static Scanner ingresoOpcion = new Scanner(System.in);


    // Menu
    public static void printMenu() {
        boolean salir = false;
        int opcionSeleccionada;

        System.out.println("Bienvenido");

        while (!salir) {
            System.out.println("- - - - - - - - - - - - - MENU - - - - - - - - - - - - - - - - -");
            System.out.println("Digite una opción 1 al 10 para ver los ejercicios.");
            System.out.println("Digite 12 para imprimir los 5 últimos ejercicios seleccionados.");
            System.out.println("Digite 13 para finalizar.");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

            try {
                opcionSeleccionada = ingresoOpcion.nextInt();

                switch (opcionSeleccionada) {
                    case 1:
                        PracticoProgramacionBasicaFunciones.ingreseSuGenero();
                        guardarNumeroEjercicio(1);
                        break;
                    case 2:
                        PracticoProgramacionBasicaFunciones.arregloASumar();
                        guardarNumeroEjercicio(2);
                        break;
                    case 3:
                        PracticoProgramacionBasicaFunciones.ingresarNumerosAArreglo();
                        guardarNumeroEjercicio(3);
                        break;
                    case 4:
                        PracticoProgramacionBasicaFunciones.ingresarPalabrasAComparar();
                        guardarNumeroEjercicio(4);
                        break;
                    case 5:
                        PracticoProgramacionBasicaFunciones.ingresarNumAEvaluar();
                        guardarNumeroEjercicio(5);
                        break;
                    case 6:
                        PracticoProgramacionBasicaFunciones.ingresarDosNumerosAB();
                        guardarNumeroEjercicio(6);
                        break;
                    case 7:
                        PracticoProgramacionBasicaFunciones.compararMultipVSDivision();
                        guardarNumeroEjercicio(7);
                        break;
                    case 8:
                        PracticoProgramacionBasicaFunciones.arreglosAComparar();
                        guardarNumeroEjercicio(8);
                        break;
                    case 9:
                        PracticoProgramacionBasicaFunciones.ingresarPalabraAInventir();
                        guardarNumeroEjercicio(9);
                        break;
                    case 10:
                        PracticoProgramacionBasicaFunciones.cambioVocales();
                        guardarNumeroEjercicio(10);
                        break;
                    case 12:
                        imprimirUltimosEjercicios();
                        break;
                    case 13:
                        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                        System.out.println("Gracias por su atención. Buen día.");
                        salir = true;
                        break;
                    default:
                        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                        System.out.println("Ingrese solo números del 1 al 10, 12 o 13.");
                        System.out.println("El 11 no esta disponible.");
                        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

                }

            } catch (InputMismatchException e) {
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - !");
                System.out.println("Error, debe insertar un número");
                break;
            }
        }
    }

    // Functions

    public static void guardarNumeroEjercicio(int numeroEjercicio) {

        if (arregloUltEjercicios[0] == 0) {
            for (int i = 4; i >= 0; i--) {
                if (arregloUltEjercicios[i] == 0) {
                    arregloUltEjercicios[i] = numeroEjercicio;
                    break;
                }
            }
        } else {
            int[] arrayAuxiliar = new int[5];
            for (int i = 0; i < arregloUltEjercicios.length; i++) {
                arrayAuxiliar[i] = arregloUltEjercicios[i];
            }
            for (int i = 1; i < arregloUltEjercicios.length; i++) {
                int aux = arrayAuxiliar[i - 1];
                arregloUltEjercicios[i] = aux;
            }
            arregloUltEjercicios[0] = numeroEjercicio;
        }

    }

    /*Ej 12) Implementar la opción de imprimir en pantalla los últimos 5 ejercicios ejecutados.*/

    public static void imprimirUltimosEjercicios() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arregloUltEjercicios.length; i++) {
            System.out.println(arregloUltEjercicios[i]);
        }
    }

}
