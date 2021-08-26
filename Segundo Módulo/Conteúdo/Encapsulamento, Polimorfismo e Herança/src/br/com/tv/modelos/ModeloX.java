package br.com.tv.modelos;

import br.com.tv.ControleRemoto;
import br.com.tv.TV;

public class ModeloX extends TV implements ControleRemoto {
    public final String MODELO = "TV-X";

    public ModeloX(int tamanho) {
        super(tamanho);
    }

      public boolean desligar() {
        System.out.println("Obrigado por Utilizar a Televisão!");
        super.setLigada(false);
        return false;
    }

    public boolean ligar() {
        super.setLigada(true);
        return false;
    }

    public void aumentarVolume(int taxa) { }
    public void diminuirVolume(int taxa) { }
    public void mudarCanal(int canal) { }
}