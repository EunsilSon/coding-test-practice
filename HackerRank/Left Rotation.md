# Left Rotation
[HackerRank : Left Rotation 바로가기](https://www.hackerrank.com/challenges/array-left-rotation/problem?isFullScreen=true)

배열의 요소를 왼쪽으로 이동시킵니다. 주어지는 정수 d만큼 회전합니다.

<br>

# 예시
d = 2, arr = [1,2,3,4,5] 일 때,  
2번 회전 후, arr = [3,4,5,1,2]를 반환합니다.

<br>

# 코드
```java
public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        LinkedList<Integer> list = new LinkedList(arr); 
        
        for (int i = 0; i < d; i++) {
            list.add(list.poll());
        }
        
        return list;
    }
```

<br>

# 해설
1. `LinkedList`에 `arr`을 넣는다. (첫번째 값과 마지막 값을 사용하기 위함)
2. `list`의 첫번째 값을 삭제하면서 반환되는 값을 `list`의 마지막에 다시 넣는다.
3. (2)번을 `d`만큼 반복한다.

<br>

# 시행착오
`O(n^2)`으로 해결했던 코드를 `O(n)`으로 줄이는 과정을 블로그에 기록했다.  
[HackerRank : Left Rotation (feat. 시간복잡도)](https://velog.io/@eunsilson/HackerRank-Left-Rotation-feat.-%EC%8B%9C%EA%B0%84%EB%B3%B5%EC%9E%A1%EB%8F%84)