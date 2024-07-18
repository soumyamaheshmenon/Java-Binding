class Car {
    private String companyName;
    private String modelName;
    private int year;
    private double mileage;

    public String getCompanyName(){
        return companyName;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;

    }

    public String getModelName(){
        return modelName;
    }

    public void setModelName(String modelName){
        this.modelName = modelName;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public double getMileage(){
        return mileage;
    }
}

public class Main {
    public static void main(String[] args){
        Car a = new Car();
        //C
        a.setCompanyName("Honda");
        a.setModelName("Accord");
        a.setYear(2024);
        System.out.println("Company Name: " + a.getCompanyName());
        System.out.println("Model Name: " + a.getModelName());
        System.out.println("Year: " + a.getYear());
        System.out.println("Mileage: " + a.getMileage());
    }
}