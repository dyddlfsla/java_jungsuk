package chapter.seven_2nd._21;

public class Chapter07_21 {

  /** ◆ 접근 제어자(access modifier)
   *
   * 접근 제어자는 멤버 또는 클래스에 사용되어, 해당하는 멤버 또는 클래스를 외부에서 접근하지 못하도록 제한하는 역할을 한다.
   * 접근 제어자가 default 임을 알리기 위해 실제로 default 를 붙이지는 않는다. 클래스나 멤버변수, 메서드, 생성자에 접근 제어자가
   * 지정되어 있지 않다면, 접근 제어자가 default 임을 뜻한다.
   *
   * 접근 제어자가 사용될 수 있는 곳 - 클래스, 멤버변수, 메서드, 생성자
   *
   * 1. private: 같은 클래스 내에서만 접근이 가능하다.
   * 2. default: 같은 패키지내에서만 접근이 가능하다.
   * 3. protected: 같은 패키지 또는 자손 클래스에서 접근이 가능하다.
   * 4. public: 접근 제한이 전혀 없다.
   *
   * 접근 범위가 넓은 쪽에서 좁은 쪽으로 나열하면 다음과 같다.
   *
   * public > protected > (default) > private
   *
   *
   * public 은 접근 제한이 전혀 없는 것이고, private 은 같은 클래스 내에서만 사용하도록 제한하는 가장 높은 제한이다.
   * 그리고 default 는 같은 패키지내의 클래스에서만 접근이 가능하도록 하는 것이다.
   *
   * 마지막으로 protected 는 패키지에 관계없이 상속관계에 있는 자손 클래스에서 접근할 수 있도록 하는 것이 제한 목적이지만,
   * 같은 패키지 내에서도 접근이 가능하다. 그래서 protected 가 default 보다 접근 범위가 더 넓다.
   *
   * ※ 다시 말하지만, 접근 제어자 default 는 아무런 접근 제어자를 붙이지 않는 것이다.
   *
   *
다  * */

}