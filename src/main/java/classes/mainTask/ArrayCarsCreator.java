package classes.mainTask;
import java.util.ArrayList;
public class ArrayCarsCreator {
    public static ArrayList<Car> create(){
        ArrayList<Car> cars = new ArrayList<Car>();
        Car tempCar = new Car(Car.Mark.AUDI, "A5", 2015,
                Car.Color.BLACK ,30000,"5520CH-7");
        cars.add(tempCar);
        tempCar = new Car(Car.Mark.AUDI, "A6", 2015,
                Car.Color.BLUE ,35000,"2828FD-5");
        cars.add(tempCar);
        tempCar = new Car(Car.Mark.AUDI, "A7", 2018,
                Car.Color.YELLOW ,45000,"8787DA-3");
        cars.add(tempCar);
        tempCar = new Car(Car.Mark.MERCEDES, "SG10", 2012,
                Car.Color.BRONZE ,55000,"4323HH-4");
        cars.add(tempCar);
        tempCar = new Car(Car.Mark.MERCEDES, "SG10", 2015,
                Car.Color.BLACK ,49000,"3424JJ-1");
        cars.add(tempCar);
        tempCar = new Car(Car.Mark.MERCEDES, "SG10", 2017,
                Car.Color.BLUE ,65000,"7676KK-3");
        cars.add(tempCar);
        tempCar = new Car(Car.Mark.MERCEDES, "ZZ00", 2019,
                Car.Color.YELLOW ,75000,"8989UU-2");
        cars.add(tempCar);
        tempCar = new Car(Car.Mark.MERCEDES, "ZZ00", 2017,
                Car.Color.BLACK ,65000,"3262YY-5");
        return cars;
    }
}
