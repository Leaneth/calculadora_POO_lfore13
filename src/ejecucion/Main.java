package ejecucion;

import operaciones.Aritmetica;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scannerLea = new Scanner(System.in);

        System.out.println("Va a realizar una Operación Matematica");
        System.out.println("Ingrese el primer número");
        double primero = scannerLea.nextInt();
        System.out.println("Ingrese el segundo número");
        double segundo = scannerLea.nextInt();
        int opcion;

        System.out.println("Digita la operación deseada");

        do{
            System.out.println("-------------------------------------------------");
            System.out.println("-         OPERACIONES MATEMATICAS               -");
            System.out.println("-               1.SUMA                          -");
            System.out.println("-               2.RESTA                         -");
            System.out.println("-               3.MULTIPLICACIÓN                -");
            System.out.println("-               4.DIVISIÓN                      -");
            System.out.println("-               0.SALIR                         -");
            System.out.println("-------------------------------------------------");

            opcion = scannerLea.nextInt();


            Aritmetica suma= new Aritmetica(primero,segundo);


            switch (opcion){
                case 1:
                    double resultadosuma=suma.sumar();
                    System.out.println("El resultado de la suma es:"+resultadosuma);

                    break;

                case 2:
                    double resultadoresta=suma.restar();
                    System.out.println("El resultado de la resta es:"+resultadoresta);
                    break;

                case 3:
                    double resulmulti=suma.multiplicar();
                    System.out.println("El resultado de la multiplicación es:"+resulmulti);
                    break;

                case 4:
                    double resuldivi=suma.dividir();
                    System.out.println("El resultado de la división es:"+resuldivi);

                case 0:
                    System.out.println("-------------------------------------------------");
                    System.out.println("-                Salir                          -");
                    System.out.println("-------------------------------------------------");
                    break;

                default :
                    System.out.println("-------------------------------------------------");
                    System.out.println("-          OPCIÓN NO VALIDA...                  -");
                    System.out.println("-------------------------------------------------");

            }

        }while(opcion!=0);
        System.out.println("Hasta Luego");


    }
}