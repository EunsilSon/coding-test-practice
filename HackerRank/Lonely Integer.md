# Lonely Integer
[HackerRank: Lonely Integer 바로가기](https://www.hackerrank.com/challenges/one-week-preparation-kit-lonely-integer/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=preparation-kits&playlist_slugs%5B%5D%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D%5B%5D=one-week-day-two)

모든 요소가 2번 발생하는 정수가 들어있는 리스트가 주어지면, 하나의 고유한 요소를 찾습니다.  

<br>

# 예시
a = [1, 2, 3, 4, 3, 2, 1] 에서 고유한 요소는 4 입니다.

<br>

# 코드
```
public static int lonelyinteger(List<Integer> a) {
        int count;
        int answer = 0;
        
        for (int i = 0; i < a.size(); i++) {
            count = 0;
            
            for (int j = 0; j < a.size(); j++) {
                if (a.get(i) == a.get(j)) {
                    count++;
                }
            }
            
            if (count == 1) {
                answer = a.get(i);
                break;
            }
        }
        return answer;
    }
```

<br>

# 해설
1. ArrayList를 순차적으로 반복하면서 특정 요소의 개수를 count에 저장한다.  
2. 만약 count가 1이라면 리스트의 고유한 요소이므로, 답을 저장하는 answer에 해당 요소의 값을 넣고 반복을 중단한다.  
3. answer을 반환한다.