package chapter.six_2nd._26;

public class Chapter06_26 {

  /** ◆ static 메서드와 인스턴스 메서드
   *
   * 변수애서 그랬던 것과 같이, 메서드 앞에 static 이 붙어 있으면 클래스 메서드, 그렇지 않으면 인스턴스 메서드라고 한다.
   * 클래스 메서드도 클래스 변수처럼, 객체를 생성하지 않고도 '클래스이름.메서드이름(매개변수)' 와 같은 식으로 호출이 가능하다.
   * 반면에 인스턴스 메서드는 반드시 객체를 생성해야만 호출할 수 있다.
   *
   * 그렇다면 클래스를 정의할 때, 어느 경우에 static 를 사용해서 클래스 메서드로 정의해야하는 것일까?
   * 클래스는 '데이터(변수)와 데이터를 다루는 메서드의 집합' 이므로, 같은 클래스 내에 있는 메서드와 멤버변수는 아주 밀접한 관계가 있다.
   * 인스턴스 메서드는 인스턴스 변수를 다루는 작업을 하는, 즉 메서드의 작업을 수행하는데 인스턴스 변수를 필요료 하는 메서드이다.
   * 그런데 인스턴스 변수는 인스턴스(객체)를 생성해야만 만들어지므로 인스턴스 메서드 역시 인스턴스를 생성해야만 호출할 수 있는 것이다.
   *
   * 반면에 메서드 중에서 인스턴스와 관계없는(인스턴스 변수나 인스턴스 메서드를 사용하지 않는) 메서드를 클래스 메서드(static 메서드)로 정의한다.
   * 물론 인스턴스 변수를 사용하지 않는다고 해서 반드시 클래스 메서드로 정의해야 하는 것은 아니지만 특별한 이유가 없는 한 그렇게 하는 것이 일반적이다.
   *
   * ※ 클래스 영역에 선언된 변수를 멤버변수라 한다. 멤버변수 중에 static 이 붙은 것은 클래스 변수 (static 변수), static 이 붙지 않은 것은
   *   인스턴스 변수라 한다. 멤버변수는 인스턴스 변수와 static 변수를 모두 통칭하는 말이다.
   *
   *
   *
   * */

}
