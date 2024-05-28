package d_Operatoren;

public class ArithmetischeOperatoren {
    public static void main(String[] args) {
        int number1 = 3 + 4; //immer wenn Operatoren zwei oder mehrere Daten(typen) verknüpfen, bezeichnet man dieses als Ausdruck
        System.out.println(number1);

        int number2 = 3 - 4;
        System.out.println(number2);

        int number3 = 3 * 4;
        System.out.println(number3);

        int number4 = 4 / 2;
        System.out.println(number4);

        int result = number1 + number2; //Verkettung
        System.out.println(result);
        
        System.out.println(number1 + "" + number2); //nun wird erst Zahl 1 und dann Zahl 2 ausgegeben, da diese nicht direkt verkettet sind
    }
}

/*Bei Arithmetischen Operatoren handelt es sich um die aus der Mathematik bekannten Operatoren
 * + (Plus/Addition) - (Minus/Subtraktion) * (Mal/Multiplikation) / (geteilt/Division)
 * sowie - (minus in Form eines negativen Vorzeichens) und + (plus in form eines postitiven Vorzeichens)
 * der zweisungsoperator = fasst erst alles im Ausdruck zusammen (z.b. 3 + 4 = 7) und gibt dann das zusammengefasste Ergebnis aus
 * dies nennt man Verkettung
 */