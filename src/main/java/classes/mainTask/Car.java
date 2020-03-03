package classes.mainTask;
//Создать классы, спецификации которых приведены ниже.
// Определить конструкторы и методы setТип(), getТип(), toString().
// Определить дополнительно методы в классе, создающем массив объектов.
// Задать критерий выбора данных и вывести эти данные на консоль. В каждом классе
// , обладающем информацией, должно быть объявлено несколько конструкторов.
//Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
//Создать массив объектов. Вывести:
//a) список автомобилей заданной марки;
//b) список автомобилей заданной модели, которые эксплуатируются больше n лет;
//c) список автомобилей заданного года выпуска, цена которых больше указанной.


public class Car {

    private static int maxId = 0;
    private int id;
    private Mark mark ;
    private String model;
    private int yearCreation;
    private Color color;
    private int price;
    private String regNumber;
    public Car(){
        maxId++;
        id = maxId;
    }
    public Car(Mark mark,String model,int yearCreation,Color color,
               int price,String regNumber){
        maxId++;
        id = maxId;
        this.mark = mark;
        this.model = model;
        this.yearCreation = yearCreation;
        this.color = color;
        this.price = price;
        this.regNumber = regNumber;
    };

    public void setMark(Mark mark){
        this.mark = mark;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYearCreation(int yearCreation){
        this.yearCreation = yearCreation;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public void setPrice(int price){

        this.price = price;
    }

    public void setRegNumber(String regNumber){
        this.regNumber = regNumber;
    }

    public int getId(){
        return id;
    }

    public Mark getMark(){
        return mark;
    }

    public String getModel(){
        return model;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getYearCreation() {
        return yearCreation;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public String toString() {
        return "ID:" + id + ";" + "Mark:" + mark + ";" +
                "Model:" + model + ";" + "Color:" + color + ";" +
                "Price:" + price + ";" + "Year creation:" + yearCreation + ";" +
                "Registration number:" + regNumber + ";";
    }
}
