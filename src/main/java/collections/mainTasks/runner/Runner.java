package collections.mainTasks.runner;

import collections.mainTasks.salad.Salad;
import collections.mainTasks.creatorOfSalad.CreatorOfSalad;
import collections.mainTasks.vegetables.Vegetable;
import collections.mainTasks.printer.PrinterOfActionOfSalad;
import java.util.List;
//4. Шеф-повар. Определить иерархию овощей. Сделать салат. Подсчитать калорийность.
// Провести сортировку овощей для салата на основе одного из параметров.
// Найти овощи в салате, соответствующие заданному диапазону калорийности.
public class Runner {
    public static void main(String[] args) {
        Salad saladTasty = CreatorOfSalad.create();
        PrinterOfActionOfSalad.printSalad(saladTasty);
        PrinterOfActionOfSalad.printCaloriesOfSalad(saladTasty);
        PrinterOfActionOfSalad.printVegetablesOfSaladSortingByCalories(saladTasty);
        PrinterOfActionOfSalad.printVegetablesOfSaladInCaloriesDiapason
                (saladTasty,10.0,40.0);
    }
}
