package objetos;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Pessoa {
	
	// Atributos:
	
   private String nome;
   private int idade;
   private LocalDate dataNascimento; // int -> LocalDate
   
   // Métodos:
   
  
    
   public int calcularIdade (int idade, LocalDate dataNascimento) {
	  
	   SimpleDateFormat formatar = new SimpleDateFormat ("dd/MM/yyyy");
	   LocalDate dataDeHoje = new LocalDate.now();
	   
	   this.idade = idade;
	   this.dataNascimento = dataNascimento;
	   
	   
	  
     // estou tentando converter a data atual - data de nascimento, mas nao sei como.
     
     return  idadeReal = (dataDeHoje - dataNascimento);
   }
   
   public void informaIdade() {
	   System.out.println("A sua idade e: " + );
   }
   
   public void informaNome() {
	   System.out.println("Nome digitado: " + this.nome);
   }
   
	
}
