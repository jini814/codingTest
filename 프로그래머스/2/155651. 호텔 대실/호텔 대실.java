import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int[][] times = new int[book_time.length][2];
        
        for (int i = 0; i < book_time.length; i++) {
            times[i][0] = timeToMinutes(book_time[i][0]);
            times[i][1] = timeToMinutes(book_time[i][1]) + 10; 
        }

        Arrays.sort(times, Comparator.comparingInt(a -> a[0]));

        PriorityQueue<Integer> roomEndTimes = new PriorityQueue<>();
        
        for (int[] time : times) {
            if (!roomEndTimes.isEmpty() && roomEndTimes.peek() <= time[0]) {
                roomEndTimes.poll(); 
            }
            roomEndTimes.offer(time[1]); 
        }

        return roomEndTimes.size(); 
    }

    private int timeToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}