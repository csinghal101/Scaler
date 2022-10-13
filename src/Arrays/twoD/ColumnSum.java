package Arrays.twoD;

import java.util.ArrayList;

public class ColumnSum {

    public static void main(String[] args) {

    }


    // T.C = O(N^2) and S.C = O(N);
    public static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> sumList = new ArrayList<>();
        for(int j = 0; j<A.get(0).size(); j++){
            int sum = 0;
            for(int i = 0; i<A.size(); i++){
                sum += A.get(i).get(j);
            }
            sumList.add(sum);
        }
        return sumList;

    }
}
