package h_Methoden;

public class b_methodenmitRueckgabewert {
    public static void main(String[] args) {
        
        System.out.println("Vor dem Methodenaufruf!");
        int resultFromMethodDoSomething = doSomething(30, 50);
        System.out.println(resultFromMethodDoSomething);
        System.out.println("Nach dem Methodenaufruf!");
    }

    public static int doSomething(int number1, int number2){
        int result = number1 + number2;
        return result; 
    }
}
/* Bei Methoden mit Ausgabewert, wird "void" durch einen Datentyp ersetzt 
 * Die Rückgabe können wir auch als "Ergebnis" der Methode ansehen
 * 
 * Im Codebeispiel haben wir den Datentyp Integer festgelegt und dieser Methode die Variablen number1 und number2 übergeben,
 * sowie result als Ergebnis der addition von beiden definiert
 * Dann haben wir result als return-Wert festgelegt (Z12-14)
 * Da wir nun einen return-Wert für die doSomething Methode festgelegt haben, können wir nun eine Ausgabe definieren (Z 6-9)
 * Wir weisen nun das ergebnis der Methode doSomething der variable resultFromMethodDoSomething zu (bezeichnende Benennung der Variable!)
 * und lassen diese Variable mit println Augeben 
 */