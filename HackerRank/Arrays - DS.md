# Arrays - DS
[HackerRank : Arrays - DS 바로가기](https://www.hackerrank.com/challenges/arrays-ds/problem?isFullScreen=true)

배열의 요소를 뒤집습니다.

<br>

# 예시
A = [1, 2, 3] 일 때,
[3, 2, 1] 을 반환합니다.

<br>

# 코드
```
public static List<Integer> reverseArray(List<Integer> a) {
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = a.size()-1; i >= 0; i--) {
            list.add(a.get(i));
        }
        
        return list;

    }
```

<br>

# 해설
1. 새 리스트 list를 생성한다.
2. 매개변수로 받은 a의 마지막 요소부터 새 리스트 list에 넣는다.