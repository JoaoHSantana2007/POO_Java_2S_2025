package Aula_04;

public class Chacara extends Imovel{

    private Boolean possuiPossoArtesiano;

    public Chacara(Municipio municipio, Double areaM2, Integer vagas, boolean possuiPossoArtesiano) {
        super(municipio, areaM2, vagas);
        this.possuiPossoArtesiano = possuiPossoArtesiano;
    }
}
