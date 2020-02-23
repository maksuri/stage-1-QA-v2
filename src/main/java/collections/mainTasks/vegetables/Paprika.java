package collections.mainTasks.vegetables;

import collections.mainTasks.kindsOfVegetablesCategories.PaprikaSort;

public class Paprika extends Vegetable {
    PaprikaSort sort;
    public Paprika(int weight,PaprikaSort sort){
        super(VegetableCategory.PAPRIKA,weight);
        this.sort = sort;
        int calories;
        switch(sort){
            case HOT: calories = 80; break;
            case SWEET: calories = 90; break;
            case SMOKED: calories = 100; break;
            default: throw new IllegalStateException("Unexpected value: " + sort);
        }
        this.caloriesIn100Gr = calories;
    }
    public PaprikaSort getSort(){
        return sort;
    }
    @Override
    public String toString(){
        return super.toString().replace("{", "{sort:" + getSort().getName()+", ") ;
    }
}
