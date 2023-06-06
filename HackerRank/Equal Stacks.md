# Equal Stacks
[HackerRank : Equal Stacks 바로가기](https://www.hackerrank.com/challenges/equal-stacks/problem?isFullScreen=false)

3개의 스택이 주어집니다. 모든 스택이 같은 높이가 될 수 있는 최대 높이를 찾습니다.

<br>

# 예시
h1 = [1,2,1,1]  
h2 = [1,1,2]  
h3 = [1,1]  
일 때,  

h1: 8 - 3 = 5  
h2: 9 - 4 = 5  
h3: 7 - 1 - 1 = 5  
3개의 스택의 높이는 height = 5 입니다.

<br>

# 코드
```
public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        Stack<Integer> stackA = new Stack<>();
        Stack<Integer> stackB = new Stack<>();
        Stack<Integer> stackC = new Stack<>();
        int sumA = 0;
        int sumB = 0;
        int sumC = 0;

        for (int i = h1.size()-1; i >= 0; i--) {
            stackA.push(h1.get(i));
            sumA += h1.get(i);
        }
        
        for (int i = h2.size()-1; i >= 0; i--) {
            stackB.push(h2.get(i));
            sumB += h2.get(i);
        }
        
        for (int i = h3.size()-1; i >= 0; i--) {
            stackC.push(h3.get(i));
            sumC += h3.get(i);
        }
        
        int min = sumA < sumB ? sumA : sumB;
        min = min < sumC ? min : sumC;
        
        while (true) {
            if (sumA == min && sumB == min && sumC == min) {
                return min;
            }
            
            if (sumA > min) {
                sumA -= stackA.pop();
                min = checkMin(sumA, min);
            }
            
            if (sumB > min) {
                sumB -= stackB.pop();
                min = checkMin(sumB, min);
            }
            
            if (sumC > min) {
                sumC -= stackC.pop();
                min = checkMin(sumC, min);
            }
        }
    }
    
    // 스택의 총합과 min 비교 함수
    public static int checkMin (int sum, int min) {
        if (sum > min) {
            return min;
        } else {
            return sum;
        }
    }
```

<br>

# 해설
1. List<Integer>에 있는 정수를 Stack에 담는다. ~~(입력할 때부터 Stack으로 주면 좋으련만)~~
2. 각 스택의 총합 `sum` 과 가장 작은 총합 `min` 을 구한다.
3. `sum`이 `min`과 같을 때까지 스택에서 값을 하나씩 삭제하며 `sum`과 `min`을 비교한다.
4. 모든 스택의 각 총합과 `min`이 같으면 반복을 종료한다.