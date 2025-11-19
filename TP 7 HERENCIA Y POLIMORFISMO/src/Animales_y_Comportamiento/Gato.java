/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_y_comportamiento;

public class Gato extends Animal {

    public Gato(String filo, String clase, String orden, String familia) {
        super(filo, clase, orden, familia);
    }

    @Override
    public void hacerSonido(){
        System.out.println("Miauu, miauu, miauu");
    }
    
    @Override
    public void describirAnimal(){
        System.out.println(" El gato es un mamifero carnivoro de la familia"
                    + " de los felidos, valorados como animales de compa#ia. "
                    + "Se caracterizan por su agilidad, sus garras retractiles"
                    + " y una excelente vision nocturna. Aunque son depredadores"
                    + " por naturaleza, han desarrollado una vida social compleja"
                    + " con los humanos, de quienes son muy independientes.");
    }
}