package Arrays.twoD;

import java.util.ArrayList;

public class RowSum {

    // T.C = O(N^2) and S.C = O(N);
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> sumList = new ArrayList<>();
        for(int i = 0; i<A.size(); i++){
            int sum = 0;
            for(int j = 0; j<A.get(i).size(); j++){
                sum += A.get(i).get(j);
            }
            sumList.add(sum);
        }
        return sumList;
    }
}
