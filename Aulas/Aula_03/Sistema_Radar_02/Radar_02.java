package Sistema_Radar_02;

import Sistema_Radar.Carro;

public class Radar_02 {

	public Integer limiteVelocidade;
    public String localizacao;
    
    public void Radar(String localizacao, Integer limiteVelocidade) {
    	this.localizacao = localizacao;
    	this.limiteVelocidade = limiteVelocidade;
    }

    public void avaliarVelocidade(Carro carro){
    	if(carro.velocidade > this.limiteVelocidade){ 
            emitirNotificacao(carro.placa, carro.velocidade);
        }
    }

    public void emitirNotificacao(String placa, Integer velocidadeObservada){
    	System.out.println("Placa: " + placa);
        System.out.println("Velocidade observada: " + velocidadeObservada);
        System.out.println("Localizasao: " + localizacao)
        System.out.println("Limite da via: " + this.limiteVelocidade);
    }
}
