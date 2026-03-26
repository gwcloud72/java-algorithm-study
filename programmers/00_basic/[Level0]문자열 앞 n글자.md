# 문자열의 앞의 n글자

## 📖 문제 설명
문자열 `my_string`과 정수 `n`이 주어질 때,  
문자열의 **앞에서부터 n개의 문자**를 잘라 반환하는 문제입니다.

---

## ✅ 제한사항
- `1 ≤ my_string.length ≤ 1000`
- `1 ≤ n ≤ my_string.length`
- 문자열은 숫자와 알파벳으로 구성

---

## 🧠 접근 방식 (핵심 아이디어)

이 문제의 핵심은 다음입니다.

- 문자열은 인덱스로 접근할 수 있다.
- 앞에서 `n`글자만 필요하므로 `0`부터 `n-1`까지 확인하면 된다.

직접 구현할 때는 아래처럼 문자 하나씩 꺼낼 수 있습니다.

```java
my_string.charAt(i)
```

---

## 🔄 풀이 흐름

1. 결과 문자열 `answer`를 만든다.
2. `0`부터 `n-1`까지 반복한다.
3. 각 위치의 문자를 `answer`에 붙인다.
4. 완성된 문자열을 반환한다.

---

## 💡 예시 1

### 입력
```text
my_string = "ProgrammerS123"
n = 11
```

### 처리
```text
P r o g r a m m e r S
```

### 결과
```text
ProgrammerS
```

---

## 💡 예시 2

### 입력
```text
my_string = "He110W0r1d"
n = 5
```

### 처리
```text
H e 1 1 0
```

### 결과
```text
He110
```

---

## ✅ 코드

```java
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}
```

---

## ⚡ 시간 복잡도
- `O(n)`

---

## 🚀 더 간단한 방법

이 문제는 `substring()`으로도 쉽게 해결할 수 있습니다.

```java
return my_string.substring(0, n);
```

### 개선 코드
```java
class Solution {
    public String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }
}
```

---

## 📌 정리

- `charAt(i)` : i번째 문자 꺼내기
- `substring(0, n)` : 앞에서 n글자 자르기
- 코딩테스트에서는 **직접 구현 방식**과 **라이브러리 활용 방식** 둘 다 알아두면 좋다.