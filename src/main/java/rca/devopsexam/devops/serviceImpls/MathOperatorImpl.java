package rca.devopsexam.devops.serviceImpls;

import org.springframework.stereotype.Service;
import rca.devopsexam.devops.exceptions.InvalidOperationException;
import rca.devopsexam.devops.services.IMathOperator;

@Service
public class MathOperatorImpl implements IMathOperator {

    @Override
    public double doMath(double operand1, double operand2, String operation) throws InvalidOperationException {
        if ("/".equals(operation) && operand2 == (double) 0) {
            throw new InvalidOperationException("Cannot divide by 0");
        }

        switch (operation) {
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;

            default:
                throw new RuntimeException("Unknown Operation");
        }
    }
}
