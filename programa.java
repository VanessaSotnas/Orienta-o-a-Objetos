package contaBancaria;

import java.util.Scanner;

public class programa {

   public static void main(String[] args) {
	   
	   Scanner sc = new Scanner(System.in);

   // Para abrir uma nova conta:
	   
	ContaBanco p1= new ContaBanco ();    
	     
    p1.setNomeTitular("Vanessa Santos");
    p1.setNumeroConta(489453);
    p1.setTipo("CC");
    p1.setStatus(true);
    p1.setSaldo(2000.0);
    
    p1.estadoAtual();
    

   }
	
}
