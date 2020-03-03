package classes.mainTask;
import java.util.ArrayList;
import java.util.Calendar;
//Создать классы, спецификации которых приведены ниже.
// Определить конструкторы и методы setТип(), getТип(), toString().
// Определить дополнительно методы в классе, создающем массив объектов.
// Задать критерий выбора данных и вывести эти данные на консоль. В каждом классе
// , обладающем информацией, должно быть объявлено несколько конструкторов.
//Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
//Создать массив объектов. Вывести:
//a) список автомобилей заданной марки;
//b) oписок автомобилей заданной модели, которые эксплуатируются больше n лет;
//c) список автомобилей заданного года выпуска, цена которых больше указанной.
public class ActionCars {

    public static ArrayList<Car> getCarsByMark(Mark mark,ArrayList<Car> cars){

        ArrayList<Car> carsMark = new ArrayList<>();

        for (Car car0 : cars) {
            if(car0.getMark().equals(mark)){
                carsMark.add(car0);
            }
        }
        return carsMark;

    }

    public static ArrayList<Car> getCarsByModelAndYearsUsed(String model,
                                                            int yearsUsed,
                                                            ArrayList<Car> cars){

        ArrayList<Car> carsByModelAndYearsUsed = new ArrayList<>();
        int currYear = Calendar.getInstance().get(Calendar.YEAR);
        int minYearCreation = currYear - yearsUsed - 1;
        for (Car car0 : cars) {
            if(car0.getModel().equals(model) &&
                    car0.getYearCreation() <= minYearCreation){
                carsByModelAndYearsUsed.add(car0);
            }
        }
        return carsByModelAndYearsUsed;
    }
    public static ArrayList<Car> getCarsByYearCreationAndHigherPrice
            (int yearCreation ,int price , ArrayList<Car> cars){

        ArrayList<Car> carsByYearCreationAndHigherPrice = new ArrayList<>();
        for(Car car0 : cars){
            if(car0.getYearCreation() == yearCreation &&
               car0.getPrice()>= price ) {
                carsByYearCreationAndHigherPrice.add(car0);
            }

        }

        return carsByYearCreationAndHigherPrice;
    }

}
