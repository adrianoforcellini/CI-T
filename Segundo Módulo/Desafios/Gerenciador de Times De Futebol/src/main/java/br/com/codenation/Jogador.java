package br.com.codenation;
//public void incluirJogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade, BigDecimal salario) {

import java.math.BigDecimal;
import java.time.LocalDate;

public class Jogador {
    private Long id;
    private Long idTime;
    private String nome;
    private LocalDate dataNascimento;
    private Integer nivelHabilidade;
    private BigDecimal salario;
    private Boolean capitao = false;

    public Jogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade, BigDecimal salario) {
        addId(id);
        addIdTime(idTime);
        addNome(nome);
        addDataNascimento(dataNascimento);
        addNivelHabilidade(nivelHabilidade);
        addSalario(salario);
    }

    public void addId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void addIdTime(Long idTime) {
        this.idTime = idTime;
    }

    public Long getIdTime() {
        return idTime;
    }

    public void addNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void addDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void addNivelHabilidade(Integer nivelHabilidade) {
        this.nivelHabilidade = nivelHabilidade;
    }

    public Integer getNivelHabilidade() {
        return nivelHabilidade;
    }

    public void addSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setCapitao() {
        this.capitao = true;
    }

    public Boolean getCapitao() {
        return capitao;
    }


}
