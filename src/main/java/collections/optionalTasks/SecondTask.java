package collections.optionalTasks;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
//2.   Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.
public class SecondTask {
    private static boolean isNumber(String string){
        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) < '0' || string.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        String string = scanner.nextLine();

        if(!isNumber(string)){

            System.out.println("You entered not a number");

        }{
            Deque<Character> digitsOfNumber = new ArrayDeque<>();

            for(int i = 0; i < string.length(); i++){
                digitsOfNumber.push(string.charAt(i));
            }

            System.out.println("The number in reverse order:");

            while(!digitsOfNumber.isEmpty()){
                System.out.print(digitsOfNumber.pop());
            }
        }
    }
}
