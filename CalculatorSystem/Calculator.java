package CalculatorSystem;

public abstract class Calculator implements CalculatorInterface{
    private int calculatorId;
    private int result;

    private UserInterface user;

    public int getCalculatorId() {
        return calculatorId;
    }

    public void setCalculatorId(int calculatorId) {
        this.calculatorId = calculatorId;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    public UserInterface getUser() {
        return user;
    }

    public void setUser(UserInterface user) {
        this.user = user;
    }

    public void compute(){
        this.result = this.user.getNum1() + this.user.getNum2() ;
        System.out.println(this.result);
    }
    // overload
    public void calculate(int a) {
        System.out.println("===Overload---");
        System.out.println(a + a);
    }

    public void calculate(int a1, int b1) {
        System.out.println(a1 + b1);
    }

    public void calculate(int a, int b, int c) {
        System.out.println(a + b + c);
    }

}
