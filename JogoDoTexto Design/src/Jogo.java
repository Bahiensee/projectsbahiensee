import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {

     System.out.println("Você está em uma casa no meio da floresta...");
     System.out.println("Escolha uma direção (w, d, s, a,):");
 
	 Scanner scan = new Scanner(System.in);
	
	 String op = scan.nextLine();
	
     do {
    	 
    	 
    	op = scan.nextLine();
    	 
    	if(op.equals("w"))   {
    	     System.out.println("Parede! Você bateu a cabeça e morreu!");
    	 }
    	 else if(op.equals("d"))  {
    		 System.out.println("Lobos selvagens! Você foi devorado");
    	 }
    	 else if(op.equals("s")) {
    	 System.out.println("Cuidado, monstro! Você foi esmagado");
    	 }
    	 else if(op.equals("a")) {
    		 System.out.println("Você encontrou a saída! Parabéns!!!");
    	 }
    	 
     }while(!op.equals("a"));
     
    
	}
     }


