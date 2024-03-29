package chapter.fourteen._02;

public class Chapter14_02 {

  /*
  * ◆ 람다식 작성하기
  *
  * 메서드를 람다식으로 만드는 방법은 아주 간단하다.
  *
  * 1. 메서드에서 이름과 반환타입을 제거하고 매개변수 선언부와 구현부 몸통{} 사이에 '->' 기호를 추가하면 된다.
  *
  *  int max(int a, int b) {
  *     return a > b ? a : b;
  *  }
  *
  *             ↓
  *
  * (int a, int b) -> { return a > b ? a : b;}
  *
  * 반환값이 있는 메서드의 경우, return 문 대신 '식(Expression)' 으로 대신 할 수 있다.
  * 식의 연산결과가 자동으로 반환값이 된다. 이 때는 문장(statement) 가 아니라 '식' 이므로 끝에 ; 를 붙이지 않는다.
  *
  * (int a, int b) -> { a > b ? a : b }
  *
  * 람다식에 선언된 매개변수의 타입은 추론이 가능한 경우에 생략할 수 있는데, 거의 대부분의 경우에서 생략 가능하다.
  * 람다식에 반환타입이 없는 것 역시 항상 추론이 가능하기 때문이다.
  *
  * ( a, b) -> { a > b ? a : b }
  *
  * 아래과 같이 선언된 매개변수가 하나뿐인 경우에는 괄호() 를 생략할 수 있다. 단, 매개변수의 타입이 있으면 괄호() 를 생략할 수 없다.
  * 만약 매개변수가 존재하지 않는다면 괄호()는 생략할 수 없고, 빈 괄호를 써주어야 한다.
  *
  * (a) -> a * a
  *
  *     ↓
  *
  * a  -> a * a // OK.
  *
  * 마찬가지로 구현부 괄호{} 안에 문장이 하나만 존재하는 경우 괄호{} 를 생략할 수 있다. 이 때, 문장의 끝에 ; 를 붙이지 않아야 한다는 것에 주의하자.
  *
  * (String name, int i) -> System.out.println( name + " = " + i)
  *
  * 그러나 구현부 괄호{} 안의 문장이 return 문인 경우 생략할 수 없다.
  *
  * (int a , int b) -> return a > b ? a : b   // 에러.
  *
  *
  *
  *
  *
  *
  * */

}
