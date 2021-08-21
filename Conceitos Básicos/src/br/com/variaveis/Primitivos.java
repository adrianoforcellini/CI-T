package br.com.variaveis;
public class Primitivos {
    //cada variavel tem um "range" de numeros que pode armazenar
  public  byte byteVar = 127;
    // um byte de memoria para armazer. ( até 127)
    public short curto = 10000;
    // 16 bits
    public  int inteiro = 2147483647;
    //32 bits
    public  long longo = 9223372036854775807L;
    // adição do L para que o java não entenda a variavel como int
    //64 bits
    public float pontoFlutuante = 2147483646.10F;
    //esse não é necessariamente o tamanho maximo.
    //32 bits
    public  double pontoFlutuanteDobro = 9223372036854775806.299;
    //esse não é necessariamente o tamanho maximo.
    //64 bits
    public  char character ='S';
    // 16 bits
    public  boolean booleano = true;
}
