package g_Schleifen;

public class e_forEachSchleife {
    public static void main(String[] args) {
        String[] names = {"Lavi", "Jan", "Esther"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(i);
        }

    }

}

/* Schleifen ermöglichen das Widerholte ausführen von Codeblöcken, bis das gewünschte ergebnis erreicht wird
 * Mit schleifen ist es möglich Datenstrukturen wie z.B. Arrays und Listen zu befüllen
 * 
 * Eine forEach-Schleife ist eine spezielle Art von Schleife, welche bei jedem durchlauf eine Kopie des aktuellen Wertes der Datenstruktur einer Variable speichert
 * Diese gespeicherten Variablen können wir im Schleifenkörper verwenden
 * WICHTIG: auf die Kopie der Variablen kann nur lesend zugegriffen werden, das heißt, dass man die Werte nicht zuweisen (manipulieren) sondern nur ausgeben lassen kann!
 */