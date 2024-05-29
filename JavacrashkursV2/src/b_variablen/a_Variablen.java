package b_variablen;

public class a_Variablen {

	public static void main(String[] args) {
		int age = 27;  //Dies nennt sich initialisierung, der Wert wird fest zugewiesen
		
		int age2; //Dies nennt sich Deklaration; die variable wird nur deklariert, danach kann individuell ein Wert zugewiesen werden 
		age2 = 29; //Zuweisung eines Individuell benötigten Wertes

		System.out.println(age);
		System.out.println(age2);// Der zugewiesene Wert für die Variable age wird ausgegeben
	}

}
/* Variablen sind "Datenbehälter"
 * eine Variable muss 
 * 1. den Datentyp und
 * 2. einen bezeichner umfassen
 * eine Variable sollte immer bezeichnend, kleingeschrieben und auf Englisch benannt werden
 * z.b. eine Variable für ein Alter wird age genannt
 * wenn die benennung mehrere worte umfasst, sollten diese endweder mit _ oder ohne Leerzeichen benannt werden 
 * z.b. ageMe / age_me
 * um eine Variable ztu definieren gibt man zuerst den Datentyp an 
 * int = Integer(Ganzzahlen) 
 * age = Bezeichnung
 * "=" = zuweisungsoperator um der Variable einen Wert zuzuweisen
 * 27 = zugewiesener Wert*/