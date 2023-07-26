# Chapter 04 구현
- 머릿속에 있는 알고리즘을 소스코드로 바꾸는 과정

<br>

## 연습 문제: 상하좌우
MxM 행렬에서 시작 좌표 (1,1)에서 시작해 상, 하, 좌, 우 이동하여 계획서대로 움직인다.  
최종적으로 도착할 지점의 좌표를 출력한다.

### 내 코드

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String direction = sc.nextLine();

        int[][] map = new int[N][N];
        int x = 1, y = 1;
        int nx = 0, ny = 0;

        for (int i = 0; i < direction.length(); i++) {
            char c = direction.charAt(i);

            switch (c) {
                case 'L': // 왼
                    nx = x;
                    ny = y - 1;
                    break;
                case 'R': // 오
                    nx = x;
                    ny = y + 1;
                    break;
                case 'U': // 위
                    nx = x - 1;
                    ny = y;
                    break;
                case 'D': // 아래
                    nx = x + 1;
                    ny = y;
                    break;
            }

            if (nx < 1 || ny < 1 || nx > N || ny > N) {
                continue;
            }
            
            x = nx;
            y = ny;
        }
        System.out.printf("%d %d", x, y);
    }
}
```

switch 문을 사용해 nx, ny 변수를 반복 횟수만큼 재할당 하므로 추후 수정이 어려운 코드

### 답안 코드

```java
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String[] plans = sc.nextLine().split(" ");
        int x = 1, y = 1;

        // L, R, U, D에 따른 이동 방향 
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};

        // 이동 계획을 하나씩 확인
        for (int i = 0; i < plans.length; i++) {
            char plan = plans[i].charAt(0);

            // 이동 후 좌표 구하기 
            int nx = -1, ny = -1;
            for (int j = 0; j < 4; j++) {
                if (plan == moveTypes[j]) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            if (nx < 1 || ny < 1 || nx > n || ny > n) continue;
            
            x = nx;
            y = ny;
        }

        System.out.println(x + " " + y);
    }

}
```

이동 방향과 좌표를 배열에 담아 필요한 값만 꺼내 사용해 추후 수정이 용이함

<br>

## 연습 문제: 시각
00시 00분 00초부터 N시 59분 59초까지의 모든 시각 중에서 3이 하나라도 포함되는 모든 경우의 수를 구한다.

### 내 코드

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;
        for (int h = 0; h <= N; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    if (Integer.toString(h).contains("3") || Integer.toString(m).contains("3") || Integer.toString(s).contains("3")) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
```

int를 String으로 변환해 시, 분, 초에 3이 포함하는 지 `contains()` 함수를 사용해 확인한다.

### 답안 코드

```java
public class Main {

		// 3이 포함되어 있는 지 확인하는 함수
    public static boolean check(int h, int m, int s) {
        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i <= h; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    if (check(i, j, k)) cnt++;
                }
            }
        }

        System.out.println(cnt);
    }

}
```

check 함수를 만들어 `/`, `%` 연산자를 사용해 시간, 분의 일의 자리와 십의 자리, 초의 일의 자리와 십의 자리에 3이 있는 지 계산하여 확인한다.