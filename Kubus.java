/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InheritanceDua;

/**
 *
 * @author chiara
 */
public class Kubus extends BgnRuang {   
  float sisi;
   @Override
    float luas(){
        float luas = 6 * sisi * sisi;
        System.out.println("Luas kubus: " + luas + "cm");
        return luas;
    }

    @Override
    float volume(){
        float volume = 3 * sisi;
        System.out.println("volume kubus : " + volume + "cm3");
        return volume;
    }
}