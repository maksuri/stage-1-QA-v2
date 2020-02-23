package collections.mainTasks.vegetables;

import collections.mainTasks.kindsOfVegetablesCategories.CucumberSort;

public class Cucumber extends Vegetable {
    CucumberSort sort;
    public Cucumber(int weight,CucumberSort sort){
        super(VegetableCategory.CUCUMBER,weight);
        this.sort = sort;
        int calories;
        switch(sort){
            case GHERKINS: calories = 75; break;
            case KIRBY: calories = 125; break;
            case LEMON: calories = 170; break;
            default: throw new IllegalStateException("Unexpected value: " + sort);
        }
        this.caloriesIn100Gr = calories;
    }
    public CucumberSort getSort(){
        return sort;
    }
    @Override
    public String toString(){
        return super.toString().replace("{", "{sort:" + getSort().getName()+", ") ;
    }
}
