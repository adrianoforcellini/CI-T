package br.com.tv.modelos;

import br.com.tv.ControleRemoto;
import br.com.tv.TV;

public class ModeloTV001 extends TV implements ControleRemoto {
    public final String MODELO = "TV001";

    public ModeloTV001(int tamanho) {
        super(tamanho);
    }

    public boolean desligar() {
        super.setLigada(false);
        return false;
    }

    public boolean ligar() {
        super.setLigada(true);
        return false;
    }

    public void aumentarVolume(int taxa) {
    }

    public void diminuirVolume(int taxa) {
    }

    public void mudarCanal(int canal) {
    }
}