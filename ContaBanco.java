package contaBancaria;

public class ContaBanco {

	  // Atributos: 
	public int numeroConta;
	protected String tipo;
	private String nomeTitular;
	private double saldo;
	private boolean status;
	
	 // Gets e Sets:
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	// Metodos:
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		   if (t == "CC") {
			   this.setSaldo(50.0); }
		   else if (t == "CP"){
			   this.setSaldo(150.0);   
			   }
		   System.out.println("Conta aberta com sucesso.");
		   }
	
	public void fecharConta () {
		if (this.getSaldo() > 0) {
			System.out.println("Conta positiva. Retire seu dinheiro para fechar a conta."); }
			else if (this.getSaldo() < 0) {
				System.out.println("Conta negativa. Zere os debitos para fechar a conta."); }
			else {
				 this.setStatus(false);
				 System.out.println("Conta fechada com sucesso.");
			}
		}
		
	public void depositar (double v) {
		if (this.getStatus()) {
			//this.saldo = this.saldo + v;
			this.setSaldo(getSaldo() + v); 
		    System.out.println("Deposito realizado na conta de " + this.getNomeTitular()); }
			else {
				System.out.println("Impossivel depositar em uma conta fechada.");
			}
		}
	
	
	public void sacar (double v) {
		if (this.getStatus()) {
			if (this.getSaldo() < v) {
				System.out.println("Saldo insulficiente para saque."); }
				else if ( this.getSaldo() >= v) {
					this.setSaldo(getSaldo() - v);
					System.out.println("Saque realizado com sucesso."); }			
		}
		else {
			System.out.println("Impossivel sacar de um conta fechada."); }
	}
	
	
	public void pagarMensal () {
		int v = 0;
			if (this.getTipo() == "CC") {
				v = 12; }
				// this.setSaldo(this.getSaldo() - 12); 
				// System.out.println("Mensalidade da conta corrente debitada com sucesso."); 
			else if (this.getTipo() == "CP") {
				v = 20;  }
				// this.setSaldo(this.getSaldo() - 20);
				//System.out.println("Mensalidade da conta poupanca debitada com sucesso.");
			if (this.getStatus()) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Mensalidade paga com sucesso por " + this.getNomeTitular()); }
			else {
				System.out.println("Impossivel pagar mensalidade de uma conta fechada."); }
		}
	
	
    // Metodos especiais:
	
	public void ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public void estadoAtual() {
		System.out.println("Conta: " + this.getNumeroConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Titular: " + this.getNomeTitular());
		System.out.println("Saldo: R$" + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}
	
}
