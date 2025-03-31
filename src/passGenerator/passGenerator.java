package passGenerator;

import java.util.Scanner;

public class passGenerator {
 public static void main(String[] args) {
	 /* Todo Create un nuovo progetto java chiamato java-password-generator. 
	   Aggiungete una classe PasswordGenerator nel package org.lessons.java.security che contiene un metodo main.
	   Il programma deve fare quanto segue:
       salvare in opportune variabili il nome, cognome, 
       colore preferito e data di nascita di un utente suddivisa in giorno, mese e anno 
       in numero generare (e stampare a video) una password concatenando nome, cognome,
       colore preferito e somma di giorno, mese e anno di nascita, separate dal carattere 
       - Esempio Ho un utente che si chiama Pinco Pallo, nato il 12/05/1994, 
       il cui colore preferito è il magenta. La sua password sarà Pinco-Pallo-magenta-2011*/
	 
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Inserisci il tuo nome");
	 String nome = scan.next();
	 System.out.println("Inserisci il tuo cognome");
	 String cognome = scan.next();
	 System.out.println("Inserisci il tuo colore preferito");
	 String colore = scan.next();
	 scan.nextLine();
	 System.out.println("inserisci il tuo giono di nascita (numero)");
	 int giorno = scan.nextInt();
	 System.out.println("Inserisci il tuo mese di nascita (numero)");
	 int mese = scan.nextInt();
	 System.out.println("Inserisci il tuo anno di nascita (numero)");
	 int anno = scan.nextInt();	 
 }
}
