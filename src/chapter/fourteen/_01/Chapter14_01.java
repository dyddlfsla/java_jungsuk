package chapter.fourteen._01;

public class Chapter14_01 {

  /*
  * ◆ 람다식 (Lambda Expression)
  *
  * 람다식은 간단히 말해서 메서드를 하나의 '식(Expression)' 으로 표현한 것이다. 람다식은 함수를 간략하면서도 명확하게 표현할 수 있게 해준다.
  * 메서드를 람다식으로 표현하면 메서드의 이름과 반환값이 없어지므로 람다식을 '익명 함수(anonymous function)' 이라고도 한다.
  *
  * int[] arr = new int[5];
  * Arrays.setAll(arr, (i) -> (int) (Math.random() * 5) + 1 );
  *
  * 앞서 등장했던 람다식인데 위의 문장에서 (i) -> (int) (Math.random() * 5) + 1 이 바로 람다식이다.
  * 이 람다식이 하는 일을 메서드로 표현하면 다음과 같다.
  *
  * int method(int i) {
  *   return (int) (Math.random() * 5) + 1;
  * }
  *
  * 위의 메서드보다 람다식이 간결하면서도 이해하기 쉽다는 것에 이견이 없을 것이다. 게다가 모든 메서드는 클래스에 포함되어야 하므로
  * 기존의 코드를 따른다면 클래스도 새로 만들어야 하고, 객체도 생성해야만 비로소 이 메서드를 호출할 수 있다. 그러나 람다식은
  * 이 모든 과정없이 오직 람다식 자체만으로도 이 메서드의 역할을 대신할 수 있다.
  *
  * 게다가 람다식은 메서드의 매개변수로 전달되어지는 것이 가능하고, 메서드의 결과로 다시 반환될 수도 있다.
  * 람다식으로 인해 메서드를 변수처럼 다루는 것이 가능해진 것이다.
  *
  *
  *
  *
  *
  * */

}
