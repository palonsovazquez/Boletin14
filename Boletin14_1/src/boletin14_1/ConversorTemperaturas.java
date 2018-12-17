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
public  class ConversorTemperaturas {

    private final static double TEMPERATURA_MINIMA = 80;

    public static float centigradosaFarenheith(float tempCentigrados) throws TemperaturaErradaExcepcion {
        float dev;
        if (tempCentigrados >= TEMPERATURA_MINIMA) {
            dev = (9f / 5f * tempCentigrados) + 32.4f;
        } else {
            throw new TemperaturaErradaExcepcion("La temperatura no puede ser inferior a " + TEMPERATURA_MINIMA + ".");
        }

        return dev;
    }

    public static float centígradosAReamur(float tempCentigrados) throws TemperaturaErradaExcepcion{
     float dev;
     if (tempCentigrados >= TEMPERATURA_MINIMA) {
     dev = 4f/5f*tempCentigrados;
    } else {
         throw new TemperaturaErradaExcepcion("La temperatura no puede ser inferior a " + TEMPERATURA_MINIMA + ".");
        }
         
     
    return dev;
}
}
