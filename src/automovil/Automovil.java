/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automovil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;


/**
 *
 * @author brian
 */
public class Automovil {
    private String marca;
    private String modelo;
    private String matricula;
    private int anoConstruccion;

    public Automovil(String marca, String modelo, String matricula, int anoConstruccion) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.anoConstruccion = anoConstruccion;
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", anoConstruccion=" + anoConstruccion + '}';
    }
    
    
}
