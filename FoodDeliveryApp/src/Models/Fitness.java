package Models;

public class Fitness {

   private double height; //m
    private double  weight; //kgs
    private double  BMI;


    public Fitness(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double BMICalculator(double height, double weight){
        double bmi = weight/height*height;
        return bmi;
    }
}
