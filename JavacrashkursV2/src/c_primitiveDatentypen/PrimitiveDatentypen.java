package c_primitiveDatentypen;

public class PrimitiveDatentypen {

	public static void main(String[] args) {
		
		byte test = 120; //Byte kann aufgrund der größe Ganzzahlen bis 127 aufnehmen 
		// sollte der wert 128 annhemen wird der Datentyp short zugeordnet
		System.out.println(test);

		double test1 = 2.3;//Bei Gleitkommazahlen wird die nachkommastelle durch "." getrennt und nicht durch ","!
		System.out.println(test1);

		boolean test2 = false; 
		System.out.println(test2);

		String test3 = "Hello World";
		System.out.println(test3);
		
		String test4 = "Lavi";
		System.out.println("String vorführung: " + test4 + " ist super!");
	}

}

/*Arten von Datentypen und deren Größe
 * boolean = undefiniert ; kann nur true oder false annehmen 
 * char = 16 bit ; zum speichern von einzelnen Zeichen 
 * byte = 8 bit ; für Ganzzahlen
 * short = 16 bit ; für Ganzzahlen
 * int = 32 bit ; für Ganzzahlen
 * long = 64 bit ; für Ganzzahlen
 * float = 32 bit ; für Fließkommazahlen (auch Gleitkommazahlen genannt)
 * double = 64 bit ; für Fließkommazahlen */

 /*Die Klasse String 
 unter einer Klasse versteht man einen komplexen Datentyp
  * String: Ein String ist ein Textwert der übergeben wird 
mithilfe der Klasse String können mehrere Zeichen übergeben werden, wohingegen der Datentyp char nur ein Zeichen fassen kann

Merke: primitive Datentypen werden Kleingeschrieben, Klassennamen werden großgeschrieben

Strings und Variablen können mit einem + Verknüpft werden 
  */
