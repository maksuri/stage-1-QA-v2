package fundamentals.mainTasks;
//Отобразить в окне консоли аргументы командной строки в обратном порядке

public class SecondTask {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++ ){
            int index = (args.length - 1) - i;
            System.out.print(args[index] + " ");
        }
    }
}
