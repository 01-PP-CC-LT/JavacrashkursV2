package b_variablen;

public class b_Arrays {
    public static void main(String[] args) {

        String[] names = new String[3]; //um der Variablen eine Array größe zuzuordnen, verwenden wir das schlüsselwort new, dann den Datentyp der Variablen 
        // und in [] schreiben wir eine ganze Integer Zahl um die größe des Arrays festzulegen
        names[0] = "Lavi"; //wir sagen dem Array, welches 3 Werte aufnehmen kann, dass an stelle 0 der String "Lavi" steht
        names[1] = "Jan";
        names[2] = "Esther";

        System.out.println(names[1]); //Wir geben hier die Anweisung, das zweite Element des Arrays auszugeben 

        for (int i = 0; i < names.length; i++) { /*in der for-Schleife sprechen wir hier das komplette Array an und geben die Anweisung, 
            alle Elemente nacheinander auszugeben (siehe for-Schleife)*/

            System.out.println(names[i]);
            
        }
        String[] names1 = {"Lukas", "Dani", "Rene"}; //wenn wir die Elemente des Arrays bereits kennen und diese fest zuordnen möchten, ist auch diese schreibweise möglich
        //wir können natürlich auch hier mit der Print Anweisung einzelne Elemente ausgeben, indem wir den Index des Elementes angeben statt mt [i] das komplette Array 

        for (int i = 0; i < names1.length; i++) {
            System.out.println(names1[i]);
        }
    } 
}
/* Arrays sind Datenstrukturen, die mehrere Werte (Variablen) beinhalten können
 * 
 * ------------------------------------------------
 * 
 * in einem Integer können wir z.B. nur eine Variable speichern, wohingegen wir in einem Integer Array so viele Werte speichern können wie wir eingestellt haben 
 * Die größe eines Arrays ist also Variabel
 * 
 * Bei Arrays wird die benennung im Plural vorgenommen um direkt am bezeichner Unterscheiden zu können, ob es sich um ein Array handelt oder nicht
 * Die größe eines Arrays wird immer bei der Initialisierung festgelegt, im Beispiel z.B. [3] um 3 Elemente im Array speichern zu können 
 * MERKE: Bei Arrays fangen wir immer an mit 0 zu zählen, nicht mit 1!
 */