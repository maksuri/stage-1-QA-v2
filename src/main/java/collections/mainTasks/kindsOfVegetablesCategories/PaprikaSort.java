package collections.mainTasks.kindsOfVegetablesCategories;

public enum PaprikaSort {
    HOT("Hot"),SWEET("Sweet"),SMOKED("Smoked");
    String name;
    PaprikaSort(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
