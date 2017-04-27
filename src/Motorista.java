
public class Motorista {
	
	public static void main(String[] args){
		
		Carro carro1 = new Carro("VW","UP!",2017,"Branco",190.0);
		carro1.parar();
		carro1.acelera(50.0);
		carro1.liga();
		carro1.acelera(50.0);
		carro1.getMarcha();
		System.out.println("Marcha atual: " + carro1.getMarcha());
		carro1.reduz(30.0);
		System.out.println("Marcha atual: " + carro1.getMarcha());
		carro1.reduz(30.0);
		System.out.println("Marcha atual: " + carro1.getMarcha());
		carro1.acelera(250.0);
		System.out.println("Marcha atual: " + carro1.getMarcha());
		carro1.acelera(50.0);
		System.out.println("Marcha atual: " + carro1.getMarcha());
		carro1.desliga();
		System.out.println("Marcha atual: " + carro1.getMarcha());
	}

}
