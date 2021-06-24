/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.objetos;

/**
 *
 * @author wesho
 */
public class CPU {
    private String marca;
    private String modelo;
    private int velocidadDeProcesador;

    public CPU() {
    }

    public CPU(String marca, String modelo, int velocidadDeProcesador) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadDeProcesador = velocidadDeProcesador;
    }

    public CPU(String amd, int i, double d, Object object, Monitor monitor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public int getVelocidadDeProcesador() {
        return velocidadDeProcesador;
    }

    public void setVelocidadDeProcesador(int velocidadDeProcesador) {
        this.velocidadDeProcesador = velocidadDeProcesador;
    }

    @Override
    public String toString() {
        return "CPU{" + "marca=" + marca + ", modelo=" + modelo + ", velocidadDeProcesador=" + velocidadDeProcesador + '}';
    }
    
}
