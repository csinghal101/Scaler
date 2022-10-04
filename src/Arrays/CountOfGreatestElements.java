package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountOfGreatestElements {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(7);
        A.add(4);
        A.add(2);
        A.add(10);
        A.add(5);
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {
        int count = 0;
        int max = A.get(0);
        for (int i = 0; i < A.size(); i++) {
           //for (int j = 1; j < A.size(); j++) {
                if (A.get(i) > max) {
                    max = A.get(i);
                }
            //}
        }
        for (int i = 0 ; i<A.size(); i++){
            if(A.get(i) == max){
                count++;
            }
        }
        return A.size() -count;

    }
}
