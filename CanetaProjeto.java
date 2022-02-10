package orientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

public class projeto {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Caneta c1 = new Caneta ();
		
	// Antes de usar os metodos Get e Set:	
		//c1.cor = "Rosa";
		//c1.modelo = "Bic";
		//c1.Ponta = 0.5f;
		//c1.carga = 100;
		//c1.destampar();
		
	// Utilizando Get e Set:
		c1.setCor("Rosa");
		c1.setModelo("Bic");
		c1.setPonta(0.5f);
		c1.setCarga(100);
		c1.destampar();
		
		c1.status();
        c1.rabiscar();
        
        System.out.println("A caneta criada é " + c1.getCor() + " da marca " + c1.getModelo() 
                            + ". Com uma ponta " + c1.getPonta() + "mm , e carga atual de " 
                            + c1.getCarga() + "%.");
        
       
    
    sc.close();
		
	}

}
