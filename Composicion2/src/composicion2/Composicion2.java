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
        // TODO code application logic here
    }
    Computadora a1= new Computadora(2017, 2017,null,
            new CPU("amd", 2017, 4.5,null,
                    new Monitor("Samsung", 2010, 19,null,
                            new Mouse("logitech", 2018, "alambrico",null,
                                    new Teclado("RK61", "2016", 61, 13)))));
    
    System.out.println( a1.getMarca());
}
