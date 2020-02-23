package collections.mainTasks.salad;

import java.util.ArrayList;
import java.util.List;
import collections.mainTasks.vegetables.Vegetable;
import collections.mainTasks.vegetables.ComparatorByCalories;
import collections.mainTasks.vegetables.ComparatorByWeight;


public class Salad {

    private List<Vegetable> salad;
    String name;
    public Salad(List<Vegetable> listVegetables,String name){
        salad = new ArrayList<>(listVegetables) ;
        this.name = name;

    }
    public String getName(){
        return name;
    }
    private List<Vegetable> copySalad(){
        return new ArrayList<>(salad);
    }
    public double getCaloriesOfSalad(){
        double caloriesOfSalad = 0;
        for(Vegetable vegetable: salad){
            caloriesOfSalad += vegetable.getCalories();
        }
        return caloriesOfSalad;
    }

    public List<Vegetable> sortByVegetableCalories(){
        List<Vegetable> copyOfSalad = copySalad();
        copyOfSalad.sort(new ComparatorByCalories());
        return copyOfSalad;
    }
    public List<Vegetable> sortByVegetableWeight(){
        List<Vegetable> copyOfSalad = copySalad();
        copyOfSalad.sort(new ComparatorByWeight());
        return copyOfSalad;
    }
    public List<Vegetable> getVegetablesByCaloriesDiapason(double minCalories, double maxCalories){
        List<Vegetable> vegetablesByCaloriesDiapason = new ArrayList<>();
        for(Vegetable vegetable: salad){
            if(vegetable.getCalories()>= minCalories && vegetable.getCalories()<= maxCalories){
                vegetablesByCaloriesDiapason.add(vegetable);
            }
        }
        return vegetablesByCaloriesDiapason;

    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Salad:" + name + "{" + "\n");
        for( Vegetable vegetable : salad ){
            sb.append(vegetable.toString() + "\n");
        }
        sb.append("}");
        return sb.toString();

    }
}
