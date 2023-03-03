package model;

public class MiniCalculatorModel {
    private double fistValue;
    private double secondValue;
    private double answer;

    public MiniCalculatorModel() {

    }

    public double getFistValue() {
        return fistValue;
    }

    public void setFistValue(double fistValue) {
        this.fistValue = fistValue;
    }

    public double getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public double getAnswer() {
        return answer;
    }
    public void reset(double fistValue, double secondValue, double answer) {
        this.fistValue = fistValue;
        this.secondValue = secondValue;
        this.answer = answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }
    public void sum() {
        this.answer = this.fistValue + this.secondValue;
    }
    public void minus() {
        this.answer = this.fistValue - this.secondValue;
    }
    public void multiply() {
        this.answer = this.fistValue * this.secondValue;
    }
    public void divide() {
        this.answer = this.fistValue / this.secondValue;
    }
    public void pow() {
        this.answer = Math.pow(this.fistValue, this.secondValue);
    }
    public void mod() {
        this.answer = this.fistValue % this.secondValue;
    }

}
