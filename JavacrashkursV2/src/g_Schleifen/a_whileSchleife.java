package g_Schleifen;

public class a_whileSchleife {
    public static void main(String[] args) {

        int number = 1; //wir möchten eine Schleife schreiben die die Zahlen 1 - 5 nacheinander Ausgibt, hierzu legen wir die 1 als Anfangswert fest 
        
        while (number <= 5) { //Bedingung: führe die Schleife aus, solange die Variable "number" kleiner als oder gleich 5 ist (siehe Boolesche Vergleichswerte)
            System.out.println(number); //gib die entsprechende Variable für number aus
            number += 1 ; // Der Variable "number" wird in jedem Schleifendurchlauf 1 addiert   (+= ist ein sogenannter kombinierter Zuweisungsoperator)

            // alternativ können wir auch "number ++;" schreiben, hier wird immer exakt 1 addiert, mit += kann man individuelle Werte festlegen

            //alles was in {} steht wird solange ausgeführt bis die Bedingung erfüllt ist (boolescher Ausdruck true)
        }
    }

}
/* Schleifen ermöglichen das Wiederholte Ausführen von Codeblöcken, bis das gewünschte Ergebnis erreicht wird
 * Mit Schleifen ist es möglich Datenstrukturen wie z.B. Arrays und Listen zu befüllen
 * 
 * ------------------------------------------------------
 * Eine While-Schleife ähnelt der If-Abfrage
 * Sie wird Wiederholt, solange bis eine Bedingung erfüllt wird
 * Bei einer while-Schliefe wird die Bedingung mit einem booelschen Ausdruck (true/false) gebildet
 * 
 * ------------------------------------------------------
 * Eine while Schleife ist eine sogenannte Kopfgesteuerte Schleife, das heißt, die Bedingung wird am ANFANG geprüft was zur Folge hat, dass sofern die Bedingung
 * nicht erfüllt ist, sie auch nicht ein einziges mal durchläuft - anders als die Fußgesteuerte do-while-Schleife - die mindestens 1 mal durchläuft, unabhängig von der Bedingung.
 */
