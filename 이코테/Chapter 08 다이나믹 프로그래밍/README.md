# Chapter 08 다이나믹 프로그래밍
- 메모리를 적절히 사용해 수행 시간 효율성을 비약적으로 향상시키는 방법
- 이미 계산된 결과(작은 문제)는 별도의 메모리 영역에 저장해 다시 계산하지 않음
- 동적 계획법이라고도 함
    - 동적 할당: 프로그램이 실행되는 도주에 실행에 필요한 메모리를 할당하는 기법

### 조건

1. 최적 부분 구조: 큰 문제를 작은 문제로 나눠 작은 문제의 답을 모아 큰 문제를 해결
2. 중복되는 부분 문제: 동일한 작은 문제를 반복적으로 해결

### 구현

1. 탑다운 (하향식)
    - 메모이제이션 (Memoization)
        - 한 번 계산한 결과를 메모리 공간에 메모해 같은 문제를 다시 호출하면 메모한 결과를 그대로 가져온다. 캐싱(Caching)이라고도 함
        - DP에 국한된 개념은 아님
2. 보텀업 (상향식)
    - DP의 전형적인 방식으로, 반복문 사용
    - DP 테이블: 결과 저장용 리스트

<br>

## 예제) 피보나치 수열

- 재귀 호출

```java
public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
```

- 탑다운 방식

```java
static long[] d = new long[100];

public static long topFibo(int n) {
    // 종료 조건
    if (n == 1 || n == 2) {
        return 1;
    }

    // 계산된 문제인 경우 그대로 사용
    if (d[n] != 0) {
        return d[n];
    }

    // 피보나치 결과 반환
    d[n] = topFibo(n - 1) + topFibo(n - 2);
    return d[n];
}
```

- 보텀업 방식

```jsx
public static long bottomFibo(int n) {
    long[] d = new long[100];
    d[1] = 1;
    d[2] = 1;

    for (int i = 3; i <= n; i++) {
        d[i] = d[i - 1] + d[i - 2];
    }
    return d[n];
}
```