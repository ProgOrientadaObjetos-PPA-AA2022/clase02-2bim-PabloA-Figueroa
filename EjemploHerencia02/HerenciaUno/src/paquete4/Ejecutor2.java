/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        String nombre = "Pedrito";
        String apellido = "Paladinez";
        String identificacion = "1106060626";
        int edad = 15;        
        EstudiantePresencial estP1 = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);
        estP1.establecerNumeroCreditos(45);
        estP1.establecerCostoCredito(45);
        estP1.calcularMatriculaPresencial();
        System.out.println(estP1);
    }
}
