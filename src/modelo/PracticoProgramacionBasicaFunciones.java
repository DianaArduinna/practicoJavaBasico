package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticoProgramacionBasicaFunciones {


    //lector de entradas usuario
    static Scanner numero = new Scanner(System.in);
    static Scanner palabra = new Scanner(System.in);
    static Scanner letra = new Scanner(System.in);

    // Functions

    /* 1) Un programa que recibe el sexo de una persona como un char y retorne true si el sexo de
    la persona es femenino (F) o masculino (M) o false en cualquier otro caso*/

    public static void ingreseSuGenero() {
        System.out.println("Ingrese una letra para identificar su género:");
        char sexo = letra.next().charAt(0);
        boolean resultado = (buscarFemeninoMasculino(sexo));
        System.out.println(resultado);

    }

    public static boolean buscarFemeninoMasculino(char sexo) {
        return sexo == 'F' || sexo == 'M';
    }

    /*Ej 2) Un programa que retorne true si la suma de la cantidad de los números en las posiciones
    “2” “3” y “4” de un arreglo de enteros es par, de lo contrario retorna false.*/

    public static void arregloASumar() {
        int[] arregloSum = new int[5];

        System.out.println("Ingrese 5 números:");

        for (int i = 0; i < arregloSum.length; i++) {
            arregloSum[i] = numero.nextInt();
        }
        ArrayList<Integer> listaArregloSum = new ArrayList<>();
        for (int i : arregloSum) {
            listaArregloSum.add(i);
        }
        System.out.println(sumaDeArreglo(listaArregloSum));

    }

    public static boolean sumaDeArreglo(ArrayList<Integer> listaArregloSum) {

        for (int i = 0; i < listaArregloSum.size(); i++) {
            int sumaArreglo = (listaArregloSum.get(2) + listaArregloSum.get(3) + listaArregloSum.get(4));

            if (sumaArreglo % 2 == 0) {
                return true;
            }
        }
        return false;
    }



    /*Ej 3) Un programa que retorne true si un arreglo de enteros contiene al menos un número par,
    de lo contrario retorna false.*/

    public static void ingresarNumerosAArreglo() {
        System.out.print("Ingrese la cantidad de elementos a procesar: ");
        int numerosArreglo = numero.nextInt();

        int[] arreglo = new int[numerosArreglo];

        System.out.println("Ingrese cada número:");

        for (int i = 0; i < numerosArreglo; i++) {
            arreglo[i] = numero.nextInt();
        }
        ArrayList<Integer> listaArreglo = new ArrayList<>();
        for (int i : arreglo) {
            listaArreglo.add(i);
        }
        System.out.println(arregloDeEnteros(listaArreglo));

    }

    public static boolean arregloDeEnteros(ArrayList<Integer> listaArreglo) {

        for (int i = 0; i < listaArreglo.size(); i++) {
            if (listaArreglo.get(i) % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    /*Ej 4) Un programa que retorne true si dos palabras son iguales entre sí, de lo contrario retorna
    false.*/

    public static void ingresarPalabrasAComparar() {
        System.out.print("Ingrese la primera palabra: ");
        String palabra1 = palabra.next();
        System.out.print("Ingrese una segunda palabra para comparar: ");
        String palabra2 = palabra.next();
        System.out.println(palabrasIguales(palabra1, palabra2));
    }


    public static boolean palabrasIguales(String palabra1, String palabra2) {

        if (palabra1.equals(palabra2)) {
            return true;
        }
        return false;

    }

    /*Ej 5) Un programa que retorne true si un entero es capicúa (ej: 12321), de lo contrario retorna false.*/

    public static void ingresarNumAEvaluar() {
        System.out.println("Ingrese un número: ");
        int numeroAEvaluar = numero.nextInt();
        System.out.println("Es capicua? :" + esCapicua(numeroAEvaluar));
    }

    public static boolean esCapicua(int numero) {
        String palabra = String.valueOf(numero);

        for (int i = 0, j = palabra.length() - 1; i <= j; i++, --j) {
            if (palabra.charAt(i) != palabra.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    /*Ej 6) Un programa que retorne true si el número a es menor que b, de lo contrario retorna false.*/

    public static void ingresarDosNumerosAB() {
        System.out.print("Ingrese un número a: ");
        int numeroA = numero.nextInt();
        System.out.print("Ingrese un número b: ");
        int numeroB = numero.nextInt();
        System.out.println(dimeSiEsMenor(numeroA, numeroB));
    }

    public static boolean dimeSiEsMenor(int numeroA, int numeroB) {

        if (numeroA < numeroB) {
            return true;
        }
        return false;

    }


    /*Ej 7) Un programa que retorne true si la multiplicación del número a con el número b es igual a
    la división del número a con el número b.*/

    public static void compararMultipVSDivision() {
        System.out.print("Ingrese un número a: ");
        int numeroA = numero.nextInt();
        System.out.print("Ingrese un número b: ");
        int numeroB = numero.nextInt();
        System.out.println(multiplicacionVSDivision(numeroA, numeroB));
    }

    public static boolean multiplicacionVSDivision(int numeroA, int numeroB) {

        int multiplicacion = numeroA * numeroB;
        int division = numeroA / numeroB;

        if (multiplicacion == division) {
            return true;
        }

        return false;
    }


    /*Ej 8) Un programa que retorne true si un arreglo de enteros A contiene al menos dos números
    que también contenga el arreglo de enteros B.*/

    public static void arreglosAComparar() {
        int[] arreglo1 = new int[5];

        System.out.println("Ingrese 5 números para el arreglo 1:");

        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = numero.nextInt();
        }
        ArrayList<Integer> listaArreglo1 = new ArrayList<>();
        for (int i : arreglo1) {
            listaArreglo1.add(i);
        }

        int[] arreglo2 = new int[5];

        System.out.println("Ingrese 5 números para el arreglo 2:");

        for (int i = 0; i < arreglo2.length; i++) {
            arreglo2[i] = numero.nextInt();
        }
        ArrayList<Integer> listaArreglo2 = new ArrayList<>();
        for (int i : arreglo2) {
            listaArreglo2.add(i);
        }

        System.out.println(comparandoArreglos(listaArreglo1, listaArreglo2));

    }

    public static boolean comparandoArreglos(ArrayList<Integer> listaArreglo1, ArrayList<Integer> listaArreglo2) {

        for (int i = 0; i < listaArreglo1.size(); i++) {
            for (int j = 0; j < listaArreglo2.size(); j++) {
                if (listaArreglo1.get(i) == listaArreglo2.get(j)) {
                    return true;
                }
            }
        }
        return false;
    }



    /*Ej 9) Un programa que retorne la palabra que recibe pero al revés. (ej: hola, retorno = aloh).*/

    static void ingresarPalabraAInventir() {
        System.out.print("Ingrese una palabra: ");
        String palabraAInvertir = palabra.next();
        invertirPalabra(palabraAInvertir);
    }


    static void invertirPalabra(String palabraAInvertir) {

        StringBuilder sb = new StringBuilder(palabraAInvertir);
        System.out.println("Palabra invertida: "+ sb.reverse());
    }

    /*Ej 10) Un programa que retorne la palabra que recibe cambiando todas sus vocales por x. (Ej:
    azul, retorno: xzxl).*/

    public static void cambioVocales() {

        System.out.print("Ingrese una palabra:");
        String palabraACambiar = palabra.next();

        System.out.println(palabraACambiar.replaceAll("[aeiou]", "x"));

    }

}
