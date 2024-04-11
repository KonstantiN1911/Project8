import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Project5 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 5));
        int k = 2;
        printSubArray(arr, k);
    }

    private static List<Double> printSubArray(List<Integer> arr, int k) {
        List<Double> list = new ArrayList<>();
        for (int i = 0; i <= arr.size() - k; i++) {
            List<Integer> subList = arr.subList(i, i + k);
            double subSum = 0;
            for(int j = 0; j < k; j ++){
                subSum += subList.get(j);
            }
            list.add(subSum / k);
        }
        System.out.println(list);
        return list;
    }
}