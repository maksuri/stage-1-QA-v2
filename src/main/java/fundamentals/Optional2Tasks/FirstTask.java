package fundamentals.Optional2Tasks;
import java.util.Random;
import java.util.Scanner;
//Задание. Ввести с консоли n - размерность матрицы a [n] [n]. Задать значения элементов
// матрицы в интервале значений от -M до M с помощью генератора случайных чисел
// (класс Random).
// Упорядочить строки (столбцы) матрицы в порядке возрастания
// значений элементов k-го столбца (строки).
public class FirstTask {
    private static void changeColumn(int n, int[][]mas, int k,int l){
        for(int i = 0; i < n; i++){
            int temp;
            temp = mas[i][k];
            mas[i][k] = mas[i][l];
            mas[i][l] = temp;
        }

    }
    private static void changeRow(int n, int [][] mas,int k,int l){
            int [] masChange = new int [n];
            masChange = mas[k];
            mas[k]=mas[l];
            mas[l]=masChange;
    }
    private static void fillMatrix(int n,int[][]mas,int M){
        Random rand = new Random();
        for(int i = 0; i < n; i++){
            for(int j = 0; j<n; j++){
                mas[i][j] = rand.nextInt(2*M) - M;
            }
        }

    }
    private static void printMatrix(int n,int[][]mas){
        for(int i = 0; i < n; i++){
            for(int j = 0; j<n;j++){
                if(mas[i][j]>=0) {
                    System.out.print("+"+mas[i][j] + " ");
                }else{
                    System.out.print(mas[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
    private static void copyMatrix(int n, int[][]mas,int[][]masCopy){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                masCopy[i][j] = mas[i][j];
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int M = 5;
        int k = 0;
        int [][] mas = new int[n][n];
        int [][] masCopy = new int[n][n];
        fillMatrix(n,mas,M);
        copyMatrix(n,mas,masCopy);
        System.out.println("Matrix initial:");
        printMatrix(n,masCopy);
        for(int i = 0;i < n-1; i++){
            for(int j = i + 1; j < n; j++){
                if(mas[i][k]>mas[j][k]){
                    changeRow(n,mas,i,j);
                }
            }
        }
        System.out.println("Matrix after ascending sorting rows by values of " + (k + 1) + " column");
        printMatrix(n,mas);

        System.out.println("Matrix initial:");
        printMatrix(n,masCopy);

        for(int i = 0;i < n-1; i++){
            for(int j = i + 1; j < n; j++){
                if(masCopy[k][i]>masCopy[k][j]){
                    changeColumn(n,masCopy,i,j);
                }
            }
        }
        System.out.println("Matrix after ascending sorting columns by values of " + (k + 1) + " row");
        printMatrix(n,masCopy);
    }
}
