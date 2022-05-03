package chapter.six_2nd._32;

public class Chapter06_32 {

  /** ◆ 생성자(Constructor)
   *
   * 생성자는 인스턴스가 생성될 때 호출되는 '인스턴스 초기화 메서드' 이다. 따라서 인스턴스 변수의 초기화 작업에 주로 사용되며,
   * 인스턴스 생성 시에 같이 실행되어야 하는 작업을 위해서도 사용된다.
   *
   * 생성자 역시 메서드처럼 클래스내에 선언되며, 구조도 메서드와 유사하지만 리턴값이 없다는점이 다르다. 그렇다고 해서 생성자 앞에 리턴 값이 없음을
   * 뜻하는 키워드 void 를 사용하지는 않고, 단지 아무것도 적지 않는다. 생성자의 조건은 다음과 같다.
   *
   * ========================================
   * 1. 생성자의 이름은 클래스의 이름과 같아야 한다.
   * 2. 생성자는 리턴 값이 없다.
   * ========================================
   * ※ 생성자도 메서드이기 때문에 원래대로라면 리턴값이 없다는 의미의 void 키워드를 붙여야 하지만, 모든 생성자는 리턴값이 없으므로
   * void 를 생략할 수 있게 한 것이다.
   *
   * 생성자는 다음과 같이 정의한다. 생성자도 오버로딩이 가능하므로 하나의 클래스에 여러 개의 생성자가 존재할 수 있다.
   *
   * [클래스이름](타입 변수명, 타입 변수명, ...) {
   *   //인스턴스 생성 시 수행될 코드,
   *   //주로 인스턴스 변수의 초기화 코드를 적는다.
   * }
   *
   * class Point {
   *
   *   Point() { //매개변수가 없는 생성자
   *     ...
   *   }
   *
   *   Point(int x, int y) { //매개변수가 있는 생성자
   *     ...
   *   }
   * }
   *
   * 연산자 new 가 인스턴스를 생성하는 것이지 생성자가 인스턴스를 생성하는 것이 아니다. 생성자라는 용어 때문에 오해하기 쉬운데, 생성자는
   * 단순히 인스턴스 변수의 초기화에 사용되는 조금 특별한 메서드일 뿐이다. 생성자가 갖는 몇 가지 특징만 제외하면 메서드와 다르지 않다.
   * */

}