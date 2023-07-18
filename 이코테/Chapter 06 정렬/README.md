# Chapter 06 정렬
1. 선택 정렬 (Selection Sort)  
가장 작은 데이터를 선택 해 앞에 있는 데이터와 위치를 바꾸는 방법
2. 삽입 정렬 (Insertion Sort)  
처리되지 않은 데이터를 하나씩 골라 적절한 위치에 삽입하는 방법

3. 퀵 정렬 (Quick Sort)  
pivot(기준 데이터)을 기준으로 작은 값, 큰 값의 위치를 바꾸는 방법

4. 계수 정렬 (Counting Sort)  
데이터 값과 동일한 인덱스 위치에 데이터가 등장한 횟수를 기록해 정렬하는 방법

    - 데이터의 크기 범위가 제한되어 정수로 표현할 수 있을 때 사용 가능
    - 데이터 개수가 N, 데이터 중 최댓값이 K일 때 최악의 경우에도 수행 시간 O(N+K) 보장
    - 동일한 값을 가지는 데이터가 여러 개 등장할 때 효과적으로 사용
<br>

![정렬 알고리즘](https://github.com/EunsilSon/coding-test-practice/assets/46162801/deaacc21-ea5c-4f6d-90be-20c2d453805c)

<br>

# 연습 문제: 두 배열의 원소 교체

N과 K, 배열 A와 배열 B가 주어졌을 때, 최대 K번의 바꿔치기 연산을 수행해 만들 수 있는 배열 A의 모든 원소의 합의 최댓값을 출력합니다.

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Integer[] arrA = {1, 2, 5, 4, 3};
        Integer[] arrB = {5, 5, 6, 6, 5};

        //배열 A 오름차순 정렬
        Arrays.sort(arrA);

        // 배열 B 내림차순 정렬
        Arrays.sort(arrB, Collections.reverseOrder());

        // 원소 교체
        for (int i = 0; i < K; i++) {
            if (arrA[i] < arrB[i]) {
                int temp = arrA[i];
                arrA[i] = arrB[i];
                arrB[i] = temp;
            } else {
                break;
            }
        }

        // arrA의 합계
        int answer = 0;
        for (int n : arrA) {
            answer += n;
        }

        System.out.println(answer);
    }
}
```
삽입 정렬을 이용하여 arrA는 작은 값을 꺼내야 하므로 오름차순을, arrB는 큰 값을 꺼내야 하므로 내림차순으로 정렬 후 K번째까지의 원소들을 교체하고 arrA의 합을 출력한다.