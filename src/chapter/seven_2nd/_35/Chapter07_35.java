package chapter.seven_2nd._35;

public class Chapter07_35 {

  /** ◆ 인터페이스(Interface)
   *
   * 인터페이스는 일종의 추상 클래스이다. 인터페이스는 추상 클래스처럼 추상 메서드를 갖지만 추상 클래스보다 추상화 정도가 높아서 추상 클래스와는 달리 몸통을 갖춘 일반 메서드 또는 멤버변수를 구성원으로 가질 수 없다.
   * 오직 추상 메서드와 상수만을 멤버로 가질 수 있으며, 그 외의 다른 어떠한 요소도 허용하지 않는다.
   *
   * 추상 클래스를 부분적으로만 완성된 '미완성 설계도' 라고 한다면, 인터페이스는 구현된 것은 아무것도 없고 밑그림만 그려져 있는 '기본 설계도' 라고 할 수 있다.
   * 인터페이스도 추상 클래스처럼 완성되지 않은 불완전한 것이기 때문에 그 자체만으로 사용되기 보다는 다른 클래스를 작성하는데 도움울 줄 목적으로 작성된다.
   *
   * 인터페이스를 작성하는 것은 클래스를 작성하는 것과 같다. 다만, 키워드로 class 대신 interface 를 사용한다는 것만 다르다. 그리고 interface 에도 클래스처럼 접근제어자로
   * public 또는 default 만 사용할 수 있다.
   *
   * interface [인터페이스 이름] {
   *   public static final [타입] [상수명] = 값;
   *   public abstract [메서드이름]([매개변수 타입], [매개변수 이름]);
   * }
   *
   * 일반적인 클래스와 달리 인터페이스의 멤버들은 다음과 같은 제약사항이 있다.
   *
   * - 모든 멤버변수는 public static final 이어야 한다.(상수) / 제어자 생략 가능. 컴파일러가 추후 public static final 붙여줌
   * - 모든 메서드는 public abstract 이어야 한다.(추상 메서드) / 제어자 생략 가능. 컴파일러가 추후 public abstract 붙여줌
   * (단, static 메서드와 default 메서드는 예외 JDK 1.8 부터)
   *
   * 인터페이스에 정의된 모든 멤버에 에외없이 적용되는 사항이기 때문에 제어자를 생략할 수 있는 것이며, 편의상 생략하는 경우가 많다.
   *
   * interface PlayingCard {
   *   public static final int SPADE = 4;
   *   final int DIAMOND = 3; // public static 생략함. 컴파일러가 자동 생성
   *   static int HEART = 2; // public final 생략. 컴파일러가 자동 생성
   *   int CLOVER = 1; // public static final 생략. 컴파일러가 자동 생성
   *
   *   public abstract String getCardNumber();
   *   String getCardKind(); // public abstract 생략. 컴파일러가 자동 생성
   * }
   *
   *
   * */

}
