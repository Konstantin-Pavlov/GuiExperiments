package useful_methods;

public class Print2DArray {
    public static void main(String[] args) {
    }

    static void print2DArray(double[][] arr, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(j == m - 1 ? arr[i][j] + " \n" : arr[i][j] + " ");
            }
        }

    }
}
