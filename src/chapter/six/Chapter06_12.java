package chapter.six;

public class Chapter06_12 {

  /** ◆클래스 변수와 인스턴스 변수
   *
   * 클래스 변수와 인스턴수 변수의 차이를 이해하기 위해 카드 게임에 사용되는 카드를 클래스로 정의해보자.
   * 카드 클래스를 작성하기 위해서는 먼저 카드를 분석해서 속성과 기능을 알아내어야 한다. 속성으로는 카드의 무늬,
   * 숫자, 폭, 넓이 정도를 생각해 볼 수 있다.
   *
   * 이 중에서 어떤 속성을 클래스 변수로 선언할 것이며, 또 어떤 속성들을 인스턴스 변수로 선언할 것인지 생각해보자.
   *
   *  class Card{
   *    String kind; //무늬
   *    int number; //숫자
   *
   *    static int width; //폭
   *    static int height; //높이
   *  }
   *
   * 각 카드 인스턴스는 자신만의 무늬(kind)와 숫자(number)를 유지하고 있어야 하므로 이들을 인스턴스 변수로 선언하였고,
   * 각 카드의 폭(width)과 높이(height)는 모든 인스턴스가 공통적으로 같은 값을 유지해야하므로 클래스 변수로 선언하였다.
   *
   * 카드의 폭을 변경해야할 필요가 있을 경우, 한 카드의 width 만 변경해도 모든 카드의 width 값이 변경된다.
   *
   *  ※ 인스턴스 변수는 인스턴스가 생성될 때마다 생성되므로 각 인스턴스마다 다른 값을 유지할 수 있지만,
   *  클래스 변수는 모든 인스턴스가 하나의 저장공간을 공유하므로, 항상 공통값을 갖는다.
   *
   * */

}
