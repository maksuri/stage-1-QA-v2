package fundamentals.Optional1Tasks;
import java.util.Scanner;
//Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
public class FirstTask {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int minLength = Integer.MAX_VALUE;
        int maxLength = 0;
        String minString = null;
        String maxString = null;
        for(int i = 1; i <= n; i++){
       //     scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            if(s.length() <= minLength){
                minString = s;
                minLength = s.length();
            }
            if(s.length() >= maxLength){
                maxString = s;
                maxLength = s.length();
            }
        }
        System.out.println("The shortest number is:" + minString +" with length:" +minLength);
        System.out.println("The longest number is:"+ maxString +" with length:" +maxLength);
    }
}
