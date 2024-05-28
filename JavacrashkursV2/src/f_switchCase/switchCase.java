package f_switchCase;

public class switchCase {
    public static void main(String[] args) {
        String month = "Yeet";

        switch (month) {
            case "Januar": System.out.println("Januar");
                
                break; //break bedeutet, dass der Codeblock sofort endet wenn der entsprechende Case erfüllt ist, so werden unnötige Abfragen vermieden

            case "Februar": System.out.println("Februar!");

                 break;

            case "März": System.out.println("März!");

                 break;
    

            case "April": System.out.println("April!");

                 break;
    

            case "Mai": System.out.println("Mai!");

                 break;
    

            case "Juni": System.out.println("Juni!");

                 break;

            case "Juli": System.out.println("Juli!");

                 break;

            case "August": System.out.println("August!");

                 break;

            case "Septmeber": System.out.println("September!");

                 break;

            case "Oktober": System.out.println("Oktober!");

                 break;

            case "November": System.out.println("November!");

                 break;

            case "Dezember": System.out.println("Dezember!");

                 break;
    
         default: System.out.println("Es gibt keinen Monat der " + month + " heißt!"); //Ausgabe wenn kein case der Abfrage entspricht
                 break;
        }
        
    }

}
/* 
 *Switch-Blöcke (Switch case Abfrage) sind eine Kontrollstruktur zum steuern des Programmablaufes
 Der Codeblock wird anhand von Konstanten ausgeführt die vorher festgeegt werden
 Am ende des Switches muss ein default case festgelegt werden, welcher ausgeführt wird wenn kein case mit der Abfrage übereinstimmt
 */