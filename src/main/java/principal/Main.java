/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author USUARIO
 */
import controlador.ControladorMundial;
import modelo.Competidor;
import vista.VistaMundial;

public class Main {

    public static void main(String[] args) {
        ControladorMundial controlador = new ControladorMundial();
        VistaMundial vista = new VistaMundial();
        int opcion;

        do {
            opcion = vista.menu();
            switch (opcion) {
                case 1: {
                    String nombre = vista.leerTexto("Nombre: ");
                    int edad = vista.leerEntero("Edad: ");
                    String pais = vista.leerTexto("País: ");
                    int ranking = vista.leerEntero("Ranking inicial (puntos): ");
                    double estatura = vista.leerDecimal("Estatura (m): ");
                    double peso = vista.leerDecimal("Peso (kg): ");
                    controlador.registrar(new Competidor(nombre, edad, pais, ranking, estatura, peso));
                    vista.mostrar("Competidor registrado.");
                    break;
                }
                case 2:
                    vista.mostrarLista(controlador.clasificacion());
                    break;
                case 0:
                    vista.mostrar("Hasta luego.");
                    break;
                default:
                    vista.mostrar("Opción inválida.");
            }
        } while (opcion != 0);
    }
}