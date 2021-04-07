package main;

import exceptions.LexicalException;
import lexico.Scanner;
import lexico.Token;

public class Principal {

	public static void main(String[] args) {
		try {	
		Scanner sc = new Scanner("input.isi");
		Token token = null;
		
		do {
			token = sc.nextToken();
			if (token != null) {
				System.out.println(token);
			}
		}while (token != null);
		}catch (LexicalException ex) {
			System.out.println("Lexical ERROR "+ex.getMessage());
	    }
		catch (Exception ex) {	
		System.out.println("Generic Error!!");
	    }
	}
	

}
