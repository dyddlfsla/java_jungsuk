package chapter.seven;

public class Chapter07_05 {

  /** ◆ 단일 상속(single inheritance)
   *
   * C++에서는 여러 조상 클래스로부터 상속받는 것이 가능한 '다중 상속(multiple inheritance)' 를 허용하지만
   * 자바에서는 단일 상속만을 허용한다. 그래서 둘 이상의 클래스로부터 상속 받을 수 없다. 예를 들어, Tv 클래스와 DVD 클래스가
   * 있을 때, 이 두 클래스로부터 모두 상속 받는 TvDVD 클래스를 만들 수 없다.
   * 따라서 Tv 클래스와 DVD 클래스 둘 중 어느 것을 상속 받을 것인지 선택해야 한다.
   *
   *  class TvDVD extends Tv, DVD {
   *    //에러 발생. 조상은 하나만 선택하여 상속 받을 수 있다.
   *  }
   *
   *  다중 상속을 허용하면 여러 클래스로부터 상속 받을 수 있기 때문에 복합적인 기능을 가진 클래스를 쉽게 작성할 수 있다는 장점이 있지만,
   *  클래스 간의 관계가 매우 복잡해진다는 것과 서로 다른 클래스로부터 상속 받은 멤버 간에 이름이 같은 경우 이를 구별할 수 없다는
   *  단점을 가지고 있다.
   *
   *  자바에서는 다중 상속의 이러한 문제점을 해결하기 위해 다중 상속의 장점을 포기하고 단일 상속만을 허용한다. 단일 상속이
   *  하나의 조상 클래스만을 가질 수 있기 때문에 다중 상속에 비해 불편한 점도 있지만, 클래스 간의 관계가 명확해지고
   *  코드를 더욱 신뢰할 수 있게 만들어 준다는 점에서 다중 상속보다 유리하다.
   * */

}
