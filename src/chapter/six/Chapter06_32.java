package chapter.six;

public class Chapter06_32 {

  /** ◆ 생성자(constructor)
   *
   * 생성자는 인스턴스가 생성될 때 호출되는 '인스턴스 초기화 메서드'이다. 따라서 인스턴스 변수의 초기화
   * 에 주로 사용되며, 그외에도 인스턴스 생성 시 실행되어야 할 작업에도 사용된다.
   *
   * 생성자 역시 메서드처럼 클래스 내에 선언되며, 구조도 메서드와 유사하지만 리턴값이 없다는 점이 다르다.
   * 그렇다고 해서 생성자 앞에 리턴값이 없음을 뜻하는 void 를 사용하지는 않고, 그저 아무것도 적지 않는다.
   * 생성자의 조건은 다음과 같다.
   *
   *  ① 생성자의 이름은 클래스의 이름과 일치해야 한다.
   *  ② 생성자는 리턴값이 없다.
   *
   * ※ 생성자도 메서드이기 때문에 리턴값이 없다는 의미의 void 를 붙여야 하지만, 모든 생성자가 리턴값이 없으므로
   * 그냥 void 를 생략할 수 있게 만들어 버렸다.
   *
   * 생성자는 다음과 같이 정의한다. 생성자도 오버로딩이 가능하므로 하나의 클래스에 여러 개의 생성자가 존재할 수 있다.
   *
   *  클래스이름(타입 변수명, 타입 변수명, ...) {
   *    //인스턴스 생성 시 수행 될 코드,
   *    //주로 수행하는 작업이 인스턴스 변수 초기화 작업일뿐 이외에 생성 시 해야할 다른 코드가 있다면
   *    //얼마든지 작성할 수 있다.
   *  }
   *
   *  ex)
   *  class Point{
   *
   *    Point() {
   *      //기본 생성자
   *    }
   *
   *    Point(int x) {
   *      ...
   *      //매개변수가 있는 생성자
   *    }
   *
   *  }
   *
   *  반드시 알아두어야 하는 것은, 연산자 new 가 인스턴스를 생성하는 것이지 생성자가 인스턴스를 생성하는 것이 아니라는
   *  것이다. 생성자라는 용어 때문에 오해하기 쉬운데, 생성자는 단순히 인스턴스 변수들의 초기화에 사용되는 조금 특별한
   *  메서드일 뿐이다. 생성자가 갖는 몇 가지 특징 외에는 메서드와 다르지 않다는 것이다.
   *
   * */

}
