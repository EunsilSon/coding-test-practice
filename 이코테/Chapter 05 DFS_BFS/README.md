# Chapter 05 DFS/BFS
- 그래프 탐색 알고리즘
- 재귀 함수 사용
    - 예제 1) 팩토리얼

    ```java
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
    ```
        
    - 예제 2) 유클리드 호제법 (최대공약수 계산)
        
    ```java
    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }
    ```
        

## DFS (Depth-First Search) 깊이 우선 탐색

- 스택 자료구조 또는 재귀 함수를 이용
  1. 탐색 시작 노드를 방문 처리한다.
    2. 최상단 노드에 미방문 노드가 한 개라도 있으면 해당 미방문 노드에 대해 방문 처리한다.
    3. (2)번 과정을 수행할 수 없을 때까지 반복한다.
    
    <br>

    ```java
    public static void dfs(int[][] graph, boolean[] visited, int n) {
        visited[n] = true;
        System.out.print(n + " ");

        for (int i = 0; i < graph[n].length; i++) {
            if (!visited[graph[n][i]]) {
                dfs(graph, visited, graph[n][i]);
            }
        }
    }
    ```

## BFS (Breadth-First Search) 너비 우선 탐색

- 큐 자료구조 이용
    1. 탐색 시작 노드를 큐에 삽입 후 방문 처리한다.
    2. 큐에서 노드를 꺼내 해당 노드의 인접 노드 중 미방문 노드를 모두 큐에 삽입 후 방문 처리한다.
    3. (2)번 과정을 수행할 수 없을 때까지 반복한다.
    
    <br>

    ```java
    public static void bfs(int[][] graph, boolean[] visited, int n) {
            Queue<Integer> q = new LinkedList<>();
            q.offer(n);
            visited[n] = true;
    
            while (!q.isEmpty()) {
                int node = q.poll();
                System.out.printf(node + " ");
    
                for (int i = 0; i < graph[node].length; i++) {
                    if (!visited[graph[node][i]]) {
                        q.offer(graph[node][i]);
                        visited[graph[node][i]] = true;
                    }
                }
            }
        }
    ```