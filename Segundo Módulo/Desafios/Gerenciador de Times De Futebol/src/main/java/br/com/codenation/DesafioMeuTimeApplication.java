package br.com.codenation;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import br.com.codenation.exceptions.CapitaoNaoInformadoException;
import br.com.codenation.exceptions.IdentificadorUtilizadoException;
import br.com.codenation.exceptions.JogadorNaoEncontradoException;
import br.com.codenation.exceptions.TimeNaoEncontradoException;


public class DesafioMeuTimeApplication implements MeuTimeInterface {
    public List<Time> times = new ArrayList<>();
    public List<Jogador> jogadores = new ArrayList<>();

    public Boolean timeExiste(Long id) {
        for (Time time : times) {
            if (time.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public void incluirTime(Long idTime, String nome, LocalDate dataCriacao, String corUniformePrincipal, String corUniformeSecundario) throws IdentificadorUtilizadoException {
        if (timeExiste(idTime)) {
            throw new IdentificadorUtilizadoException();
        }

        Time newTime = new Time(idTime, nome, dataCriacao, corUniformePrincipal, corUniformeSecundario);
        times.add(newTime);
    }

    public Boolean jogadorExiste(Long id) {
        for (Jogador jogador : jogadores) {
            if (jogador.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }


    public void incluirJogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade, BigDecimal salario) {
        if (jogadorExiste(id)) {
            throw new IdentificadorUtilizadoException();
        }
        if (!timeExiste(idTime)) {
            throw new TimeNaoEncontradoException();
        }
        Jogador newJogador = new Jogador(id, idTime, nome, dataNascimento, nivelHabilidade, salario);
        jogadores.add(newJogador);
    }

    public void definirCapitao(Long idJogador) {
        if (!jogadorExiste(idJogador)) {
            throw new JogadorNaoEncontradoException();
        }
        for (Jogador jogador : jogadores) {
            if (jogador.getId() == idJogador) {
                jogador.setCapitao();
            }
        }
    }

    public Long buscarCapitaoDoTime(Long idTime) {
        if (!timeExiste(idTime)) {
            throw new TimeNaoEncontradoException();
        }
        for (Jogador jogador : jogadores) {
            if (jogador.getCapitao()) {
                return jogador.getId();
            }
        }
        throw new CapitaoNaoInformadoException();
    }

    public String buscarNomeJogador(Long idJogador) {
        for (Jogador jogador : jogadores) {
            if (jogador.getId() == idJogador) {
                return jogador.getNome();
            }
        }
        throw new JogadorNaoEncontradoException();
    }

    public String buscarNomeTime(Long idTime) {
        for (Time time : times) {
            if (time.getId() == idTime) {
                return time.getNome();
            }
        }
        throw new TimeNaoEncontradoException();
    }


    public List<Long> buscarJogadoresDoTime(Long idTime) {
        if (!timeExiste(idTime)) {
            throw new TimeNaoEncontradoException();
        }
        List<Long> jogadoresDoTime = new ArrayList<>();
        for (Jogador jogador : jogadores) {
            if (jogador.getIdTime() == idTime) {
                jogadoresDoTime.add(jogador.getId());
            }
        }
        return jogadoresDoTime;
    }

    public Long buscarMelhorJogadorDoTime(Long idTime) {
        if (!timeExiste(idTime)) {
            throw new TimeNaoEncontradoException();
        }

        List<Jogador> jogadoresDoTime = new ArrayList<>();
        for (Jogador jogador : jogadores) {
            if (jogador.getIdTime() == idTime) {
                jogadoresDoTime.add(jogador);
            }
        }

        Long melhorJogadorId = 0L;
        Integer maiorHabilidade = 0;

        for (Jogador jogador : jogadoresDoTime) {
            if (jogador.getNivelHabilidade() > maiorHabilidade) {
                maiorHabilidade = jogador.getNivelHabilidade();
                melhorJogadorId = jogador.getId();
            }
        }
        return melhorJogadorId;
    }

    public Long buscarJogadorMaisVelho(Long idTime) {
        if (!timeExiste(idTime)) {
            throw new TimeNaoEncontradoException();
        }

        List<Jogador> jogadoresDoTime = new ArrayList<>();
        for (Jogador jogador : jogadores) {
            if (jogador.getIdTime() == idTime) {
                jogadoresDoTime.add(jogador);
            }
        }

        Long jogadorMaisVelho = 0L;
        LocalDate agora = LocalDate.now();

        for (Jogador jogador : jogadoresDoTime) {
            if (jogador.getDataNascimento().isBefore(agora)) {
                // https://howtodoinjava.com/java/date-time/compare-localdates/
                jogadorMaisVelho = jogador.getId();
                agora = jogador.getDataNascimento();
            }
        }
        return jogadorMaisVelho;
    }

    public List<Long> buscarTimes() {
        List<Long> timesLong = new ArrayList<>();
        for (Time time : times) {
            timesLong.add(time.getId());
        }
        return timesLong;
    }

    public Long buscarJogadorMaiorSalario(Long idTime) {
        if (!timeExiste(idTime)) {
            throw new TimeNaoEncontradoException();
        }

        List<Jogador> jogadoresDoTime = new ArrayList<>();
        for (Jogador jogador : jogadores) {
            if (jogador.getIdTime() == idTime) {
                jogadoresDoTime.add(jogador);
            }
        }

        BigDecimal maiorSalario = new BigDecimal("0.0");
        //   https://www.geeksforgeeks.org/bigdecimal-min-method-in-java/
        Long jogadorMaiorSalario = 0L;

        for (Jogador jogador : jogadoresDoTime) {
            if (jogador.getSalario().longValue() > maiorSalario.longValue()) {
                // https://www.geeksforgeeks.org/bigdecimal-longvalue-method-in-java/
                maiorSalario = jogador.getSalario();
                jogadorMaiorSalario = jogador.getId();
            }
        }
        return jogadorMaiorSalario;
    }

    public BigDecimal buscarSalarioDoJogador(Long idJogador) {

        for (Jogador jogador : jogadores) {
            if (jogador.getId() == idJogador) {
                return jogador.getSalario();
            }
        }
        throw new JogadorNaoEncontradoException();
    }

    public List<Long> buscarTopJogadores(Integer top) {
        List<Long> listaDosTopJogadores = new ArrayList<>();

        if(jogadores.size() == 0) {
            return listaDosTopJogadores;
        }

        List<Jogador> sortedJogadores = jogadores.stream()
                .sorted(Comparator.comparing(Jogador::getNivelHabilidade).reversed()
                        .thenComparing(Jogador::getId)).collect(Collectors.toList());
 //A ideia é iterar sobre essas coleções de objetos e, a cada elemento, realizar alguma ação,
 // seja ela de filtragem, mapeamento, transformação, etc. Caberá ao desenvolvedor apenas definir
 // qual ação será realizada sobre o objeto.
 //https://www.devmedia.com.br/java-streams-api-manipulando-colecoes-de-forma-eficiente/3
// Compara os niveis de habilidade, do menor pro menor então reverte ( .reversed() )
// depois compara pelo id (.themComparing)  : Quando este comparador compara dois elementos iguais,
// o thenComparingmétodo determina a ordem.
// https://www.concretepage.com/java/java-8/java-comparator-thencomparing
// e por fim, retorna a lista com os valores ( collect(Collectors.toList()))
// toList () : - Método estático da classe Collectors e retorna um objeto de interface do Collector
// usado para armazenar um grupo de dados em uma lista. A classe Collectors está no pacote java.util.streams.
// https://www.geeksforgeeks.org/collectors-tolist-method-in-java-with-examples/

        for(int i = 0; i < top; i++) {
            listaDosTopJogadores.add(sortedJogadores.get(i).getId());
        }
// https://www.codenation.dev/code-review/#/java-1/vNmiFjn7R
        return listaDosTopJogadores;
    }

}
