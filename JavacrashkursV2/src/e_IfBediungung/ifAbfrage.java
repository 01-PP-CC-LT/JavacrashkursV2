package e_IfBediungung;

public class ifAbfrage {
    public static void main(String[] args) {
        if(3 < 4) {
            System.out.println("Das ist korrekt");
        }

        int age = 18; //wenn hier die Variable geändert wird, ändert die die Ausgabe entsprechend
        if(age > 17) {
            System.err.println("Du bist volljährig");
        }
        else {
            System.out.println("Du bist minderjährig");  // else ist eine Verzweigung die abgefragt wird, sollte die bedingung nicht erfüllt sein
        }
        
    }
    
}
/* Bei der If_Abfrage handelt es sich um einen sogenannten Booelschen Operator, das heißt die Anfrage kann nur mit
einem Wahrheitswert (True oder False) beantwortet werden 
Hiermit kann man nun Bedingungen erfüllen

------------------------------------------
Vergleichsoperatoren

< (kleiner als) = true    1 < 6  
> (größer als) = false      1 > 6
<= (kleiner als oder gleich) = true     4 <= 4 (true)   3 >= 4 (true) 
>= (größer als oder gleich) = true      4 >= 4 (true)   6 >= 4 (true)
== (gleich) true oder false je nachdem ob die bedingung erfüllt ist oder nicht       4 == 4 (true) 3 == 4 (false)     
!= (ungleich) false oder true je nachdem obdie Bedingung erfüllt ist oder nicht      4 != 4 (false) 3 != 4 (true)*/