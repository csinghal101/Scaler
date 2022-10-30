package Arrays;

import java.util.ArrayList;
import java.util.Arrays;


// T.C = O(N), S.C = O(1)
public class RotateArrayGivenTimes {

    public static void main(String[] args) {
        Integer[] A = {7, 4, 2, 10, 5};
        solve(new ArrayList<>(Arrays.asList(A)),10);
        System.out.println(solve2(new ArrayList<>(Arrays.asList(A)),10));
    }

    public static void reverse(ArrayList<Integer> A, int s, int e){
        int i,j;
        for(i = s, j= e; i<j; i++,j--){
            int temp = A.get(i);
            A.set(i, A.get(j));
            A.set(j, temp);
        }
    }

    //modular way
    public static ArrayList<Integer> solve2(ArrayList<Integer> A, int B) {
        int N = A.size();
        if(B>=N){
            B= B % N;
        }
        reverse(A,0,N-1);
        reverse(A,0,B-1);
        reverse(A,B,N-1);
        return A;
    }

    // long way
    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int N = A.size();
        int end = N-1;
        for(int i = 0; i<=end; i++){
            int temp = A.get(i);
            A.set(i,A.get(end));
            A.set(end,temp);
            end--;
        }
        if(B>=N){
            B= B % N;
        }
        end =B;
        for(int i = 0; i<end ;i++){
            int temp = A.get(i);
            A.set(i, A.get(end-1));
            A.set(end-1, temp);
            end--;

        }
        for(int i = B; i<N; i++){
            int temp = A.get(i);
            A.set(i, A.get(N-1));
            A.set(N-1, temp);
            N--;
        }
        return A;
    }
}
