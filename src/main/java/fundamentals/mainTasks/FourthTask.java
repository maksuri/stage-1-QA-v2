package fundamentals.mainTasks;
//Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение)
// и вывести результат на консоль.
public class FourthTask {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;

        for(int i = 0; i < args.length; i++){
            sum += Integer.parseInt(args[i]);
            mul *= Integer.parseInt(args[i]);
        }

        System.out.println("Summ of numbers:"+sum);
        System.out.println("Multiplication of numbers:"+mul);
    }

}
