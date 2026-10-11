/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author USUARIO
 */
import java.util.List;
import java.util.Scanner;
import modelo.Competidor;

public class VistaMundial {

    private Scanner sc = new Scanner(System.in);

    public int menu() {
        System.out.println("\n=== MUNDIAL DE CICLISMO DE PISTA - CALI ===");
        System.out.println("1. Registrar competidor");
        System.out.println("2. Ver clasificación");
        System.out.println("0. Salir");
        return leerEntero("Opción: ");
    }

    public String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine().trim();
    }

    public int leerEntero(String mensaje) {
        while (true) {
            try {
                return Integer.parseInt(leerTexto(mensaje));
            } catch (NumberFormatException e) {
                mostrar("Valor inválido, intente de nuevo.");
            }
        }
    }

    public double leerDecimal(String mensaje) {
        while (true) {
            try {
                return Double.parseDouble(leerTexto(mensaje).replace(',', '.'));
            } catch (NumberFormatException e) {
                mostrar("Valor inválido, intente de nuevo.");
            }
        }
    }

    public void mostrar(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarLista(List<Competidor> lista) {
        if (lista.isEmpty()) {
            mostrar("No hay competidores registrados.");
            return;
        }
        int numero = 1;
        for (Competidor c : lista) {
            mostrar(numero + ". " + c);
            numero++;
        }
    }
}