package rca.devopsexam.devops.services;

import rca.devopsexam.devops.exceptions.InvalidOperationException;

public interface IMathOperator {

    double doMath(double operand1, double operand2, String operation) throws InvalidOperationException;
}
