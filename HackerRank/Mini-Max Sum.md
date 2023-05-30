# Mini-Max Sum
[HackerRank: Mini-Max Sum 바로가기](https://www.hackerrank.com/challenges/one-week-preparation-kit-mini-max-sum/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=preparation-kits&playlist_slugs%5B%5D%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D%5B%5D=one-week-day-one)

정수 5개가 입력됩니다. 5개의 정수 중에 4개의 정수를 더한 최솟값과 최댓값을 구합니다.  
한 줄에 최솟값과 최댓값 사이에 한 칸을 띄우고 출력합니다.

<br>

# 코드
```
public static void miniMaxSum(List<Integer> arr) {
        long minSum = 0;
        long maxSum = 0;
        
        Collections.sort(arr);
        
        for (int i = 0; i < arr.size()-1; i++) {
            minSum += arr.get(i);
        }
        
        for (int i = arr.size()-1; i > 0; i--) {
            maxSum += arr.get(i);
        }
        
        System.out.printf("%d %d", minSum, maxSum);
    }
```

<br>

# 주요 사항
List 정렬
  - 오름차순 `Collections.sort(arr)` (default)
  - 내림차순 `Collections.sort(List <T> list, Collections.reverseOrder())`