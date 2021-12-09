package chapter.six;

public class Chapter06_11 {

  /** ◆ 선언 위치에 따른 변수의 종류
   *
   * 변수는 크게 클래스 변수, 인스턴스 변수, 지역변수 모두 세 종류가 있다. 변수의 종류를 결정짓는 중요한 요소는
   * '변수의 선언 위치' 이므로 변수의 종류를 파악하기 위해서는 변수가 어느 영역에 선언되었는지를 아는 것이 중요하다.
   * 멤버변수를 제외한 나머지 변수들은 모두 지역변수이며, 멤버변수 중 static 이 붙은 것은 클래스 변수, 붙지 않은 것은
   * 인스턴스 변수이다.
   *
   * class Variable{
   *   int iv;            //인스턴스 변수
   *   static int cv;     //
   *
   *   void method() {
   *     int lv = 0;
   *   }
   *
   * }
   *
   * ==============================================================================
   * |        변수의 종류                 |      선언 위치       |         생성 시기      |
   * ==============================================================================
   *  1. 클래스 변수(class variable)      |    클래스 영역       | 클래스가 메모리에 올라갈 때 |
   * -------------------------------------------------------------------------------
   *  2. 인스턴스 변수(instance variable) |    클래스 영역        | 인스턴스가 생성되었을 때   |
   * -------------------------------------------------------------------------------
   *  3. 지역 변수(local variable)       |   클래스 외 다른 영역   | 변수를 포함하고 있는 문장이 |
   *                                   | (메서드, 생성자 등등)   | 실행될 때              |
   * -------------------------------------------------------------------------------
   *
   * 1. 인스턴스 변수 : 클래스 영역에서 선언되며, 인스턴스를 생성할 때 만들어진다. 그래서 인스턴스 변수의 값을
   *    읽어오거나 저장하려면 먼저 인스턴스를 생성해야 한다. 인스턴스마다 별도의 저장공간을 가지므로 서로 다른 값을
   *    가질 수 있다. 인스턴스마다 고유한 상태를 유지해야하는 속성의 경우, 인스턴스 변수로 선언한다.
   *
   * 2. 클래스 변수 : 클래스 변수를 선언하는 방법은 인스턴스 변수 앞에 static 을 붙이기만 하면 된다. 인스턴스마다
   *    독립적인 저장공간을 갖는 인스턴스 변수와는 달리 클래스 변수는 모든 인스턴스가 공통된 저장공간(변수)를 공유하게 된다.
   *    한 클래스의 모든 인스턴스들이 공통된 값을 유지해야하는 속성의 경우, 클래스 변수로 선언해야 한다.
   *    클래스 변수는 인스턴스 변수와 달리 인스턴스를 생성하지 않고도 언제라도 바로 사용할 수 있다는 특징이 있으며,
   *    '클래스이름.클래수변수' 와 같은 방식으로 사용한다.
   *
   * 3. 지역 변수 : 메서드 내에 선언되어 메서드 내에서만 사용 가능하며, 메서드가 종료되면 같이 소멸되어 더 이상 사용할 수 없다.
   *    for 문 또는 while 문의 블럭 내에 선언된 지역변수는, 지역변수가 선언된 블럭{} 내에서만 가능하며, 블럭{}을 벗어나면
   *    마찬가지로 소멸되어 사용할 수 없게된다. 사실 우리가 6장 이전에 예제나 문제들을 통해 선언했던 변수들은 모두 지역변수이다.
   *
   *
   *
   * */

}
