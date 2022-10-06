package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RangeSumQuery {
    public static void main(String[] args) {
        //Integer[] A = {7, 3, 1, 5, 5, 5, 1, 2, 4, 5};
        Integer[] A = {1, 2, 3, 4, 5};
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        ArrayList<Integer> d = new ArrayList<>();
        ArrayList<Integer> e = new ArrayList<>();
        ArrayList<Integer> f = new ArrayList<>();
        c.add(1);
        c.add(4);
        d.add(2);
        d.add(2);
//        e.add(3);
//        e.add(5);
//        f.add(1);
//        f.add(10);
       // B.add(c);
        B.add(d);
//        B.add(e);
//        B.add(f);
        System.out.println(rangeSum(new ArrayList<Integer>(Arrays.asList(A)), B));

    }

    public static ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {

        ArrayList<Long> psList = new ArrayList<>();
        int s = 0;
        int e = 0;
        //psList.add(A.get(0));
        ArrayList<Long> sum = new ArrayList<>();
        for(int i = 0; i< A.size(); i++){
            if(i == 0){
                psList.add(Long.valueOf(A.get(i)));
            }else{
                psList.add(A.get(i)+ psList.get(i-1));
            }
        }
        System.out.println(psList);

        for(int j = 0; j<B.size(); j++){
                s = B.get(j).get(0)-1;
                e = B.get(j).get(1)-1;

                if(s==0){
                    sum.add(psList.get(e));
                }else{
                    sum.add(psList.get(e) - psList.get(s-1));
                }

        }
        return sum;
    }


}

