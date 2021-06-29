/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion2;

import ico.fes.objetos.CPU;
import ico.fes.objetos.Computadora;
import ico.fes.objetos.Monitor;
import ico.fes.objetos.Mouse;
import ico.fes.objetos.Teclado;

/**
 *
 * @author wesho
 */
public class Composicion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora a1 = new Computadora(2017, 2017);
        System.out.print(a1);
    CPU b1 = new CPU("amd", "2017", 4);
        System.out.println(b1);
    Monitor c1 = new Monitor("Samsung", "2010", 19);
        System.out.println(c1);
    Mouse d1 = new Mouse("logitech", "2018", "alambrico");
        System.out.println(d1);
    Teclado e1 = new Teclado("RK61", "2016", 61, 13);
        System.out.println(e1);
        // TODO code application logic here
    }
    
}
