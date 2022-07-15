package chapter.nine._30;

public class Chapter09_30 {

  /* ◆ 오토박싱 & 언박싱
  *
  * JDK1.5 이전에는 기본형과 참조형 간의 연산이 불가능했기 때문에, 연산이 필요한 경우 기본형을 객체로 만들어서 연산해야 했다.
  *
  * int i = 5;
  * Integer 10bj = new Integer(7);
  * int sum = i + 10bj; // 에러 발생. JDK1.5 이전에는 기본형과 참조형 간의 산술 연산이 불가능했다.
  *
  * 그러나 이제는 기본형과 참조형 간의 덧셈이 가능하다. 자바 언어의 규칙이 바뀐 것은 아니고, 컴파일러가 자동으로 변환하는 코드를 넣어주기 때문이다.
  * 아래와 같이, 컴파일러가 Integer 객체를 int 타입의 기본형 값으로 변환해주는 intValue(); 를 추가해준다.
  *
  * int sum = i + 10bj.intValue();
  *
  * 이외에도 내부적으로 객체 배열을 가지고 있는 Vector 클래스나 ArrayList 클래스에 기본형 값을 저장해야할 때나 형변환이 필요할 때도 컴파일러가 자동적으로
  * 코드를 추가해준다. 기본형 값을 래퍼 클래스의 객체로 자동변환해주는 것을 '오토박싱(autoboxing)' 이라고 하고, 반대로 변환하는 것을 '언박싱(unboxing)' 이라고 한다.
  *
  * ArrayList<Integer> list = new ArrayList<Integer>();
  * list.add(10); // 오토박싱: 10 -> new Integer(10)
  * int value = list.get(0); // 언박싱: new Integer(10) -> 10
  *
  * 위의 코드에서 알 수 있듯이 ArrayList 에 숫자를 저장하거나 꺼낼 때, 기본형 값을 래퍼 클래스 객체로 변환하지 않아도 된다. 컴파일러가 자동적으로 해주기 때문이다.
  *
  * */

  public static void main(String[] args) {
    int i = 10;

    //기본형을 참조형으로 형변환(형변환 생략가능)
    Integer intg = (Integer) i;
    Object obj = (Object) i;

    Long lng = 100L; // Long lng = new Long(100L);

    int i2 = intg + 10; // 참조형과 기본형 간의 연산이 가능하다.
    long l = intg + lng; // 참조형 간의 덧셈도 가능함.

    Integer intg2 = new Integer(20);
    int i3 = (int) intg2; // 참조형 -> 기본형으로 형변환

    Integer intg3 = intg2 + i3;

    System.out.println("i = " + i);
    System.out.println("intg = " + intg);
    System.out.println("obj = " + obj);
    System.out.println("lng = " + lng);
    System.out.println("intg + 10 = " + i2);
    System.out.println("intg + lng = " + l);
    System.out.println("intg2 = " + intg2);
    System.out.println("i3 = " + i3);
    System.out.println("intg2 + i3 = " + intg3);

  }
  /*
  * 이 예제는 오토박싱을 이용해서 기본형과 참조형 간의 형변환과 연산을 수행하는 예를 보여준다.
  * 지금까지 배워온 것과는 달리 기본형과 참조형 간의 형변환도 가능할 뿐만 아니라 심지어는 참조형 간의 연산도
  * 가능하다는 것이다. 그러나 사실 이 기능은 컴파일러가 제공하는 편리한 기능일 뿐 자바의 원칙이 바뀐 것은 아니다.
  * 생성자가 없는 클래스에 컴파일러가 기본 생성자를 추가해주는 것처럼 간략하게 쓴 구문을 컴파일러가 원래의 구문으로 변경해주는 것 뿐이다.
  *
  *
  * */

}
