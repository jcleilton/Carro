
public class Carro {
	
	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	private boolean estado = false;
	private double velocidadeAtual;
	private double velocidadeMaxima;
	
	
	public Carro(String mounter, String model, int year, String color, double veloMax){
		this.marca = mounter;
		this.modelo = model;
		this.ano = year;
		this.cor = color;
		this.velocidadeMaxima = veloMax;
		this.velocidadeAtual = 0.0;
		System.out.println("Carro comprado com sucesso! Marca: " + this.marca + " - Modelo: " + this.modelo + " - Ano: " + this.ano + " - Cor: " + this.cor + " - Velocidade máxima: " + this.velocidadeMaxima + "km/h.");
	}
	
	public void liga(){
		if (!this.estado){
			this.estado = true;
			System.out.println("Vruuum! Carro ligado!");
		} else{
			System.out.println("Já está ligado!");
		}
	}
	
	public void desliga(){
		if (this.estado){
			this.estado = false;
			System.out.println("Carro desligado!");
		} else{
			System.out.println("Já está desligado!");
		}
	}
	
	public void acelera(double velocidade){
		if (this.estado){
			if (this.velocidadeAtual + velocidade >= this.velocidadeMaxima){
				this.velocidadeAtual = this.velocidadeMaxima;
				System.out.println("O carro alcançou a velocidade máxima! " + this.velocidadeAtual + "km/h.");
			} else {
				this.velocidadeAtual += velocidade;
				System.out.println("Velocidade atual: " + this.velocidadeAtual + "km/h.");
						
			}
		} else {
			
			System.out.println("Ligue o carro!");
			
		}
		
	}
	
	public void reduz(double velocidade){
		if (this.estado){
			if (this.velocidadeAtual - velocidade <= 0.0){
				this.velocidadeAtual = 0.0;
				System.out.println("O carro parou! " + this.velocidadeAtual + "km/h.");
			} else {
				this.velocidadeAtual -= velocidade;
				System.out.println("Velocidade atual: " + this.velocidadeAtual + "km/h.");
						
			}
		} else {
			
			System.out.println("Ligue o carro!");
			
		}
	}
	
	public void parar(){
		if (this.estado){
			if (this.velocidadeAtual > 0.0){
				this.velocidadeAtual = 0.0;
			} else{
				System.out.println("Já está parado!");
			}
		} else {
			System.out.println("Ligue o carro!");
		}
		
	}
	
	public int getMarcha(){
		if (this.estado){
			if (this.velocidadeAtual > 0.0 && this.velocidadeAtual < 20.0){
				return 1;
			} else if (this.velocidadeAtual >=20.0 && this.velocidadeAtual < 40.0){
				return 2;
			} else if (this.velocidadeAtual >= 40.0 && this.velocidadeAtual < 60.0){
				return 3;
			} else if (this.velocidadeAtual >= 60.0 && this.velocidadeAtual < 80.0){
				return 4;
			} else if (this.velocidadeAtual >=80.0){
				return 5;
			}
			return 0;
		}
		return -1;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	
	

}
