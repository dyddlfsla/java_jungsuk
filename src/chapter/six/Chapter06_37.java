package chapter.six;

public class Chapter06_37 {

  /** ◆ 객체 자신을 가리키는 참조변수 - this
   *
   * 아래와 같은 코드가 있다고 하자.
   *
   * Car(String c, String g, int d) {
   *   color = c;
   *   gearType = g;
   *   door = d;
   * }
   *
   * 이때 변수 color 와 c 는 이름이 다르기 때문에 이름만으로 서로 구별될 수 있어 문제가 없다.
   * 그러나 만약 생성자의 매개변수로 선언된 변수의 이름이 c가 아니라 color 라면 어떻게 될까?
   * 인스턴스 변수 color 와 생성자 매개변수 color 는 서로 이름이 똑같아지게 되어 이름만으로 구분이
   * 되지 않을 것이다. 이런 경우에는 인스턴스 변수 앞에 'this' 를 사용하면 된다.
   *
   * 이렇게하면 this.color 는 인스턴스 변수이고 color 는 생성자의 매개변수로 정의된 지역변수로 서로 구별이
   * 가능해지는 것이다. 이처럼 생성자의 매개변수로 인스턴스 변수들의 초기값을 제공받는 경우가 많기 때문에
   * 매개변수와 인스턴스 변수의 이름이 일치하는 경우가 많다. 이때는 위의 코드 color, c 처럼 이름을 다르게 하는것보다
   * this 를 사용해서 구별되도록 하는 것이 더 명확하고 이해하기 쉽다.
   *
   * 'this' 는 참조변수로 인스턴스 자기 자신을 가리킨다. 'this.인스턴스변수'와 같이 this 를 이용해 인스턴스 변수에
   * 접근이 가능한 것이다. 하지만, 'this' 를 사용할 수 있는 것은 오로지 인스턴스 자신뿐이다.
   *
   * 사실, 생성자를 포함한 모든 인스턴스메서드에는 자신이 관련된 인스턴스를 가리키는 참조변수 this 가 지역변수로
   * 숨겨진 채로 존재한다.
   *
   * -----------------------------------------------------------------------------
   *  ※ this : 인스턴스 자기 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있다.
   *           모든 인스턴스메서드에 지역변수로 숨겨져 존재한다.
   *
   *  ※ this() : 같은 클래스의 다른 생성자를 호출할 때 사용한다.
   * -----------------------------------------------------------------------------
   *
   *
   *
   * */


}