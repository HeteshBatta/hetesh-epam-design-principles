package com.hetesh.calculator;

import com.hetesh.operator.*;

public class Calculator
{

  
    public Calculator()
    {

    }
  
    public void solve(double num1,double num2,char expr) 
    {
        Operator operator =new Operator();
        operator.operate(num1, num2, expr);
        operator.displayResult();
    }
}