package collections.mainTasks.vegetables;

import java.util.Comparator;

public class ComparatorByWeight implements Comparator<Vegetable> {
    @Override
    public int compare(Vegetable o1, Vegetable o2) {
        if(o1.getWeight() > o2.getWeight()){
            return 1;
        }else if(o1.getWeight() < o2.getWeight()){
            return -1;
        }
            return 0;

    }
}
