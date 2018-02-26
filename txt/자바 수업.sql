[02.19]
제어 플래그 삭제(Remove Control Flag)



[02.05]
어서션 도입(introduce assertion)
- 코드 속에 성립해야 할 조건이 있는 경우, 주석으로 "이런 조건을 만족해야 한다.(성립해야 한다.)"라고 남기지 말고 어서션을 도입하라

제어 플래그 삭제(Remove Control Flag)
- 

assert 표현식;          => 표현식의 결과가 false이면, java.lang.AssertionError 예외 발생
assert 표현식 : 옵션;   => 표현식의 결과가 false이면, java.lang.AssertionError 예외 발생하고 옵션이 실행





[18.02.01]
메소드 추출(Extract Method)
 - 코드를 그룹으로 


TDD 
 -> test코드를 미리 만들어 놓고 필요할때마다 클래스와 메소드를 만드는 것

Extract Method
 -> 메소드 추출 기여

inline

try-with-resource