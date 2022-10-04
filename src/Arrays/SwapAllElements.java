package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SwapAllElements {

    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(2);
        A.add(1);
        System.out.println(solve(A));
    }


    public static ArrayList<Integer> solve(final List<Integer> A) {
        ArrayList<Integer> B = new ArrayList<>();
        int e = A.size()-1;
        for(int i = 0; i<A.size(); i++){
            B.add(i,A.get(e));
            e--;

        }
        return B;
    }
}
