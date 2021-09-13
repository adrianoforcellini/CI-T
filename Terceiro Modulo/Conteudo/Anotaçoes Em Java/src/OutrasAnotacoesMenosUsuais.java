public class OutrasAnotacoesMenosUsuais {
//Além das anotações padrão descritas aqui, Java define mais quatro anotações embutidas na sua API:
// @Retention, @Documented, @Target e @Inherited. Estas são meta-anotações,
// visto que são empregadas para marcar tipos anotação e fazem parte do pacote java.lang.annotation.
// A seguir são descritas estas meta-anotações:
//
//@Retention – as anotações podem estar presentes apenas no código fonte ou no binário de classes ou interfaces.
// @Retention é usada para escolher entre essas possibilidades. Ela suporta três valores:
// SOURCE, para indicar que as anotações marcadas não estarão no código binário; CLASS, para gravar as
// anotações no arquivo .class, mas não estarão disponíveis em tempo de execução; e RUNTIME, para indicar
// que as anotações estarão disponíveis em tempo de execução;

//@Documented – é uma anotação marcadora usada para indicar que os tipos
// anotação anotados com ela serão incluídos na documentação Javadoc;


//@Target – ao criar um tipo anotação é possível estabelecer que elementos
// (construtor, variável local, parâmetro de método e método) de uma classe podem ser anotados com ele.
// Para obter esse efeito, usamos @Target, a qual suporta os seguintes valores (cada um destinado a definir
// o elemento que se pretende anotar): CONSTRUCTOR, LOCAL_VARIABLE, PARAMETER e METHOD;


//@Inherited – por padrão anotações declaradas em uma classe não são herdadas pelas subclasses.
// Mas, se for necessário que essa herança ocorra, então o tipo anotação que desejamos que seja herdado
// deve ser anotado com @Inherited. É importante destacar que a utilização desta meta-anotação restringe-se
// apenas a classes. Por exemplo, anotações em interfaces não são herdadas pelas classes que as implementam.


}
