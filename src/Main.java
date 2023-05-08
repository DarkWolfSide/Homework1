import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 2 dimensional Array's size:");
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> arrList2D = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "]=");
                row.add(in.nextInt());
            }
            arrList2D.add(row);
            System.out.println();
        }
        ArrayList<Integer> Output = new ArrayList<Integer>();
        // Task 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    Output.add(arrList2D.get(i).get(j));
                }
            }
        }
        System.out.print("1. Diagonal array's elements are:");
        System.out.println(Output);
        Output.clear();
        // Task 2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1) {
                    Output.add(arrList2D.get(i).get(j));
                }
            }
        }
        System.out.print("2. Back Diagonal array's elements are:");
        System.out.println(Output);
        Output.clear();
        // Task 3
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    Output.add(arrList2D.get(i).get(j));
                }
            }
        }
        System.out.print("3. Diagonal array's elements and below are:");
        System.out.println(Output);
        Output.clear();
        // Task 4
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j) {
                    Output.add(arrList2D.get(i).get(j));
                }
            }
        }
        System.out.print("4. Diagonal array's elements and above are:");
        System.out.println(Output);
        Output.clear();
        // Task 5
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j >= n - 1) {
                    Output.add(arrList2D.get(i).get(j));
                }
            }
        }
        System.out.print("5. Back Diagonal array's elements and below are:");
        System.out.println(Output);
        Output.clear();
        // Task 6
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j <= n - 1) {
                    Output.add(arrList2D.get(i).get(j));
                }
            }
        }
        System.out.print("6. Back Diagonal array's elements and above are:");
        System.out.println(Output);
        Output.clear();
        // Task 7
        for (int i = 0; i < n; i++) {
            if(i%2 == 0){
                for (int j = 0; j <= i; j++) {
                    Output.add(arrList2D.get(i).get(j));
                }
            }
            else{
                for (int j = i; j >= 0; j--) {
                    Output.add(arrList2D.get(i).get(j));
                }
            }
        }
        System.out.print("7. Stair array's elements are:");
        System.out.println(Output);
        Output.clear();
    }
}