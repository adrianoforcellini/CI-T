package br.com;

import br.com.variaveis.Primitivos;

public class Principal {
    public static void main(String[] args){
       Primitivos primitivos = new Primitivos();
       long longo = primitivos.longo;
       System.out.print(longo);

       String nome = "Adriano";
       System.out.println("Hello " + nome );
    }
}
