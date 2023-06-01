# Counting Sort 1
[HackerRank : Counting Sort 1 바로가기](https://www.hackerrank.com/challenges/one-week-preparation-kit-countingsort1/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=preparation-kits&playlist_slugs%5B%5D%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D%5B%5D=one-week-day-two)

계수 정렬을 실행합니다. 정수 배열 arr에 존재하는 각 요소의 개수를 카운트하여 반환합니다.
각 결과값을 result[i]는 arr에 나타난 횟수를 나타냅니다.

<br>

# 예시
arr = [1, 1, 3, 2, 1] 일 때,
result = [0, 3, 1, 1] 이 됩니다.

<br>

# 코드
```
public static List<Integer> countingSort(List<Integer> arr) {
        int[] countArr = new int[100];
        
        // 개수 카운팅
        for (int i = 0; i < arr.size(); i++) {
            countArr[arr.get(i)]++;
        }
        
        // 배열을 리스트로 변환
        List<Integer> list = new ArrayList<>();
        for (int n : countArr) {
            list.add(n);
        }
        
        return list;
    }
```

<br>

# 해설
1. arr 의 크기 만큼 반복합니다.
2. 카운팅 한 결과를 countArr 배열의 인덱스 arr.get(i)에 저장합니다. 
3. 배열의 값을 리스트에 넣어 리스트를 반환합니다 ~~(왜 해커랭크는 설명은 배열로 해놓고 매개변수, 반환값은 다 리스트로... 임의로 변경도 안 되고...)~~