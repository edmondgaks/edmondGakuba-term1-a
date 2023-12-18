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
        // Given
        double operator1 = 4;
        double operator2 = 9;
        String operation = "+";

        // When
        double actualMathOperator = mathOperatorService.doMath(operator1, operator2, operation);

        // Then
        double expectedMathOperator = 13; // You need to calculate the expected result based on your business logic.
        assertThat(actualMathOperator).isEqualTo(expectedMathOperator);
    }
}