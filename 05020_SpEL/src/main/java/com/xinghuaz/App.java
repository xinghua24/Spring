package com.xinghuaz;


import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App 
{
    public static void main( String[] args )
    {
    	ExpressionParser parser = new SpelExpressionParser();
    	
    	Expression exp = parser.parseExpression("2 > 1 && false");
    	
    	Boolean yesOrNo = (Boolean) exp.getValue();
    	
    	System.out.println( yesOrNo);
    	
    }
}
