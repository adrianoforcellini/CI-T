package br.com.tv;

public class TV {
    private int tamanho;
    private int canal;
    private int volume;
    private boolean ligada;

    public TV(int tamanho) {
        this.tamanho = tamanho;
        this.canal = 0;
        this.volume = 0;
        this.ligada = false;
    }


    protected void setLigada(boolean b) {
        this.ligada = b;
    }

    public boolean isLigada() {
        return this.ligada;
    }
}

