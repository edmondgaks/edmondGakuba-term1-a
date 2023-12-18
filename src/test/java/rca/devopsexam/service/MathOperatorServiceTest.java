package rca.devopsexam.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import rca.devopsexam.devops.exceptions.InvalidOperationException;
import rca.devopsexam.devops.serviceImpls.MathOperatorImpl;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class MathOperatorServiceTest {

    @InjectMocks
    private MathOperatorImpl mathOperatorService;

    @Test
    public void should_create_math_operation_success() throws InvalidOperationException {
        double operator1 = 4;
        double operator2 = 6;
        String operation = "+";

        double actualMathOperator = mathOperatorService.doMath(operator1, operator2, operation);

        double expectedMathOperator = 10;
        assertThat(actualMathOperator).isEqualTo(expectedMathOperator);
    }
    @Test
    public void should_create_math_subtraction_operation_success() throws InvalidOperationException {
        double operator1 = 8;
        double operator2 = 3;
        String operation = "-";
        double result = mathOperatorService.doMath(operator1, operator2, operation);
        assertThat(result).isEqualTo(5);
    }
}