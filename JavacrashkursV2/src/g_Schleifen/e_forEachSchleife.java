package g_Schleifen;

public class e_forEachSchleife {
    public static void main(String[] args) {

        String[] names = {"Lavi", "Jan", "Esther"}; 

        for (int i = 0; i < names.length; i++) { //Wir inaitialisieren hier das Array 
            System.out.println(names[i]);
            
        }

        for (String name : names) {  //Wir geben mit der foreach-Schleife die Anweisung in jedem Schleifendurchlauf eine Kopie des Elements des Arrays auszugeben
            System.out.println(name);
            
        }

    }

}

/* Schleifen ermöglichen das Widerholte ausführen von Codeblöcken, bis das gewünschte ergebnis erreicht wird
 * Mit schleifen ist es möglich Datenstrukturen wie z.B. Arrays und Listen zu befüllen
 * 
 * Eine forEach-Schleife ist eine spezielle Art von Schleife, welche bei jedem durchlauf eine Kopie des aktuellen Wertes der Datenstruktur einer Variable speichert
 * Diese gespeicherten Variablen können wir im Schleifenkörper verwenden
 * Wir können hiermit also kein Array Initialisieren!
 * Der nutzen einer forEach-Schleife liegt darin, dass wir die möglichkeit haben auf Werte eines bereits initialisierten Arrays zuzugreifen und diese aufzurufen,
 * ohne die Array bedingungen erneut definieren zu müssen
 * WICHTIG: auf die Kopie der Variablen kann nur lesend zugegriffen werden, das heißt, dass man die Werte nicht zuweisen (manipulieren) sondern nur ausgeben lassen kann!
 */