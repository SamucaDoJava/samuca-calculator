package com.curso.de.tecnologia;


import com.curso.de.tecnologia.model.ProfessionalLevel;
import com.curso.de.tecnologia.service.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.curso.de.tecnologia.util.SimpleCalculatorUtils;
import java.math.BigDecimal;

@SpringBootTest
class SamucaCalculatorApplicationTests {

	@Autowired
	private Calculator calculator;

	@Test
	void contextLoads() {

		BigDecimal programmerSalary = new BigDecimal("15000");
		BigDecimal programmerBenefit = new BigDecimal("5000");
		ProfessionalLevel professionalLevel = ProfessionalLevel.SENIOR_ANALYST;

		BigDecimal result = calculator.calculateGiantSalaryProgrammerPerMonth(programmerSalary, programmerBenefit, professionalLevel);
		System.out.println("O grande salario de um senior: " + result);
	}

	public static void main(String[] args) {
		BigDecimal myAmount = new BigDecimal("10");
		BigDecimal anotherAmount = new BigDecimal("12");

		System.out.println("Valor da soma de 10 mais 12 é: " + SimpleCalculatorUtils.sum(myAmount, anotherAmount));

		System.out.println("Valor da subtração de 10 menos 12 é: " + SimpleCalculatorUtils.subtract(myAmount, anotherAmount));

		System.out.println("Valor da multiplicação de 10 vezes 12 é: " + SimpleCalculatorUtils.multiply(myAmount, anotherAmount));

		try {
			BigDecimal myDivisorValue = new BigDecimal("3");

			System.out.println("Valor de 10 dividido por 3 é: " +
					SimpleCalculatorUtils.divide(myAmount, myDivisorValue));
		} catch (Exception e) {
			System.out.println("Deu erro, que erro foi? " + e);
			throw new RuntimeException(e);
		}
	}

}
