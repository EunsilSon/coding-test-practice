# Left Rotation
[HackerRank : Left Rotation 바로가기](https://www.hackerrank.com/challenges/array-left-rotation/problem?isFullScreen=true)

배열의 요소를 왼쪽으로 이동시킵니다. 주어지는 정수 d만큼 회전합니다.

<br>

# 예시
d = 2, arr = [1,2,3,4,5] 일 때,  
2번 회전 후, arr = [3,4,5,1,2]를 반환합니다.

<br>

# 코드
```
public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        Integer[] array = new Integer[arr.size()];
        array = arr.toArray(new Integer[arr.size()]);
        
        for (int i = 0; i < d; i++) {
            int temp = array[0];
            
            for (int j = 1; j < arr.size(); j++) {
                array[j-1] = array[j];    
            }
            array[array.length-1] = temp;
        }
        
        return Arrays.asList(array);
    }
```

<br>

# 해설
1. List 를 배열로 변환한다. (List로 진행하면 시간 초과 발생)
2. 1회전 후 맨 뒤로 갈 0번 인덱스의 요소를 `temp`에 담아둔다.
3. 내부 for문에서 2번째 요소부터 앞으로 옮긴다.
4. 반복이 끝난 후 배열의 마지막 값으로 `temp`를 넣는다.
5. 2번~4번 단계를 `d`만큼 반복한다.