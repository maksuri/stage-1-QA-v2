package collections.mainTasks.kindsOfVegetablesCategories;

public enum CucumberSort  {
    GHERKINS("Gherkins"),KIRBY("Kirby"),LEMON("Lemon");
    String name;
    CucumberSort(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
