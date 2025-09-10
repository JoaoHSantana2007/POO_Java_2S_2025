package Aula_03.Sistema_Radar_02;

public class Simulacao_02 {

	public static void main(String[] args) {
		
        Carro opala = new Carro("ACLR300",0,76,"Comodoro");
        Radar radar = new Radar("Pistão Sul",60);

        radar.avaliarVelocidade(opala);

        opala.acelerar(); // 10
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar(); // 70
        opala.setVelocidade(-60);
        
        radar.avaliarVelocidade(opala);
    }
}
