package com.jonnyc.interpreterpattern;

public class Demo {

    public static Expression getMaleExpression(){

        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");

        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression(){

        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("married");

        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {

        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println(isMale.interpret("John"));
        System.out.println(isMale.interpret("Jim"));

        System.out.println(isMarriedWoman.interpret("Mary married"));
        System.out.println(isMarriedWoman.interpret("Julie married"));
    }
}
