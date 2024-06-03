//Dieses Programm referenziert Werte aus b_02Car
package i_objektorientierung;

public class b_01KlassenundMethoden {
    public static void main(String[] args) {

        b_02Car car1 = new b_02Car();   //Instanziierung eines Objektes
        car1.drive(); //Wir haben hier die Methode auf das erzeugte Objekt angewendet und erhalten die definierte Ausgabe
    }

}
/* Eine Klasse ist ein Bauplan für ein Objekt und diese legt fest welche Eigenschaften/Attribute ein Objekt hat
 * und welche Methoden das Objekt ausführen kann.
 * Jedes erzeugte Objekt kann die Methoden, die in der Klasse definiert wurden, ausführen und seine eigenen Attribute dabei ausgeben.
 * Jede Klasse kann beliebig viele Objekte erzeugen.
 * ---------------------------------------------------------------------
 * In Java ist es gängige konvention, dass jede Klasse eine eigene Datei(File) hat
 * Die Klasse Car definieren wir in der Datei b_02Car
 * siehe Z6: b_02Car (Variablendeklaration) car1(Bezeichnung des erzeugten Objektes) = (Zuweisungsoperator)
 * new (Schlüsselwort zur Instanziierung) b_02Car (Klassenname) + () um dort ggf Eigenschaften zuzuweisen
 * ---------------------------------------------------------------------
 * Methoden
 * Statische Methoden sind nicht an ein Objekt einer Klasse gebunden (Schlüsselwort static) das heißt,
 * wir können diese Methode aufrufen ohne zuvor ein Objekt Instanziiert zu haben 
 * 
 * Eine normale Methode, welche innerhalb einer Klasse defineirt wird, benötigt ein Objekt zum aufrufen (siehe b_02Car)
 */