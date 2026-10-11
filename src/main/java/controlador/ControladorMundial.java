/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author USUARIO
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import modelo.Competidor;

public class ControladorMundial {

    private List<Competidor> competidores = new ArrayList<>();

    public void registrar(Competidor competidor) {
        competidores.add(competidor);
    }

    public List<Competidor> clasificacion() {
        List<Competidor> copia = new ArrayList<>(competidores);
        copia.sort(Comparator.comparingInt(Competidor::getRanking).reversed());
        return copia;
    }
}