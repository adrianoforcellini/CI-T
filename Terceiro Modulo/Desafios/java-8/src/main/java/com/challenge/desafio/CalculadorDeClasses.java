package com.challenge.desafio;

import com.challenge.annotation.Subtrair;
import com.challenge.interfaces.Calculavel;
import com.challenge.annotation.Somar;

import java.lang.reflect.Field;
import java.math.BigDecimal;

public class CalculadorDeClasses implements Calculavel {

    @Override
    public BigDecimal somar(Object classe) {
        BigDecimal soma = BigDecimal.ZERO;
        for (Field f : classe.getClass().getDeclaredFields()) {
            if (f.isAnnotationPresent(Somar.class)) {
                f.setAccessible(true);
                try {
                    soma = soma.add((BigDecimal) f.get(classe));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return soma;
    }

 // consultei o CR de meu colega Layo ( quando estava travado nos 50%) para corrigir esse netodo
//  https://www.codenation.dev/code-review/#/java-8/_zYknE47g
    @Override
    public BigDecimal subtrair(Object Classe) {
        BigDecimal soma = BigDecimal.ZERO;
        for (Field f : Classe.getClass().getDeclaredFields()) {
            if (f.isAnnotationPresent(Subtrair.class)) {
                f.setAccessible(true);
                try {
                    soma = soma.add((BigDecimal) f.get(Classe));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return soma;
    }

    @Override
    public BigDecimal totalizar(Object Classe) {
        return somar(Classe).subtract(subtrair(Classe));
    }
}

// getClass() is a method inherited from Object that returns the type of the object itself.
// https://stackoverflow.com/questions/22701751/java-reflection-get-class-of-field

// getDeclaredFields()  This method returns the array of Field objects representing
// all the declared fields of this class.
//  https://www.tutorialspoint.com/java/lang/class_getdeclaredfields.htm

// The isAnnotationPresent() method of java Class class returns true if an annotation
// for the specified type is present on this element, false otherwise.
// https://www.javatpoint.com/java-class-isannotationpresent-method

// An IllegalAccessException is thrown when an application tries to reflectively create an
// instance (other than an array), set or get a field, or invoke a method, but the currently
// executing method does not have access to the definition of the specified class, field,
// method or constructor.
// Por isso eu não poderia usar o if, idependenetemente de o add só acontecer caso a
// classe do field fosse um  BigDecimal...
// https://docs.oracle.com/javase/8/docs/api/java/lang/IllegalAccessException.html


//   *  *   *    SOBRE AS ANNOTATIONS UTILIZADAS  *   *   *

// @Target
// Indicates the contexts in which an annotation type is applicable.
// The declaration contexts and type contexts in which an annotation type may be applicable
// are specified in JLS 9.6.4.1, and denoted in source code by enum constants of
// java.lang.annotation.ElementType.
// https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/Target.html
// No caso, que o tipo de elemento fosse um Field.

// @Retention
//Indicates how long annotations with the annotated type are to be retained.
// If no Retention annotation is present on an annotation type declaration, the
// retention policy defaults to RetentionPolicy.CLASS.
//https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/Retention.html
// No caso, Runtime, as anotações precisão ficar gravadas no arquivo de classo pelo compilador
// e retirdas no tempo de execução para que possam ser lidas reflexivamente.
// https://docs.oracle.com/javase/7/docs/api/java/lang/annotation/RetentionPolicy.html