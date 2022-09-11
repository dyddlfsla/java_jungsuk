package chapter.twelve._03;

public class Chapter12_04 {

  /*
  * ◆ 제네릭스의 용어
  *
  * 제네릭스에서 사용되는 용어들은 자칫 헷갈리기 쉽다. 진도를 더 나가기 전에, 제네릭스의 용어를 먼저 정리하고 넘어가자.
  * 다음과 같이 제네릭 클래스 Box 가 선언되어 있을 때,
  *
  *  class Box<T> {}
  *
  * ① Box<T>: 제네릭 클래스. 'T의 Box' 또는 'T Box' 라고 읽는다.
  * ② T: 타입 변수 또는 타입 매개변수.(T 자체는 타입 문자)
  * ③ Box: 원시 타입(raw type)
  *
  * 타입 문자 T 는 제네릭 클래스 Box<T> 의 타입 변수 또는 타입 매개변수라고 하는데, 메서드의 매개변수와 유사한 면이 있기 때문이다.
  * 그래서 아래와 같이 타입 매개변수에 타입을 지정하는 것을 '제네릭 타입 호출' 이라고 하고, 지정된 타입 'String' 을 '매개변수화된 타입' 이라고 한다.
  *
  *  Box<String> box = new Box<String>();
  *
  * 예를 들어, Box<String> 과 Box<Integer> 는 제네릭 클래스 Box<T> 에 서로 다른 타입을 대입하여 호출한 것일 뿐, 이 둘이 별개의 클래스를 의미하는 것은 아니다.
  * 이는 마치 매개변수의 값이 다른 메서드 호출, 즉 add(3, 5) 와 add(2,4) 가 서로 다른 메서드를 호출하는 것이 아닌 것과 같다.
  *
  * 컴파일 후에 Box<String> 과 Box<Integer> 는 이들의 '원시 타입' 인 Box 로 바뀐다. 즉, 제네릭 타입이 제거된다.
  *
  *
  * */

}
