import java.rmi.server.SocketSecurityException;

public class BinomialCoefficient {
    public static void main(String[] args) {
        int[][] arr = BCDP(5,2);

        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int BC(int n, int k) {
        if(k == 0 || k == n)
        return 1;
        else
        return (BC(n-1,k-1) + BC(n-1,k));
    }

    public static int[][] BCDP(int n, int k) {
        int[][] arr = new int[n+1][k+1];

        for(int i=0;i<=n;i++) {
            for(int j=0;j<=Math.min(i,k);j++) {
                if(j==0 || j==i)
                arr[i][j] = 1;
                else
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }
        return arr;
    }

   }
