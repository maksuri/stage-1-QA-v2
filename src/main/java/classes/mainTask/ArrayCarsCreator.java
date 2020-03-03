package classes.mainTask;
import java.util.ArrayList;
public class ArrayCarsCreator {
    public static ArrayList<Car> create(){
        ArrayList<Car> cars = new ArrayList<>();
        Car tempCar = new Car(Mark.AUDI, "A5", 2015,
                Color.BLACK ,30000,"5520CH-7");
        cars.add(tempCar);
        tempCar = new Car(Mark.AUDI, "A6", 2015,
                Color.BLUE ,35000,"2828FD-5");
        cars.add(tempCar);
        tempCar = new Car(Mark.AUDI, "A7", 2018,
                Color.YELLOW ,45000,"8787DA-3");
        cars.add(tempCar);
        tempCar = new Car(Mark.MERCEDES, "SG10", 2012,
                Color.BRONZE ,55000,"4323HH-4");
        cars.add(tempCar);
        tempCar = new Car(Mark.MERCEDES, "SG10", 2015,
                Color.BLACK ,49000,"3424JJ-1");
        cars.add(tempCar);
        tempCar = new Car(Mark.MERCEDES, "SG10", 2017,
                Color.BLUE ,65000,"7676KK-3");
        cars.add(tempCar);
        tempCar = new Car(Mark.MERCEDES, "ZZ00", 2019,
                Color.YELLOW ,75000,"8989UU-2");
        cars.add(tempCar);
        tempCar = new Car(Mark.MERCEDES, "ZZ00", 2017,
                Color.BLACK ,65000,"3262YY-5");
        cars.add(tempCar);
        return cars;
    }
}
