package chapter.seven;

public class Chapter07_01 {

  /** ◆ 상속
   *
   * 상속이란, 기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것이다. 상속을 통해서 클래스를 작성하면 보다 적은 양의
   * 코드로 새로운 클래스를 작성할 수 있고 코드를 공통적으로 관리할 수 있기 때문에 코드의 추가 및 변경이 매우 용이하다.
   *
   * 자바에서 상속을 구현하는 방법은 간단하다. 새로 작성하고자 하는 클래스의 이름 뒤에 상속받고자 하는 클래스의 이름을
   * 키워드 'extends' 와 함께 써주기만 하면 된다. 예를 들어 새로 작성하고자 하는 클래스가 Child 이고 상속받고자 하는
   * 기존 클래스가 Parent 라면 다음과 같이 할 수 있다.
   *
   *  class Parent {
   *
   *  }
   *
   *  class Child extends Parent {
   *    //...
   *  }
   *
   * 이 두 클래스는 상속 관계에 있다고 하며, 상속해주는 클래스는 '조상 클래스' 라고 하고 상속 받는 클래스는 '자손 클래스' 라고 한다.
   *
   *   --------
   *  | Parent|
   *  --------
   *     ↑
   *  --------
   * | Child |
   * --------
   *
   * 이처럼 클래스 간의 상속 관계를 그림으로 표현한 것을 상속계층도(class hierarchy)라고 한다. 프로그램이 커질수록 클래스 간의
   * 관계가 복잡해지는데, 이 때 그림으로 표현하면 클래스 간의 관계를 보다 쉽게 이해할 수 있다.
   *
   * 자손 클래스는 조상 클래스의 모든 멤버를 상속받기 때문에 Child 클래스는 Parent 클래스의 멤버들을 포함한다고 할 수 있다.
   * 만일 Parent 클래스에 age 라는 정수형 변수를 멤버변수로 추가하면, 자손 클래스는 조상 클래스의 멤버를 모두 상속받기 때문에
   * , Child 클래스는 자동적으로 age 라는 멤버변수가 추가된 것과 같은 효과를 얻는다.
   *
   * 그렇다면 반대로 자손인 Child 클래스에 새로운 멤버로 play() 메서드를 추가해보자.
   *
   *  class Child extends Parent{
   *    void play() {
   *      System.out.println("play");
   *    }
   *  }
   *
   * Child 클래스에 새로운 코드가 추가되어도 조상인 Parent 클래스는 아무런 영향도 받지 않는다. 여기서 알 수 있는 것처럼
   * 조상 클래스가 변경되면 자손 클래스는 자동적으로 영향을 받게 되지만, 자손 클래스가 변경되는 것은 조상 클래스에 아무런 영향을 주지 못한다.
   * 자손 클래스는 조상 클래스의 모든 멤버를 상속 받으므로 항상 조상 클래스보다 같거나 많은 멤버를 갖는다. 즉. 상속에 상속을 거듭할수록
   * 상속 받는 클래스의 멤버 개수는 점점 늘어나게 된다. 그래서 상속을 받는다는 것은 조상 클래스를 확장(Extends) 한다는 의미로 해석할 수 있으며
   * 이것이 상속에 사용되는 키워드가 'extends' 인 이유이기도 하다.
   *
   *  - 자손 클래스는 조상 클래스의 모든 멤버를 상속받는다.
   *    (단, 생성자와 초기화 블럭은 상속되지 않는다.)
   *  - 자손 클래스의 멤버 개수는 조상 클래스보다 항상 같거나 더 많다.
   *
   *
   *
   * */

}
