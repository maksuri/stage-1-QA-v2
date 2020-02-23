package collections.optionalTasks;
import java.util.*;
//
 //   5.Не используя вспомогательных объектов,
 //   переставить отрицательные элементы данного списка в конец,
 //   а положительные — в начало списка
public class FifthTask {
    public static void main(String[] args) {

        Random rand = new Random();
        int M = 100;
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            int number = rand.nextInt(2*M) - M;
            numbers.add(number);
        }
        System.out.println("Initial order of List");
        System.out.println(numbers);
        Collections.sort(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
    }
}
