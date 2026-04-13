/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesjava;

/**
 *
 * @author Kimy
 */
public class Classesjava {

    /**
     * @param args the command line arguments
     */
    package classesjava;

public class Classesjava {
    public static void main(String[] args) {
        Pneu p1 = new Pneu(205, 55, 16, "été");

        Voiture v1 = new Voiture("Peugeot", "208", 2021, 14500, p1);

        System.out.println("Voiture : " + v1.marque + " " + v1.modele);
        System.out.println("Pneu    : " + v1.pneu.largeur + "/" + v1.pneu.hauteur + " R" + v1.pneu.diametre + " " + v1.pneu.type);
}
    }
    
}
