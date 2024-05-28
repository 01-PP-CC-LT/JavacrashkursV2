package g_Schleifen;

public class whileSchleifen {
    public static void main(String[] args) {

        int number = 1; //wir möchten eine Schleife schreiben die die Zahlen 1 - 5 nacheinander Ausgibt, hierzu legen wir die 1 als Anfangswert fest 
        
        while (number <= 5) { //bedingung: führe die Schleife aus, solange die Variable "number" kleiner als 5 ist (siehe Booelsche vergleichswerte)
            System.out.println(number); //gib die entsprechende Variable für number aus
            number += 1 ; // Der Variable "number" wird in jeder Schleife 1 addiert   (+= ist ein sogenannter kombinierter Zuweisungsoperator)

            // alternativ können wir auch "number ++;" schreiben, hier wird immer exakt 1 addiert, mit += kann man individuelle Werte festlegen

            //alles was in {} steht wird solange ausgeführt bis die bedingung erfüllt ist (booelscher Ausdruck true)
        }
    }

}
/* Schleifen ermöglichen das Widerholte ausführen von Codeblöcken, bis das gewünschte ergebnis erreicht wird
 * Mit schleifen ist es möglich Datenstrukturen wie z.B. Arrays und Listen zu befüllen
 * 
 * ------------------------------------------------------
 * Eine While Schleife ähnelt der If-Abfrage
 * Sie wird Wiederhilt, solange bis eine Bedingung erfüllt wird
 * Bei einer while Schliefe wird die Bedingung mit einem booelschen Ausdruck (true/false) gebildet
 */