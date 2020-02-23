package collections.mainTasks.kindsOfVegetablesCategories;

public enum TomatoSort {
    BEEFSTEAK("Beefsteak"),CHERRY("Cherry"),MARZANO("Marzano");
    String name;
    TomatoSort(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
