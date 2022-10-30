package Arrays.slidingwindow;

import java.time.chrono.IsoEra;
import java.util.ArrayList;
import java.util.Arrays;

public class SubArraySum {

    public static void main(String[] args) {

        Integer[] A = { 94, 88, 2, 52, 93, 58, 42, 27, 66, 4, 89, 57, 37, 53, 60, 96, 31, 33, 9, 14, 53, 86, 40, 25, 65, 66, 6, 32, 35, 5, 53, 64, 41, 13, 21, 72, 27, 13, 96, 85, 92, 34, 44, 3, 87, 98, 76, 98, 15, 40, 22, 93, 75, 90, 40, 79, 26, 60, 18, 37, 73, 60, 14, 37, 44, 13, 1, 38, 33, 31, 79, 66, 81, 90, 54, 58, 53, 2};
        System.out.println(solve(new ArrayList<>(Arrays.asList(A)),75,2));

    }

    public static int solve(ArrayList<Integer> A, int B, int C) {
        ArrayList<ArrayList<Integer>> subArray = new ArrayList<>();
            for(int i = 0; i<A.size(); i++){
                for(int j = i; j<A.size(); j++){
                    ArrayList<Integer> sub = new ArrayList<>();
                    for(int k = i; k<=j; k++){
                        sub.add(A.get(k));
                    }
                    subArray.add(sub);
                }
            }

        System.out.println(subArray.get(229));
            for(int i = 0; i<subArray.size(); i++){
                int sum = 0;
                for(int j = 0; j<subArray.get(i).size(); j++){
                    if(subArray.get(i).size() == B){
                        //System.out.println(i + " , " +j);
                        sum+= subArray.get(i).get(j);
                    }
                    if(sum == C){
                        return 1;
                    }
                }
            }

        return 0;
    }
}
