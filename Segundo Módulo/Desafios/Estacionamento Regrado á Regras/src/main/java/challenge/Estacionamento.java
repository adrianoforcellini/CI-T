package challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Estacionamento {
    List<Carro> estacionados = new ArrayList<>();
    int vagas = 10;

    public void estacionar(Carro carro) {

        if (carro.getMotorista().getPontos() > 20) {
            throw new IllegalArgumentException();
        }
        if (carrosEstacionados() < vagas) {
            estacionados.add(carro);
        } else {
            if (todosMotoristasSaoIdosos()) {
                throw new EstacionamentoException("Todos Motoristas São Idosos");
            } else {
                for (Carro carroY : estacionados) {
                    if (carroY.getMotorista().getIdade() < 55) {
                        vaiEmbora(carroY);
                        break;
                    }
                }
                estacionados.add(carro);
            }
        }
    }

    public boolean todosMotoristasSaoIdosos() {
        for (Carro carro : estacionados) {
            if (carro.getMotorista().getIdade() < 55) {
                return false;
            }
        }
        return true;
    }


    public void vaiEmbora(Carro carro) {
        estacionados.remove(carro);
    }

    public int carrosEstacionados() {
        return estacionados.toArray().length;

    }

    public boolean carroEstacionado(Carro carro) {
        for (Carro carroX : estacionados) {
            if (carroX.equals(carro)) {
                return true;
            }
        }
        return false;
    }

}
