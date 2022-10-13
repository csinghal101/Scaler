package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ClosestMinMax {
    public static void main(String[] args) {
        Integer[] A = {11, 0, -1, 1, 6, 121};
        System.out.println(solve(new ArrayList<>(Arrays.asList(A))));
    }

    public static int  solve(ArrayList<Integer> A) {
        int min = A.get(0);
        int max = A.get(0);
        int ans = A.size();
        for (int i = 1; i < ans; i++) {
            if (A.get(i) < min) {     // alternate to this is using Math.min(min, A.get(i))
                min = A.get(i);
            }

            if (A.get(i)> max) { // alternate to this is using Math.max(max, A.get(i))
                max = A.get(i);
            }
        }
            // one can also use Collections.sort() function and pick min and max at index 0 and size-1

        for(int j = 0; j<A.size(); j++){
            if(A.get(j)== min ){
                for(int k= j; k<A.size(); k++){
                    if(A.get(k) == max){
                        ans = Math.min(ans, k-j+1);
                        break;
                    }
                }
            } else if (A.get(j)== max ) {
                for(int k= j; k<A.size(); k++){
                    if(A.get(k) == min){
                        ans = Math.min(ans, k-j+1);
                        break;
                    }
                }
            }
        }

        return ans;
        // T.C will be O(N +N )-> O(N)
        // S.C will be O(1)
    }
}
