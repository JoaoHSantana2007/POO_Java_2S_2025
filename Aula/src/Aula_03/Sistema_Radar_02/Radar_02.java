package Aula_03.Sistema_Radar_02;

import Sistema_Radar.Carro;

public class Radar_02 {

	private String localizacao;
    private Integer limiteVelocidade;

    public Radar(String localizacao, Integer limiteVelocidade){
        this.localizacao = localizacao;
        this.limiteVelocidade = limiteVelocidade;
    }

    public Radar(Integer limiteVelocidade){
        this.limiteVelocidade = limiteVelocidade;
    }

    public void emitirNotificacao(String placa, Integer velocidadeObservada){
        System.out.println("Placa: "+placa);
        System.out.println("Velocidade observada: "+velocidadeObservada);
        System.out.println("Localização: "+ this.localizacao);
        System.out.println("Velocidade da via: "+ this.limiteVelocidade);
        
    }

    public void avaliarVelocidade(Carro carro){
        if(carro.getVelocidade() > this.limiteVelocidade){
            emitirNotificacao(carro.getPlaca(), carro.getVelocidade());
        }
    }

}
