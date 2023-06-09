# Greedy Florist
[HackerRank : Greedy Florist 바로가기](https://www.hackerrank.com/challenges/greedy-florist/problem?h_r=internal-search&isFullScreen=true)

플로리스트는 이익을 최대화하려고 합니다. 각 꽃의 가격에 해당 고객이 이전에 구매한 꽃의 수에 1씩 더하여 계산합니다.  
고객 그룹의 크기, 구매하려는 꽃의 수, 꽃의 정가가 주어지면 모든 꽃을 구매하기 위한 **최소 비용**을 구합니다.  

<br>

# 예시
c = [1, 2, 3, 4], k = 3 가 주어질 때,  
(current purchase + previous purchases) * c[0] = (1 + 1) x 1 = 2   
총 비용은 2 + 3 + 4 + 2 = 11 입니다. 

<br>

# 코드
```
static int getMinimumCost(int k, int[] c) {
    /**
     * 내림차순 삽입 정렬
     */
    for (int i = 1; i < c.length; i++) {
        int target = c[i];
        
        int j;
        for (j = i-1; j >= 0 && c[j] < target; j--) {
            c[j+1] = c[j];
        }
        c[j+1] = target;
    }
    
    int cost = 0; // 비용
    int count = 0; // 고객 수 카운트
    int prev = 1; // 이전에 구매한 꽃의 개수
    
    for (int i = 0; i < c.length; i++) {
        if (k > i) {
            cost += c[i];
        } else {
            if (k > count++) {
                cost += c[i] * (prev + 1);
            } else {
                count = 0;
                prev++;
                --i;
            }
        }
    }
    
    return cost;
}
```

<br>

# 해설
1. 최소 비용을 구해야 함으로 배열을 내림차순으로 정렬합니다.
2. `k` 번째 요소까지 꽃의 정가를 `cost`에 저장합니다.
3. 고객의 수`count` 만큼 계산식 대로 비용을 합산하고, 구매할 꽃이 남은 경우, `count`를 0으로 초기화하고 이전에 구매한 꽃의 개수 `prev`를 증가합니다.  
4. 변수 값을 재정한 후, 반복 횟수를 -1 하여 원래 순서로 돌아갑니다.