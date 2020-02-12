package fundamentals.mainTasks;
import java.util.Scanner;
//5.   Ввести число от 1 до 12. Вывести на консоль название месяца,
// соответствующего данному числу. Осуществить проверку корректности ввода чисел.
public class FifthTask {
    public static void main(String[] args) {
        int numOfMonth;
        System.out.println("Enter number of month");
        Scanner scanner = new Scanner(System.in);
        String [] masMonths = new String [12];
        masMonths[0] = "January";
        masMonths[1] = "February";
        masMonths[2] = "March";
        masMonths[3] = "April";
        masMonths[4] = "May";
        masMonths[5] = "June";
        masMonths[6] = "July";
        masMonths[7] = "August";
        masMonths[8] = "September";
        masMonths[9] = "October";
        masMonths[10] = "November";
        masMonths[11] = "December";
        if (scanner.hasNextInt()) {
            numOfMonth = scanner.nextInt();
            if(numOfMonth>=1 && numOfMonth<=12){
                System.out.println(masMonths[numOfMonth-1]);
            }else{
                System.out.println("You wrote number not between 1 and 12");
            }
        } else System.out.println("You wrote not an integer");
    }
}