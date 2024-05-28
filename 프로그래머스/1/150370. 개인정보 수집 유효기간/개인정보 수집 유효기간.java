import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        String[] strToday = today.split("\\."); //점 기준으로 자르기
        Map<String, Integer> mapTerm = new HashMap<>();//약관 종류와 유효기간 저장
        List<Integer> answer = new ArrayList<>(); //정답 저장할 리스트

        int todayYear = Integer.parseInt(strToday[0]);
        int todayMonth = Integer.parseInt(strToday[1]);
        int todayDay = Integer.parseInt(strToday[2]);
        
        for (String term : terms) {
            String[] strTerm = term.split(" "); //공백 기준으로 자르기
            mapTerm.put(strTerm[0], Integer.parseInt(strTerm[1]));
        }
        
        for(int i = 0; i < privacies.length; i++) {
            String[] str1 = privacies[i].split(" "); //공백으로 기간, 약관 
            String[] str2 = str1[0].split("\\."); //날짜 중에서 . 기준으로 나누기
            
            int duration = mapTerm.get(str1[1]); //약관 종류 가져가서 넣어서 기간 가져오기
            
            //유효기간 더해서 날짜 계산하기
            int year = Integer.parseInt(str2[0]);
            int month = Integer.parseInt(str2[1]) + duration;
            int day = Integer.parseInt(str2[2]); 

            while (month > 12) {
                year += 1;
                month -= 12;
            }
            
            //28일로 가정하여 날짜 비교하기
            //연도가 다른 경우, 연도는 같지만 달이 다른 경우, 연도랑 달 같은데 날짜가 다른 경우
            if (year < todayYear || (year == todayYear && month < todayMonth) || (year == todayYear && month == todayMonth && day <= todayDay)) {
                answer.add(i + 1);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
