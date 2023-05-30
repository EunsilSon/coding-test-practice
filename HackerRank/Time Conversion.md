# Time Conversion
[HackerRank: Time Conversion 바로가기](https://www.hackerrank.com/challenges/one-week-preparation-kit-time-conversion/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=preparation-kits&playlist_slugs%5B%5D%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D%5B%5D=one-week-day-one)

12시간 AM/PM 형식의 시간을 24시간 형식으로 바꿉니다.

<br>

# 코드
```
public static String timeConversion(String s) {
        String[] time = s.split(":");

        int h = Integer.parseInt(time[0]);
        int m = Integer.parseInt(time[1]);
        int sec = Integer.parseInt(time[2].substring(0, 2));
        char ampm = time[2].charAt(2);
        
        if (ampm == 'A' && h == 12) {
            h = 0;
        }
        
        if (ampm == 'P') {
            h += 12;
        }
        
        if (h == 24) {
            h = 12;
        }
        
        String answer = String.format("%02d:%02d:%02d", h, m, sec);
        return answer;
    }
```

<br>

# 주요 사항
1. 문자열 구분자 기준으로 자르기  
`String[] str = 문자열.split("")`
    - 이스케이프 문자 사용

<br>

2. 문자열 인덱스 기준으로 자르기  
`문자열.substring(startIndex, endIndex)`

<br>

3. int → String 변환  
    - `Integer.toString()`  
    - `String.valueOf()`

<br>

4. String → int 변환
    - `Integer.parseInt()` // int 반환
    - `Integer.valueOf()` // Integer 반환