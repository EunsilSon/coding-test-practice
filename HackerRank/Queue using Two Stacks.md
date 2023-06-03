# Queue using Two Stacks
[HackerRank : Queue using Two Stacks 바로가기](https://www.hackerrank.com/challenges/queue-using-two-stacks/problem?isFullScreen=false)

2개의 스택을 사용하여 큐를 만듭니다.
아래의 옵션을 따릅니다.
- 1: 큐의 끝에 새로운 요소 삽입
- 2: 큐의 가장 앞에 있는 요소 삭제
- 3: 큐의 가장 앞에 있는 요소 출력


<br>

# 코드
- Stack 클래스 사용
```
import java.io.*;
import java.util.*;

class Queue {
        Stack<Integer> inputStack;
        Stack<Integer> outputStack;
        
        public Queue () {
            inputStack = new Stack<>();
            outputStack = new Stack<>();
        }
        
        public void enqueue(int val) {
            inputStack.push(val);
        }
        
        public int dequeue() {
            shiftStack();
            return outputStack.pop();
        }
        
        public int getHeadValue() {
            shiftStack();
            return outputStack.peek();
        }
        
        public void shiftStack() {
            if (outputStack.isEmpty()) {
                while (!inputStack.isEmpty()) {
                    outputStack.push(inputStack.pop());
                }
            }
        }
    
}
```

<br>

- 연결리스트로 스택 구현
```
class Node {
    int val;
    Node next;
    
    Node(int val) {
        this.val = val;
        this.next = null;
    }
    
    public int getVal() {
        return val;
    }
    
    public Node getNextNode() {
        return next;
    }
}
    
class Stack {
    Node top;
    
    public Stack() {
        this.top = null;
    }
    
    public void push(int val) {
        Node node = new Node(val);
        
        if (top == null) {
            top = node;
        } else {
            Node temp = top;
            node.next = temp;
            top = node;
        }
    }
    
    public int pop() {
        int val = top.getVal();
        top = top.getNextNode();
        
        return val;
    }
    
    public int peek() {
        return top.getVal();
    }
    
    public boolean isEmpty() {
        return top == null;
    }
    
}
```
```
public class Solution {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            switch(sc.nextInt()) {
                case 1:
                queue.enqueue(sc.nextInt());
                break;
                case 2:
                queue.dequeue();
                break;
                case 3:
                System.out.println(queue.getHeadValue());
                break;
            }
        }
    }
}
```

<br>

# 해설
- `shiftStack()` 메서드: `inputStack`에 있는 데이터를 `outputStack` 으로 모두 이동시킴

1. Enqueue: `inputStack`에 데이터를 넣습니다.
2. Dequeue: `shiftStack()`를 호출한 후 `outputStack`에서 `pop()`을 합니다.
3. getHeadValue: `shiftStack()`를 호출한 후 `outputStack`에서 `peek()`을 합니다.