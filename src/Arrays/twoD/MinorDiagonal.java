package Arrays.twoD;

import java.util.ArrayList;
import java.util.List;

public class MinorDiagonal {

    // Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that i + j = M -1  (where i, j are 1-based).
    //T.C = O(N) and S.C = O(1)
    public int solve(final List<ArrayList<Integer>> A) {
        int sum = 0;
        for(int i = 0; i<A.size(); i++){
            sum+= A.get(i).get(A.size()-1-i);
        }
        return sum;
    }
}
