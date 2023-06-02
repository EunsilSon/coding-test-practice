# Merge two sorted linked lists
[HackerRank : Merge two sorted linked lists 바로가기](https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem?isFullScreen=true)

정렬된 2개의 연결리스트들을 1개의 정렬된 연결리스트로 병합합니다.

<br>

# 예시
headA : 1 → 3 → 7 → NULL  
headB : 1 → 2 → NULL  
새로운 리스트 1 → 1 → 2 → 3 → 7 → NULL

<br>

# 코드
```
static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
    SinglyLinkedListNode mergeHead = new SinglyLinkedListNode(Integer.MIN_VALUE);
    SinglyLinkedListNode mergeNode = mergeHead;
    
    while (head1 != null && head2 != null) {
        if (head1.data < head2.data) {
            mergeNode.next = head1;
            head1 = head1.next;
        } else {
            mergeNode.next = head2;
            head2 = head2.next;
        } 
        mergeNode = mergeNode.next;
    }
    mergeNode.next = (head1 != null) ? head1 : head2;
    
    return mergeHead.next;
}
```

<br>

# 해설
반복문을 사용해 두 리스트의 값을 비교하며 새 리스트에 노드 추가
1. 더미 노드 `mergeHead` 를 생성해 시작 포인터를 저장한다.
2. 노드를 붙일 `mergeNode` 포인터를 생성해 head1, head2의 값을 비교하고 값이 더 작은 노드의 포인터를 하나씩 움직여 `mergeNode`에 붙인다.
3. 반복문 종료 후 남은 노드를 붙인다.