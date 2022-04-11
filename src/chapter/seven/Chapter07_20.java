package chapter.seven;

public class Chapter07_20 {

  /** ◆ abstract - 추상의, 미완성의
   *
   * abstract 는 '미완성' 이라는 의미를 가지고 있다. 메서드의 선언부만 작성하고 실제 수행 내용은 구현하지 않은 추상 메서드를
   * 선언하는데 사용된다.
   * 그리고 클래스에도 사용되어 클래스 안에 추상 메서드가 존재한다는 사실을 미리 알려 줄 수 있다.
   *
   *  abstract → 클래스 : 클래스 안에 추상 메서드가 선언되어 있음을 알려준다.
   *             메서드 : 선언부만 작성하고 구현부는 작성되지 않은 추상 메서드임을 나타낸다.
   *
   * */

}

abstract class AbstractTest { //추상 클래스(추상 메서드를 가지고 있는 클래스)

  abstract void move(); //추상 메서드(구현부가 만들어지지 않았음)
}