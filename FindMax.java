import java.rmi.server.SocketSecurityException;

public class FindMax {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 5, 5, 5, 5, 5};
        System.out.println(findMax(A, 0, A.length - 1));

    }

    public static boolean findMajority(int[] A, int i) {
        int count = 0;
        for (int k = 0; k < A.length; k++) {
            if (A[k] == i) count++;
        }return count > A.length / 2;}

    public static int findMax(int[] A, int s, int e) {
        if (s == e) return A[s];
        int m = (s + e) / 2;
        int left = findMax(A, s, m);
        int right = findMax(A, m + 1, e);
        if (left == right)return left;
        if (findMajority(A, left))return left;
        if (findMajority(A, right))return right;
        return -1;}

   }
