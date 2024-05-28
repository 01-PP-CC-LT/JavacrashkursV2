package g_Schleifen;

public class b_doWhileSchleife {
    public static void main(String[] args) {
        
        int number = 6;

        do {
            System.out.println(number);
            number++;

        } while (number <= 5);

        /* Beim ausführen des codes erkennen wir, dass obwohl die bedingung number kleiner oder gleich 5 nicht erfüllt ist (number = 6)
        trozdem die 6 ausgegeben wird
         * hieran sehen wir, dass der do Block erst einmal ausgeführt und erst dann die bedingung geprüft wird 
         * -> FUßGESTEUERTE Schleife!
         */
    }

}

/* Schleifen ermöglichen das Widerholte ausführen von Codeblöcken, bis das gewünschte ergebnis erreicht wird
 * Mit schleifen ist es möglich Datenstrukturen wie z.B. Arrays und Listen zu befüllen
 * 
 * ---------------------------------------------------------
 * 
 * Eine doWhile-Schleife ist nahezu identisch zur while-Schleife, jedoch ist sie FUßgesteuert, das heißt die bedingung wird am ENDE des Codeblockes überprüft
 * daraus folgt, dass eine doWhile-Schleife immer mindestens einmal ausgeführt wird
 */