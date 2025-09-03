package Sistema_Radar_02;

public class Simulacao_02 {

	public static void main(String[] args) {
		
		System.out.println("Simulação");

		Carro opala = new Carro("ACLR300", 0, 76, "comodoro");
        Radar radar = new Radar("Pistão Sul", 60);

        radar.avaliarVelocidade(opala);

        opala.acelerar(); // 10
        opala.acelerar(); // 20
        opala.acelerar(); // 30
        opala.acelerar(); // 40
        opala.acelerar(); //  50
        opala.acelerar(); // 60
        opala.acelerar(); // 70

        radar.avaliarVelocidade(opala);

        opala.frear(); // 60

        radar.avaliarVelocidade(opala);

	}

}
