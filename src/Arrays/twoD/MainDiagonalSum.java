package Arrays.twoD;

import java.util.ArrayList;
import java.util.List;

public class MainDiagonalSum {

    // Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.
    //T.C = O(N) and S.C = O(1)
    public int solve(final List<ArrayList<Integer>> A) {
        int sum = 0;
        for(int i = 0; i<A.size(); i++){
            sum += A.get(i).get(i);

        }
        return sum;
    }
}
