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
public class Computadora {
    private int marca;
    private int modelo;

    public Computadora() {
    }

    public Computadora(int marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Computadora(int i, int i0, Object object, CPU cpu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }
    
    
}
