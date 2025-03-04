/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaslocales;

/**
 *
 * @author Ricardo Flores
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("estamos aprendiendo git");
        NuevaClase.printarMensaje("otro mensaje");

        ComoQuierasSecuela cqs = new ComoQuierasSecuela();
        cqs.escribirMensaje("texto de prueba");

        Rama1 ram = new Rama1();
        ram.escribirMensaje("practicando con git");
        Rama2 rama = new Rama2();
        rama.escribirMensaje("practicando el merge con conflictos");

    }
}
