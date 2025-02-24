package INTREPRETER;

public class main {
    public static void main(String[] args) {
        expression num1=new numberexpression(10);
        expression num2=new numberexpression(3);
        expression num3=new numberexpression(2);

        expression sum1=new additionexpression(num1, num2);
        expression sub1=new subtractionexpression(sum1,num3);

        System.out.println("Expression result: " + sub1.intrepret());
    }
}
