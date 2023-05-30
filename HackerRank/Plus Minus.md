# Plus Minus
[HackerRank: Plus Minus 바로가기](https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=preparation-kits&playlist_slugs%5B%5D%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D%5B%5D=one-week-day-one)

5개의 정수가 있는 배열에서 양수, 음수, 0의 비율을 계산합니다.  
소수점 6자리까지 한 줄 씩 출력합니다.

<br>

# 코드
```
public static void plusMinus(List<Integer> arr) {
    int positive = 0;
    int negative = 0;
    int zero = 0;

    for (int i = 0; i < arr.size(); i++) {
        int n = arr.get(i);
        if (n > 0) {
            positive++;
        } else if (n < 0) {
            negative++;
        } else {
            zero++;
        }
    }

    System.out.printf("%.6f\n", (float)positive / arr.size());
    System.out.printf("%.6f\n", (float)negative / arr.size());
    System.out.printf("%.6f", (float)zero / arr.size());
}
```

<br>

# 주요 사항
`String.format(형식지정자, 값)`  
- %f : float 타입
- . 숫자 : 소수점 자릿수