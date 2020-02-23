package collections.mainTasks.printer;

import collections.mainTasks.salad.Salad;
import collections.mainTasks.vegetables.Vegetable;

import java.util.List;

public class PrinterOfActionOfSalad {
    public static void printSalad(Salad salad){
        System.out.println(salad);
        System.out.println();
    }
    public static void printCaloriesOfSalad(Salad salad){
        System.out.println("Calories of salad " + salad.getName() + ":" + salad.getCaloriesOfSalad());
        System.out.println();
    }
    public static void printVegetablesOfSaladSortingByCalories(Salad salad){
        List<Vegetable> vegetableSortByCalories =  salad.sortByVegetableCalories();
        System.out.println("Vegetables of salad:" + salad.getName() + " after sorting them by calories ascending");
        for(Vegetable vegetable : vegetableSortByCalories){
            System.out.println(vegetable);
        }
        System.out.println();
    }
    public static void printVegetablesOfSaladInCaloriesDiapason(Salad salad,double minCalories,double maxCalories){
        List<Vegetable> vegetablesByCaloriesDiapason =
                salad.getVegetablesByCaloriesDiapason(minCalories,maxCalories);
        System.out.println("Vegetables of salad:" + salad.getName() + " with calories in diapason, minimum:"
                + minCalories + ";maximum:" + maxCalories);
        for(Vegetable vegetable : vegetablesByCaloriesDiapason){
            System.out.println(vegetable);
        }
    }
}
