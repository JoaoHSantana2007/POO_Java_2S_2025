package Sistema_Radar_02;

public class Carro_02 {

	public String placa;
    public String modelo;
    public Integer ano;
    public Integer velocidade;

    public void Carro(String placa, Integer velocidade, Integer ano, String modelo) {
    	this.placa = placa;
    	this.velocidade = velocidade;
    	this.ano = ano;
    	this.modelo = modelo;
    }
    
    public void setVelocidade(Integer velocidade) {
    	this.velocidade = velocidade;
    }
    
    public void acelerar(){
        this.velocidade += 10;
    }

    public void frear(){
        if(this.velocidade > 0){
            this.velocidade -= 10;
        }
    }
}
