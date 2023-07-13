# 그리디
- 최적의 해 구하기
- 정당성 분석

### 문제: 거스름돈

```java
public class Main {
	public static void main(String[] args) {
		int n = 1260;
		int cnt = 0;
		int[] coinTypes = {500, 100, 50, 10};

		for (int i = 0; i < 4; i++) {
			cnt += n / coinTypes[i];
			n %= coinTypes[i];
		}

		System.out.println(cnt);
	}
}
```

### 문제: 1이 될 때까지

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int cnt = 0;

        while (N != 1) {
            if (N % K == 0) {
                N /= K;
            } else {
                N -= 1;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
```

### 문제: 곱하기 혹은 더하기

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int answer = 1;

        for (int i = 0; i < str.length(); i++) {
            int n = Character.getNumericValue(str.charAt(i));
            
            if (n == 0) {
                answer += n;
            } else {
                answer *= n;
            }
        }
        System.out.println(answer);
    }
}
```

line 8 : int 배열을 따로 만들지 않고 바로 형 변환해서 사용

### 문제: 모험가 길드

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int groupCnt = 0;
        int personCnt = 0;

        for (int i = 0; i < arr.length; i++) {
            personCnt++;

            if (personCnt >= arr[i]) {
                groupCnt++;
                personCnt = 0;
            }
        }
        System.out.println(groupCnt);
    }
}
```