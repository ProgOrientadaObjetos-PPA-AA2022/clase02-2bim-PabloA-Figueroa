/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        System.out.println("Ingrese el nombre del Estudiante");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido del Estudiante");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese la identificacion del Estudiante");
        String identificacion =entrada.nextLine();
        System.out.println("Ingrese la edad del Estudiante");
        int edad = entrada.nextInt();
        System.out.println("Ingrese los numeros de creditos del Estudiante");
        int nCreditos = entrada.nextInt();
        System.out.println("Ingrese el costo de los Creditos del Estudiante");
        double cCreditos = entrada.nextDouble();
        
        EstudiantePresencial estP1 = new EstudiantePresencial(nombre,
                apellido, identificacion, edad,nCreditos,cCreditos);
        estP1.calcularMatriculaPresencial();
        System.out.printf("%s\n",estP1);
        
    }
}
