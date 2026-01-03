package CalculatorSystem;

public class Multiplier extends Calculator implements MultiplierInterface{

    public Multiplier(int id , UserInterface user){
        this.setCalculatorId (id) ;
        this.setUser (user) ;

    }

    @Override
    public void compute(){
        this.setResult (this.getUser().getNum1() * this.getUser().getNum2() * this.getUser().getNum3());
        System.out.println(this.getResult());
    }


}
