# Balanced Brackets
[HackerRank : Balanced Brackets 바로가기](https://www.hackerrank.com/challenges/balanced-brackets/problem?h_r=profile)

둘러싸는 괄호 쌍이 균형을 이뤄야합니다. 주어진 괄호 문자열의 각 순서가 균형을 이루는지 여부를 결정합니다. 문자열이 균형을 이루면 YES를, 그렇지 않으면 NO를 반환합니다.

<br>

# 예시
s = "{ [ ( ) ] }" // return "YES"  
s = "{ [ ( ] ) }" // return "NO"

<br>

# 코드
```
public static String isBalanced(String s) {
    Stack<Character> openBrackets = new Stack<>();

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        
        // 열린 괄호 -> 스택 삽입
        if (c == '{' || c == '[' || c == '(') {
            openBrackets.push(c);
        } else {
            if (openBrackets.isEmpty()) { // 비교 할 열린 괄호가 없음 = 실패
                return "NO";
            }
            
            char bracket = openBrackets.pop();

            // 닫힌 괄호 -> 괄호 짝 비교
            if (bracket == '{' && c != '}') {
                return "NO";
            } else if (bracket == '[' && c != ']') {
                return "NO";
            } else if (bracket == '(' && c != ')') {
                return "NO";
            }
        }
    }
    
    // 반복 종료 후 스택이 비어있음 = 성공
    if (openBrackets.isEmpty()) {
        return "YES";
    }
    return "NO";
}
```

<br>

# 해설
문자열의 크기 만큼 반복을 돌면서, 열린 괄호는 스택에 넣고, 닫힌 괄호가 나오면 스택에 있는 열린 괄호와 쌍을 이루는 지 확인합니다.

- 실패하는 경우
    1. 괄호의 쌍이 안 맞을 때
    2. 닫힌 괄호가 나왔으나 비교 할 열린 괄호가 없을 때 → 예외 처리
    3. 반복이 종료되었으나 스택이 비어있지 않을 때 → 예외 처리
    >예외 처리(스택 상태)를 해주지 않아 RuntimeException이 발생했었다.      