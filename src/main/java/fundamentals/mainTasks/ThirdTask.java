package fundamentals.mainTasks;
import java.util.Scanner;
import java.util.Random;

//3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of randoms: ");
        int number = scanner.nextInt();
        int [] masRandom = new int[number ];
        Random rand = new Random();
        for (int i = 0; i < number; i++){
            masRandom[i] = rand.nextInt(99) + 1;
        }
        for (int i = 0; i < number; i++){
                System.out.println(masRandom[i]);
        }
        for (int i = 0; i < number; i++){
            System.out.print(masRandom[i] + " ");
        }

    }
}
