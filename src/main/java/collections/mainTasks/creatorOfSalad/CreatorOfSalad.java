package collections.mainTasks.creatorOfSalad;

import collections.mainTasks.salad.Salad;
import collections.mainTasks.kindsOfVegetablesCategories.*;
import collections.mainTasks.vegetables.*;

import java.util.ArrayList;

public class CreatorOfSalad {

    public static Salad create(){
        Tomato tomatoMain = new Tomato(100, TomatoSort.BEEFSTEAK);
        Tomato tomatoAdditional = new Tomato(50,TomatoSort.CHERRY);
        Carrot carrot = new Carrot(20,CarrotSort.CHELSEA);
        Cucumber cucumber = new Cucumber(10,CucumberSort.KIRBY);
        Paprika paprika = new Paprika(30, PaprikaSort.SMOKED);
        Broccoli broccoli = new Broccoli(40);
        ArrayList<Vegetable> salad = new ArrayList<>();
        salad.add(tomatoMain);
        salad.add(tomatoAdditional);
        salad.add(carrot);
        salad.add(cucumber);
        salad.add(paprika);
        salad.add(broccoli);
        return new Salad(salad,"Tasty");
    }
}
