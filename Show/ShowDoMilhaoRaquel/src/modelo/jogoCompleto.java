package modelo;
public class jogoCompleto {

    private Jogador jogador;
    private Integer pular;
    private Integer cartas;
    private Double ganhos;
    
    public jogoCompleto()
    {
        this.jogador= null;
        this.cartas =1;
        this.pular=1;
        this.ganhos = 0.0;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Integer getPular() {
        return pular;
    }

    public void setPular(Integer pular) {
        this.pular = pular;
    }


    public Integer getCartas() {
        return cartas;
    }

    public void setCartas(Integer cartas) {
        this.cartas = cartas;
    }

    public Double getGanhos() {
        return ganhos;
    }

    public void setGanhos(Double ganhos) {
        this.ganhos = ganhos;
    }
}
