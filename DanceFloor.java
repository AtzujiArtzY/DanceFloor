import java.util.Scanner;

class DanceFloor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println();
        int n = scan.nextInt();
        int c_temp = 0;
        int[] arr_temp = new int[n];
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = scan.nextInt();
                //System.out.println(arr[i][j]);
            }
            if ((arr[i][0] % 2 == 0 && arr[i][1] % 2 == 0) || (arr[i][0] % 2 != 0 && arr[i][1] % 2 != 0)) {
                arr_temp[c_temp] = i;
                //System.out.println(arr_temp[c_temp]);
                c_temp++;
            }
        }
        //System.out.println(c_temp);
        int max = 0;
        int m = c_temp;
        //System.out.println(m);
        int[] sum = new int[m];
        for (int i = 0; i < m; i++) {
            sum[i] = Math.abs(arr[arr_temp[i]][0] - arr[arr_temp[i]][1]);
            if (sum[i] >= max)
                max = sum[i];
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            if (sum[i] == max) {
                System.out.println(arr[arr_temp[i]][0]+" "+arr[arr_temp[i]][1]);
            }
        }
    }
}
//End program
