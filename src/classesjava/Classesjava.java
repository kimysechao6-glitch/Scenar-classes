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

public class Main {
    public static void main(String[] args) {
        Voiture v1 = new Voiture("Peugeot", "208", 2021, 14500);
System.out.println("Prix initial : " + v1.prix + " €");

        v1.appliquerReduction(10);
System.out.println("Après -10% : " + v1.prix + " €");


        Voiture v2 = new Voiture("Peugeot", "208", 2021, 14500);
        v2.appliquerReduction(20);
System.out.println("Après -20% : " + v2.prix + " €");

        Voiture v3 = new Voiture("Peugeot", "208", 2021, 14500);
        v3.appliquerReduction(30);
System.out.println("Après -30% : " + v3.prix + " €");
    }
}