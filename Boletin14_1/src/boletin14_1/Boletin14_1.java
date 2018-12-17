/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14_1;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin14_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    try{
    ConversorTemperaturas.centigradosaFarenheith(89);
    
    }catch(TemperaturaErradaExcepcion e){
        System.out.println(e.toString());
    }
    try{
    ConversorTemperaturas.centígradosAReamur(89);
    
    }catch(TemperaturaErradaExcepcion e){
        System.out.println(e.toString());
    }
    
    
    }
    
}
