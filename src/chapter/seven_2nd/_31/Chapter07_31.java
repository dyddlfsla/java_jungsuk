package chapter.seven_2nd._31;

public class Chapter07_31 {

  /** ◆ 추상 클래스(abstract class)
   *
   * 클래스를 설계도에 비유한다면, 추상 클래스는 미완성 설계도에 비유할 수 있다. 미완성 설계도란, 단어의 뜻 그대로 완성되지 못한 채로 남겨진 설계도를 말한다.
   * 클래스가 미완성이라는 것은 멤버의 개수에 관계된 것이 아니라, 단지 미완성 메서드(추상 메서드)를 포함하고 있다는 의미이다.
   *
   * 미완성 설계도로 완성된 제품을 만들 수 없듯이 추상 클래스로 인스턴스는 생성할 수 없다.
   * 추상 클래스는 상속을 통해서 자손 클래스에 의해서만 완성될 수 있다.
   *
   * ================================================================
   * 추상 클래스 : 미완성 설계도. → 인스턴스 생성 불가
   *            클래스 멤버 중 미완성 메서드(추상 메서드)를 포함하고 있는 클래스
   * ================================================================
   *
   * 추상 클래스 자체로는 클래스로서의 역할을 다 못하지만, 새로운 클래스를 작성하는데 있어서 바탕이 되는 조상 클래스로서 중요한 의미를 갖는다.
   * 새로운 클래스를 작성할 때 아무것도 없는 상태에서 시작하는 것 보다는 완전하지는 못하더라도 어느 정도 틀을 갖춘 상태에서 시작하는 것이 나을 것이다.
   *
   * 실생활에서 예를 들자면, 같은 크기의 TV 라도 기능의 차이에 따라 여러 종류의 모델이 있지만, 사실 이 들의 설계도는 아마 90% 정도는 동일할 것이다.
   * 서로 다른 세 개의 설계도를 따로따로 그리는 것 보다는 이들의 공통 부분만을 그린 미완성 설계도를 만들어 놓고, 이 미완성 설계도를 이용해서
   * 각각의 설계도를 완성하는 것이 훨씬 효율적일 것이다.
   *
   * 추상 클래스는 키워드 'abstract' 를 붙이기만 하면 된다. 이렇게 함으로써 이 클래스를 사용할 때, 클래스의 선언부의 abstract 를 보고서
   * 이 클래스에는 추상 메서드가 있으니 상속을 통해서 구현해주어야 한다는 것을 쉽게 알 수 있을 것이다.
   *
   * abstract class [클래스이름] {
   *   ...
   * }
   *
   * 추상 클래스는 추상 메서드를 포함하고 있다는 것을 제외하고는 일반 클래스와 전혀 다르지 않다. 추상 클래스에도 생성자가 있으며,
   * 멤버변수와 메서드도 가질 수 있다.
   *
   *
   * */

}