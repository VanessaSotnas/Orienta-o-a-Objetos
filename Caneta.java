package orientacaoObjetos;

public class Caneta {

	public String modelo;
	public String cor;
	private double ponta;
	private int carga;
	protected boolean tampada; 
	
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public double getPonta() {
		return this.ponta;
	}
	
	public void setPonta(double ponta) {
		this.ponta = ponta;
	}
	
	public int getCarga() {
		return this.carga;
	}
	
	public void setCarga(int carga) {
		this.carga = carga;
	}
	
    
    public void rabiscar() {
    	if (this.tampada == true) {
    		System.out.println("Não posso rabiscar tampada.");
    	}
    	else { System.out.println("Estou pronta para rabiscar.");
     }
    }

    protected void tampar() {
    	this.tampada = true;    
    }
    
    protected void destampar() {
    	this.tampada = false;
    }
    
    public void status() {
    System.out.println("A caneta e : " + this.cor);
    System.out.println("Esta tampada? " + this.tampada);
    System.out.println("Qual o modelo? " + this.modelo);
    System.out.println("Ponta: " + this.ponta);
    System.out.println("Carga: " + this.carga + "%");
     }
       
    
   }
