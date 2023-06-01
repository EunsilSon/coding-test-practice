# Diagonal Difference
[HackerRank : Diagonal Difference 바로가기](https://www.hackerrank.com/challenges/one-week-preparation-kit-diagonal-difference/problem?h_l=interview&isFullScreen=true&playlist_slugs%5B%5D%5B%5D=preparation-kits&playlist_slugs%5B%5D%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D%5B%5D=one-week-day-two)

정사각형 행렬이 주어지면 대각선의 합 사이의 절댓값을 계산합니다.

<br>

# 예시
```
1 2 3 
4 5 6 
7 8 9
```
- 왼쪽에서 오른쪽 대각선 1 + 5 + 9 = 15
- 오른쪽에서 왼쪽 대각선 3 + 5 + 9 = 17  

    두 대각선의 절댓값은 15 - 17 = 2 입니다.

<br>

# 코드
```
public static int diagonalDifference(List<List<Integer>> arr) {
        int leftDiagonal = 0;
        int rightDiagonal = 0;
        int j = arr.size();
    
        for (int i = 0; i < arr.size(); i++) {
            leftDiagonal += arr.get(i).get(i);
            rightDiagonal += arr.get(i).get(--j);
        }
        
        return Math.abs(leftDiagonal - rightDiagonal);
    }
```

<br>

# 해설
1. 왼쪽 대각선은 리스트의 인덱스 값이 같이 증가하므로 행과 열에 `i` 값을 넣는다.
2. 오른쪽 대각선은 리스트의 인덱스 값이 행은 1씩 증가, 열은 리스트의 크기 값부터 1씩 감소하므로 행에는 `i`, 열에는 `j`를 넣는다.
3. 절댓값 반환 함수 `Math.abs()`를 사용해 절댓값을 반환한다.

<br>

# 주요 사항
`Math.abs()`
- 인자값에 대한 절대값 반환 함수
- 인자값 : primitive data type (기본형)
    - 입력된 데이터 타입이 그대로 반환됨
- Math 클래스의 함수 중 하나로 static 함수