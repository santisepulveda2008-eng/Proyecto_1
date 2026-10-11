/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class Competidor extends Atleta {

    private int ranking;
    private double estatura;
    private double peso;

    public Competidor(String nombre, int edad, String pais, int ranking, double estatura, double peso) {
        super(nombre, edad, pais);
        this.ranking = ranking;
        this.estatura = estatura;
        this.peso = peso;
    }

    public int getRanking() {
        return ranking;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return super.toString() + " | Ranking: " + ranking + " pts | Estatura: " + estatura
                + " m | Peso: " + peso + " kg";
    }
        public void actualizarRanking(int puntosObtenidos) {
        if (puntosObtenidos > 0) {
            ranking += puntosObtenidos;
        }
    }

    public void actualizarRanking(int puntosObtenidos, boolean ganoMedalla) {
        if (puntosObtenidos <= 0) {
            return;
        }
        int bonificacion;
        if (ganoMedalla) {
            if (puntosObtenidos >= 50) {
                bonificacion = 20;
            } else {
                bonificacion = 10;
            }
        } else {
            if (puntosObtenidos >= 50) {
                bonificacion = 5;
            } else {
                bonificacion = 0;
            }
        }
        ranking += puntosObtenidos + bonificacion;
    }
}
