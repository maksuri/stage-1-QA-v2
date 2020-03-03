package classes.mainTask;
import java.util.ArrayList;
public class Runner {
    public static void main(String[] args) {

        ArrayList<Car> cars;
        ArrayList<Car> carsTemp;
        cars = ArrayCarsCreator.create();
        System.out.println("All Cars:");
        for( Car car : cars){
            System.out.println(car);
        }
        System.out.println("Cars with mark = " + Mark.AUDI);
        carsTemp = ActionCars.getCarsByMark(Mark.AUDI,cars);
        for( Car car : carsTemp){
            System.out.println(car);
        }
        String model ="SG10";
        int yearUsed = 4;
        System.out.println("Cars with model = " + model +
                "; More than years used = " + yearUsed );
        carsTemp = ActionCars.getCarsByModelAndYearsUsed(model ,yearUsed, cars);
        for( Car car : carsTemp){
            System.out.println(car);
        }
        int yearCreation = 2015;
        int price = 34000;
        System.out.println("Cars with year creation = " + yearCreation +
                "; Price higher than = " + price);
        carsTemp = ActionCars.getCarsByYearCreationAndHigherPrice
                (yearCreation,price,cars);
        for( Car car : carsTemp){
            System.out.println(car);
        }
    }
}
