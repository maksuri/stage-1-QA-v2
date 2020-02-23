package collections.optionalTasks;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
//7. Задана строка, состоящая из символов
// «(», «)», «[», «]», «{», «}».
// Проверить правильность расстановки скобок. Использовать стек.

public class SeventhTask {
    public static void main(String[] args) {
        System.out.println("Enter the sequence of «(», «)», «[», «]», «{», «}»");
        Map<Character,Character> mapOfSpecialSymbols = new HashMap<>();
        mapOfSpecialSymbols.put('}','{');
        mapOfSpecialSymbols.put(')','(');
        mapOfSpecialSymbols.put(']','[');
        Scanner scanner = new Scanner(System.in);
        String sequenceOfSpecialSymbols = scanner.nextLine();
        Deque<Character> stackOfSpecialSymbols = new ArrayDeque<>();
        int index = 0;
        while (index < sequenceOfSpecialSymbols.length()){
            Character character = sequenceOfSpecialSymbols.charAt(index);
            if( stackOfSpecialSymbols.isEmpty() ){
              stackOfSpecialSymbols.push(character);
            }else{
                    if(mapOfSpecialSymbols.get(character) == stackOfSpecialSymbols.getFirst()){
                        stackOfSpecialSymbols.pop();
                    }else{
                        stackOfSpecialSymbols.push(character);
                    }
            }
            index++;
        }

        if(stackOfSpecialSymbols.isEmpty()){
            System.out.println("Brackets are correct");
        }else{
            System.out.println("Brackets are not correct");
        }

    }
}
