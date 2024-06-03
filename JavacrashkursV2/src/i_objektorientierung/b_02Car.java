//Dieses Programm referenziert Werte aus b_01KlassenundMethoden
package i_objektorientierung;

public class b_02Car {
    //Attribute/Eigenschaften
    private String color;   //Farbe
    private String brand;   //Marke
    private int horsePower; //PS-Zahl

    //Methoden
    public void drive(){ //Dies ist eine Methode, welche nicht statisch ist, das Schlüsselwort static fehlt!
        System.out.println("Das Auto fährt...");
    }
}
/*In einer Klasse verkapselt man alle Eigenschaften, welche für das Objekt wichtig sind */