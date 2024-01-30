package com.curso.de.tecnologia.service;

import com.curso.de.tecnologia.model.ProfessionalLevel;
import com.curso.de.tecnologia.util.SimpleCalculatorUtils;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class Calculator {

    public BigDecimal calculateGiantSalaryProgrammerPerMonth(
            BigDecimal salaryWithoutBenefits, BigDecimal professionBenefit, ProfessionalLevel professionalLevel){

        BigDecimal salaryWithoutdiscount = SimpleCalculatorUtils.sum(salaryWithoutBenefits, professionBenefit);
        System.out.println("Este é o salario mais beneficios sem descontos: " + salaryWithoutdiscount);

        List<BigDecimal> programmerCostsList = programmerCosts(professionalLevel);
        BigDecimal currentSalary = salaryWithoutdiscount;

        for(BigDecimal cost: programmerCostsList) {
            currentSalary = new BigDecimal(String.valueOf(SimpleCalculatorUtils.subtract(currentSalary, cost)));
        }

        System.out.println("Resultado do nosso salario com todos os descontos." + currentSalary);
        return currentSalary;
    }

    private List<BigDecimal> programmerCosts(ProfessionalLevel programType){
        List<BigDecimal> programCustList = new ArrayList<>();

        if(programType == ProfessionalLevel.SENIOR_ANALYST){
            BigDecimal medicineTreatment = new BigDecimal("1000");
            programCustList.add(medicineTreatment);

            BigDecimal psychiatrist = new BigDecimal("2000");
            programCustList.add(psychiatrist);
        }

        if(programType == ProfessionalLevel.SENIOR_ANALYST){


        }

        if(programType == ProfessionalLevel.SENIOR_ANALYST){


        }
        return programCustList;
    }

    private List<BigDecimal> doctorCosts(ProfessionalLevel programType){
        List<BigDecimal> programCustList = new ArrayList<>();

        if(programType == ProfessionalLevel.SENIOR_ANALYST){



        }

        if(programType == ProfessionalLevel.SENIOR_ANALYST){


        }

        if(programType == ProfessionalLevel.SENIOR_ANALYST){


        }
        return programCustList;
    }


}
