package collections.mainTasks.vegetables;

import java.util.Comparator;

public class ComparatorByCalories implements Comparator<Vegetable> {
    @Override
    public int compare(Vegetable o1, Vegetable o2) {
        if(o1.getCalories() > o2.getCalories()){
            return 1;
        }else if(o1.getCalories() < o2.getCalories()){
            return -1;
        }
            return 0;

    }

}
