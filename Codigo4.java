package org.generation;

import java.util.Scanner;

public class Codigo4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String j1 = "", j2="";
		
	    do {
	    	System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		    j1 = scan.nextLine();
		    j1 = j1.toLowerCase();
		    
		    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		     j2 = scan.nextLine();
		    j2 = j2.toLowerCase();
	    }while(((!j1.equals("piedra"))&&(!j1.equals("papel"))&&(!j1.equals("tijeras")))||
	    		((!j2.equals("piedra"))&&(!j2.equals("papel"))&&(!j2.equals("tijeras"))));
	    
	    scan.close();
	    
	    if (j1.equals(j2)) {
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2.equals("tijeras")) {
	            g = 1;
	          }
	          break;

	        case "papel":
	          if (j2.equals("piedra")) {
	            g = 1;
	          }
	          break;
	          
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + g);
	    }

	}

}
