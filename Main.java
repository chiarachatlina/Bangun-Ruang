/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InheritanceDua;

/**
 *
 * @author chiara
 */
public class Main {
     public static void main(String[] args) {
        
        BgnRuang bangunRuang = new BgnRuang();
         System.out.println("Menghitung luas dan volume bangun ruang");
         System.out.println("==================================================");
        
        Kubus kubus = new Kubus();
        kubus.sisi = 2;
        
        Limas_Segitiga LimasSegitiga = new Limas_Segitiga();
        LimasSegitiga.t = 20;
        LimasSegitiga.a = 22;
        LimasSegitiga.T = 22;
        
        Bola Bola = new Bola();
        Bola.r = 8;
        
        Tabung Tabung = new Tabung();
        Tabung.r = 12;
        Tabung.t = 8;
        
        bangunRuang.luas();
        bangunRuang.volume();
        
        kubus.luas();
        kubus.volume();
         System.out.println();
        
        LimasSegitiga.volume();
         System.out.println();
        
        Bola.luas();
        Bola.volume();
         System.out.println();
        
        Tabung.luas();
        Tabung.volume();
    }
}
