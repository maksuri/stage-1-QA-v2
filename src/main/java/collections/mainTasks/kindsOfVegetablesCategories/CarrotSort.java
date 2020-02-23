package collections.mainTasks.kindsOfVegetablesCategories;

public enum CarrotSort {
    BOLERO("Bolero"),NELSON("Nelson"),CHELSEA("Chelsea");
    String name;
    CarrotSort(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
