package com.itbulls.pichal;

public class EscapeSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My favourite book is \"The one thing\" by Gary Keller.");
		System.out.println("Path to the source code: D:\\Java\\sources");
		
		/*
		 	\t - tab.
			\b - backspace (a step backward in the text or deletion of a single character).
			\n - new line.
			\r - carriage return. ()
			\f - form feed.
			\' single quote.
			\" double quote.
			\\ backslash.
		 */
		
		System.out.println("some text line 1\nsome text line 2");
		
		System.out.println("Unicode characters, \u00A9 IT-Bulls.com");
System.out.println("sdf\njfhf");

System.out.println("===== String formatting =====");
System.out.println();
String firstName = "Pichal";

String greetingsTemplate = "Hello, dear %s! Good %s!";

String morning = "morning";
String afternoon = "afternoon";
String evening = "evening";
String formattedString = String.format(greetingsTemplate, firstName, evening);
System.out.println(formattedString);

System.out.printf("You have %d computers available at store\n", 5);
	}

}
