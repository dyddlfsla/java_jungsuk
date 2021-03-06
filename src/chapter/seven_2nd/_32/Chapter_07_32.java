package chapter.seven_2nd._32;

public class Chapter_07_32 {

  /** ◆ 추상 메서드(abstract method)
   *
   * 메서드는 선언부와 구현부(몸통)로 구성되어 있다고 했다. 선언부만 작성하고 구현부는 작성하지 않은 채로 남겨 둔 것이 추상메서드이다.
   * 즉, 설계만 해놓고 실제 수행될 내용은 작성하지 않았기 때문에 미완성 메서드인 것이다.
   *
   * 메서드를 이와 같이 미완성 상태로 남겨 놓는 이유는 메서드의 내용이 상속받는 클래스에 따라 달라질 수 있기 때문에 추상 클래스에서는 선언부만을
   * 작성하고, 주석을 덧붙여 어떤 기능을 수행할 목적으로 작성되었는지 알려주고, 실제 내용은 상속받는 클래스에서 구현하도록 비워 두는 것이다.
   *
   * 그래서 추상 클래스를 상속받는 자손 클래스는 조상의 추상 메서드를 상황에 맞게 적절히 구현해주어야 한다.
   * 추상 메서드 역시 키워드 'abstract' 를 앞에 붙여주고, 추상 메서드는 구현부가 없으므로 괄호{} 대신 문자의 끝을 알리는 ';' 을 붙여준다.
   *
   * => abstract 리턴타입 메서드이름();
   *
   * 추상 클래스로부터 상속받는 자손 클래스는 오버라이딩을 통해 조상인 추상 클래스의 추상 메서드를 모두 구현해주어야 한다. 만일 조상으로부터
   * 상속받은 추상 메서드 중 하나라도 구현하지 않는다면, 자손 클래스 역시 추상 메서드를 가진 것이 되고 마찬가지로 추상 클래스가 되어야 할 것이다.
   * 쉽게 말해, 추상 메서드(미완성 메서드)를 가지고 있다면 그 자체로 추상 클래스가 되는 것이다.
   *
   *
   * abstract class Player {
   *   abstract void play(int pos);
   *   abstract void stop();
   * }
   *
   * class AudioPlayer extends Player {
   *   void play(int pos) { 내용 구현...} //상속받은 추상 메서드를 구현
   *   void stop() { 내용 구현...} //상속받은 추상 메서드를 구현
   * }
   *
   * abstract class AbstractPlayer extends Player {
   *   void play(int pos) { 내용 구현...}
   *   //구현하지 않은 stop 추상 메서드를 아직 가지고 있기 때문에 추상 클래스로 선언되어야 한다.
   * }
   *
   * 실제 작업 내용인 구현부가 없는 메서드가 무슨 의미가 있을까 싶기도 하겠지만, 메서드를 작성할 때 실제 작업 내용인 구현부보다 더 중요한 부분이 선언부이다.
   * 메서드를 사용하는 쪽에서는 메서드가 실제로 어떻게 구현되어 있는지 몰라도 메서드의 이름과 매개변수, 리턴 타입, 즉 선언부만 알고 있으면 되므로
   * 내용이 없을지라도 추상 메서드를 사용하는 코드를 작성하는 것이 가능하며, 실제로는 자손 클래스에 구현된 완성된 메서드가 호출되도록 할 수 있다.
   *
   *
   *
   * */

}
