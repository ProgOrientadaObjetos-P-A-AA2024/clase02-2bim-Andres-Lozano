/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        // Ingresar estudiante de tipo presencial por teclado.
        // El usuario decide cuando terminar
        // No utilizar super.toString en EstudiantePresencial
        // Debe existir 1 sola impresión de todos los estudiantes presenciales
        // No usar arreglos

        // Trabajo clases 16 junio 2022
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String cadena = "";

        while (bandera) {
            System.out.println("Ingrese los datos del estudiante presencial:");
            System.out.print("Nombre: ");
            String nombre = entrada.nextLine();
            System.out.print("Apellido: ");
            String apellido = entrada.nextLine();

            System.out.print("Identificacion: ");
            String id = entrada.nextLine();

            System.out.print("Edad: ");
            int edad = entrada.nextInt();

            System.out.print("Costo de Creditos: ");
            double cred = entrada.nextDouble();
            System.out.print(" Numero de Creditos: ");
            int num = entrada.nextInt();
            entrada.nextLine();
            EstudiantePresencial estu = new EstudiantePresencial(nombre, apellido, id, edad, cred, num);
            estu.calcularMatriculaPresencial();
            System.out.printf("%s%s\n", cadena, estu);

            System.out.print("Desea salir pusle S: ");
            String opcion = entrada.nextLine();
            if (opcion.equals("S")) {
                bandera = false;
                entrada.nextLine();

            }

        }

        System.out.printf("%s\n", cadena);

    }
}
