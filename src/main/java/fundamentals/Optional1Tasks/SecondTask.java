package fundamentals.Optional1Tasks;
import java.util.Scanner;
//2.     Вывести числа в порядке возрастания (убывания) значений их длины.
public class SecondTask {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String [] mas = new String[n];
        for(int i = 0; i < n; i++){
            mas[i] = scanner.nextLine();
        }
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1 ; j < n ; j++ ){
                if(mas[i].length()>mas[j].length()){
                    String temp;
                    temp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = temp;
                }
            }
        }
        System.out.println("Ascending numbers by length");
        for(int i = 0; i < n; i++){
            System.out.print(mas[i] + " ");
        }
        System.out.println("");
        System.out.println("Descending numbers by length");
        for(int i = 0; i < n; i++){
            System.out.print(mas[n-1-i] + " ");
        }
    }
}
