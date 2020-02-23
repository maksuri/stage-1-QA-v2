package collections.mainTasks.vegetables;

public enum VegetableCategory {
    TOMATO("Tomato"),CUCUMBER("Cucumber"),PAPRIKA("Paprika"),CARROT("Carrot"),
    BROCCOLI("Broccoli");

    String name;

    VegetableCategory(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
