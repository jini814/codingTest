import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        HashMap<String, Integer> newData = new HashMap<String, Integer>();
        newData.put("code", 0);
        newData.put("date", 1);
        newData.put("maximum", 2);
        newData.put("remain", 3);

        //ext값이 val_ext보다 작을 시 추가 
        List<int[]> filterData = new ArrayList<>();
        
        for (int[] d : data) {
            if (d[newData.get(ext)] < val_ext) {
                filterData.add(d);
            }
        }
        //sort_by 값에 맞춰서 오름차순 정렬
        // Comparator.comparingInt 메소드는 int를 반환하는 함수를 인자로 받아 해당 값을 기준으로 정렬한다. 
        filterData.sort(Comparator.comparingInt(arr -> arr[newData.get(sort_by)]));

        return filterData.toArray(new int[0][]);
    }
}
