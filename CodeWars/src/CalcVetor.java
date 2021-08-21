public class CalcVetor{

  public static void main(String[] args){

    int[] vetor = new int[5];

    vetor[0]=10;

    vetor[1]=5;

    vetor[2]=7;

    vetor[3]=8;

    vetor[4]=1;

    System.out.println("O somatório é " + somatorio(vetor));

    System.out.println("O produtório é " + produtorio(vetor));

  }

  private static int somatorio (int[] v){

    int aux=0; // Elemento neutro do somatório

    for (byte i=0;i<v.length;i++)

      aux+=v[i];

    return aux;

  }

  private static int produtorio (int[] v){

    int aux=1; // Elemento neutro do produtório

    for (byte i=0;i<v.length;i++)

      aux*=v[i];

    return aux;

  }

}

 