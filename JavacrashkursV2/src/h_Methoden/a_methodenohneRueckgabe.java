package h_Methoden;

public class a_methodenohneRueckgabe {

    public static void main(String[] args) {

        System.out.println("Vor dem Methodenaufruf!");
        doSomething();
        System.out.println("Nach dem Methodenaufruf!");

        System.out.println("Vor dem Methodenaufruf!");
        doSomethingelse(20, 20);
        System.out.println("Nach dem Methodenaufruf!");
        
    }
// Eine Methode hat einen ähnlichen Aufbau wie eine If-Anweisung

    public static void doSomething() {  //Methodenkopf
        int x = 10;                     //Methodenblock
        int y = 20;
        int result = x + y;
        System.out.println(result);
        
    }

    public static void doSomethingelse(int number1, int number2) {
        int x = number1;
        int y = number1 ;
        int result = x + y;
        System.out.println(result);
    }
}
/*Schlüsselworter:
 * public static: definieren wir näher in der Objektorientierung
 * void: ist der Rückgabetyp(Rückgabewert), wenn wir keinen Rückgabewert benötigen, ist das Schlüsselwort void, statt eines Datentypes
 * 
 * Bei der Main Methode, handelt es sich ebenfalls um eine Methose, sowie bei der println Funktion 
 * Einer Methode können wir in () Parameter übergeben, () kann aber auch leer bleiben 
 * Wenn innerhalb von () mehrere Parameter übergeben werde, müssen diese auch in gleicher Reihenfolge aufgerufen werden
 * Anhand der Ausgabe können wir erkennen, wann die Methode aufgerufen wird 
 */