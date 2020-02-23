package collections.mainTasks.vegetables;


import collections.mainTasks.kindsOfVegetablesCategories.CarrotSort;

public class Carrot extends Vegetable {
    CarrotSort sort;
    public Carrot(int weight,CarrotSort sort){
        super(VegetableCategory.CARROT,weight);
        this.sort = sort;
        int calories;
        switch(sort){
            case BOLERO: calories = 70; break;
            case NELSON: calories = 80; break;
            case CHELSEA: calories = 100; break;
            default: throw new IllegalStateException("Unexpected value: " + sort);
        }
        this.caloriesIn100Gr = calories;
    }
    public CarrotSort getSort(){
        return sort;
    }
    @Override
    public String toString(){
        return super.toString().replace("{", "{sort:" + getSort().getName()+", ") ;
    }
}
