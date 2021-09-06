package br.com.codenation;

import java.time.LocalDate;

public class Time {
    private Long idTime;
    private String nome;
    private LocalDate dataCriacao;
    private String corUniformePrincipal;
    private String corUniformeSecundario;

    public Time(Long idTime, String nome, LocalDate dataCriacao, String corUniformePrincipal, String corUniformeSecundario) {
        addId(idTime);
        addNome(nome);
        addDataCriacao(dataCriacao);
        addCorUniformePrincipal(corUniformePrincipal);
        addCorUniformeSecundario(corUniformeSecundario);
    }

    public void addId(Long idTime) {
        this.idTime = idTime;
    }

    public Long getId() {
        return idTime;
    }

    public void addNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void addDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void addCorUniformePrincipal(String corUniformePrincipal) {
        this.corUniformePrincipal = corUniformePrincipal;
    }

    public String getCorUniformePrincipal() {
        return corUniformePrincipal;
    }

    public void addCorUniformeSecundario(String corUniformeSecundario) {
        this.corUniformeSecundario = corUniformeSecundario;
    }

    public String getCorUniformeSecundario() {
        return corUniformeSecundario;
    }

}