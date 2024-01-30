package com.curso.de.tecnologia.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/** Essa é uma classe que faz operações basicas aritiméticas.
 * */
public class SimpleCalculatorUtils {

    /**Esse método faz o calculo de dois valores usando o operador +
     * somar!*/
    public static BigDecimal sum(BigDecimal valueOne, BigDecimal valueTwo){
        return new BigDecimal(String.valueOf(valueOne.add(valueTwo)));
    }

    /**Esse método faz o calculo de dois valores usando o operador -
     * subtrair!*/
    public static BigDecimal subtract(BigDecimal valueOne, BigDecimal valueTwo){
        return new BigDecimal(String.valueOf(valueOne.subtract(valueTwo)));
    }

    /**Esse método faz o calculo de dois valores usando o operador *
     * multiplicar!*/
    public static BigDecimal multiply(BigDecimal valueOne, BigDecimal valueTwo){
        return new BigDecimal(String.valueOf(valueOne.multiply(valueTwo)));
    }

    /**Esse método faz o calculo de dois valores usando o operador /
     * dividir!
     * @param value value é o valor que será dividido.
     * @param divisor é o divisor que será usado para dividir. */
    public static BigDecimal divide(BigDecimal value, BigDecimal divisor) throws Exception {
        if(divisor == BigDecimal.ZERO) {
            throw new Exception("Erro não se pode dividir por zero");
        }
        String divideResult = String.valueOf(value.divide(divisor, RoundingMode.UP));
        return new BigDecimal(divideResult);
    }


}
