package fundamentals.mainTasks;
//Приветствовать любого пользователя при вводе его имени через командную строку.
public class FirstTask {
    public static void main(String[] args) {

        if(args.length>0) {
            System.out.println("Hello," + args[0] + "!");
        }

    }
}
