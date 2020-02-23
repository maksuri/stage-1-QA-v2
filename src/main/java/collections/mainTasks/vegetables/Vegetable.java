package collections.mainTasks.vegetables;

public abstract class  Vegetable {

    protected VegetableCategory category;
    protected int caloriesIn100Gr;
    protected int weight;
    public Vegetable(VegetableCategory category,int weight){
        this.category = category;
        this.weight = weight;
    }
    public Vegetable(VegetableCategory category,int calories,int weight){
        this.category = category;
        this.caloriesIn100Gr = calories;
        this.weight = weight;

    }
    public VegetableCategory getCategory(){
        return category;
    }
    public int getCaloriesIn100Gr(){
        return caloriesIn100Gr;
    }
    public int getWeight(){
        return weight;
    }
    public double getCalories(){
        return weight * caloriesIn100Gr / 100.0;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    @Override
    public String toString(){
        return getCategory().getName() + "{calories:" + getCalories()+
                ", weight in grams:" + getWeight() + "}";
    }
}
