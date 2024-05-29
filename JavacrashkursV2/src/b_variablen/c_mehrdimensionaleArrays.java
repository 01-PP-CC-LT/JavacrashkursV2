package b_variablen;

public class c_mehrdimensionaleArrays {

    public static void main(String[] args) {
        
        String[][] firstAndLastName = new String [5][2];

        firstAndLastName[0][0] = "Lavi";
        firstAndLastName[0][1] = "Mii";

        firstAndLastName[1][0] = "Samus";
        firstAndLastName[1][1] = "Aran";

        firstAndLastName[2][0] = "Super";
        firstAndLastName[2][1] = "Mario";

        firstAndLastName[3][0] = "Fox";
        firstAndLastName[3][1] = "McCloud";

        firstAndLastName[4][0] = "Dio";
        firstAndLastName[4][1] = "Brando";

        for (int i = 0; i < firstAndLastName.length; i++) {          //Äußere for-Schleife für den Zeilenindex
            for (int j = 0; j < firstAndLastName[i].length; j++) {   //Innere for-Schleife für den Spaltentindex
                System.out.print(firstAndLastName[i][j] + " ");
                
            }
            System.out.println();
        }
    }

}
/*Bei mehrdimensionalen Arrays handelt es sich um Datensammlungen, welche mehrere Dimensionen verwenden können,
 beispielsweise eine Tabelle (zweidimensional) oder ein Würfel (dreidimensional) 
 Wir sprechen hier einen komplexen index an, 
 also brauchen wir bei einem zweidimensionalen Array zwei koordinaten um das entsprechende Element anwählen zu können
 In einem zweidimensionalen Array (beispielsweise einer Tabelle) benötigen wir den Index der Spalte und den Index der Zeile in der sich das Element befindet,
 welches wir aufrufen möchten

 ---------------------------------------------------------------------
bei einem dreidimensionalen Array benötigen wir entsprechend 3 koordinaten 
es sind auch weitere Dimensionen als 3 möglich, jedoch wird dies selten verwendet da die visualisierung von mehr als drei Dimensonen sehr abstrakt ist 

 --------------------------------------------------------------------- 
Die mehrdimensionalen Arrays sind prinzipell genauso aufgebaut wie eindimensionale, wir sprechen lediglich mehrere Koordinaten gleichzeitig an 
 */