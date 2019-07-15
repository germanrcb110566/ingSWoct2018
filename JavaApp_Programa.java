/*
 * Programa ejemplo para la materia de Ingenieria de Software
 * El objetivo es manejar el control de las verisones del programa
 * a travez de una plataforma de manejo de codigo fuente.
 */
package javaapp_programa;
import java.util.Scanner;

/**
 *
 * @author German Camacho Brausendorff
 * @Fecha  2019-07-14
 */
public class JavaApp_Programa {

    /**
     * Este programa no requiere de parametros en la linea de comnados
     */
    public static void main(String[] args) {
        // Se definene tres variables que seran para realiza la solicitud de 2 
        // numeros y sumarlos entres si para obtener el resultado y mostrarlos
        //en pantalla.
        
        Scanner dato= new Scanner(System.in);
        double numero1, numero2, suma;
        System.out.println("Ingrese primer Numero:");
        numero1=dato.nextDouble();
        System.out.println("Ingrese Segundo Numero:");
        numero2=dato.nextDouble();
        suma=numero1+numero2;
        System.out.println("La suma de los dos numeros es:" + suma);
        
    }
    
}
