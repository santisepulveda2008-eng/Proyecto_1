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
}
