package collections.mainTasks.vegetables;
import collections.mainTasks.kindsOfVegetablesCategories.TomatoSort;



public class Tomato extends Vegetable {
    TomatoSort sort;
    public Tomato(int weight,TomatoSort sort){
        super(VegetableCategory.TOMATO,weight);
        this.sort = sort;
        int calories;
        switch(sort){
            case BEEFSTEAK: calories = 50; break;
            case CHERRY: calories = 100; break;
            case MARZANO: calories = 150; break;
           default: throw new IllegalStateException("Unexpected value: " + sort);
       }
       this.caloriesIn100Gr = calories;
    }
    public TomatoSort getSort(){
        return sort;
    }
    @Override
    public String toString(){
        return super.toString().replace("{", "{sort:" + getSort().getName()+", ") ;
    }

    public static class Cucumber {
    }
}
