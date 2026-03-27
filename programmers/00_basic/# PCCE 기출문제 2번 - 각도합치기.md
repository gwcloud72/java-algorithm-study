# PCCE 기출문제 2번 - 각도 합치기

## 문제 설명
두 각도 `angle1`, `angle2`가 주어질 때,
두 각도의 합을 **0 이상 360 미만**의 값으로 출력하는 문제입니다.

각도는 한 바퀴가 360도이기 때문에,
360도를 넘어가면 다시 처음부터 돈 것과 같은 의미가 됩니다.

예를 들어,
- 30도와 390도는 같은 각도입니다.
- 280 + 485 = 765
- 765에서 720(= 360 × 2)을 빼면 45가 됩니다.

즉, 최종 결과는 **45**입니다.

---

## 풀이 아이디어
이 문제의 핵심은 **나머지 연산 `% 360`** 입니다.

두 각도를 더한 뒤,
360으로 나눈 나머지를 구하면
항상 0 이상 360 미만의 값으로 만들 수 있습니다.

공식은 아래와 같습니다.

```java
(angle1 + angle2) % 360
```

---

## 코드
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = (angle1 + angle2) % 360;
        System.out.println(sum_angle);
    }
}
```

---

## 코드 설명
### 1. 입력 받기
```java
int angle1 = sc.nextInt();
int angle2 = sc.nextInt();
```
두 개의 정수를 입력받습니다.

### 2. 각도 합 구하기
```java
int sum_angle = (angle1 + angle2) % 360;
```
두 각도를 더한 뒤 360으로 나눈 나머지를 구합니다.

### 3. 결과 출력
```java
System.out.println(sum_angle);
```
최종 각도를 출력합니다.

---

## 예시
입력
```text
280
485
```

계산
```text
280 + 485 = 765
765 % 360 = 45
```

출력
```text
45
```

---

## 한 줄 정리
이 문제는 **두 각도의 합을 구한 뒤 `% 360`을 적용하는 문제**입니다.
한 바퀴를 넘는 각도는 다시 처음 위치로 돌아오기 때문에
나머지 연산으로 간단하게 해결할 수 있습니다.
