package chapter.three;

public class Chapter03_18 {

  /** ◆ 대입 연산자 =
   *
   * 대입 연산자는 변수와 같은 공간에 값 또는 수식의 연산결과를 저장하는데 사용된다.
   * 이 연산자는 오른쪽 피연산자의 값을 왼쪽의 피연산자에 저장한다.
   *
   * 대입 연산자는 연산자 중에 가장 낮은 우선순위를 가지고 있기 때문에 식에서 가장 나중에 수행된다.
   *
   * 1. lvalue 와 rvalue
   * 대입 연산자의 왼쪽 피연산자를 'lvalue(left value)'라 하고, 오른쪽 피연산자를 'rvalue(right value)'라고 한다.
   * 대입 연산자의 rvalue는 변수 뿐만 아니라 식이나 상수 등이 모두 가능하지만, lvalue는 반드시 변수처럼 값을 변경할 수 있는 것이어야 한다.
   * 그래서 리터럴이나 상수 등과 같이 값을 저장할 수 없는 것들은 lvalue가 될 수 없다.
   *
   *
   * 2. 복합 대입 연산자
   * 대입 연산자는 다른 연산자(op)와 결합하여 'op='와 같은 방식으로 사용될 수 있다. 예를 들어, i = i + 3; 은 i += 3;과 같이 표현될 수 있다.
   *
   * ----------------------------
   *     op=            =
   *  i += 3;   →    i = i + 3;
   *  i -= 3;   →    i = i - 3;
   *  i *= 3;   →    i = i * 3;
   *  i /= 3;   →    i = i / 3;
   *  i %= 3;   →    i = i % 3;
   *
   *  ※ 주의: i *= 10 + j; 처럼 우변이 둘 이상의 항으로 이루어져 있는 경우 착각하지 않도록 하자.
   *        i = i * 10 + j; 가 아니라  i = i * (10 + j);이다.
   *
   *  복합 연산자 사용이 익숙해지도록 하나씩 바꿔보는 연습이 필요하다.
   *
   *
   * */

}
