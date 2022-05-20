package chapter.seven_2nd._24;

public class Chapter07_24 {

  /** ◆ 참조변수의 형변환
   *
   * 기본형 타입 변수처럼 참조변수도 형변환이 가능하다. 단, 서로 상속관계에 있는 클래스 사이에서만 가능하기 때문에 자손 타입의 참조변수를
   * 조상 타입의 참조변수로, 조상 타입의 참조변수를 자손 타입의 참조변수로 형변환만 가능하다.
   *
   * ※ 바로 윗 조상이나 자손이 아닌, 조상의 조상으로도 형변환이 가능하다. 따라서 모든 참조변수는 모든 클래스의 조상인 Object 클래스 타입으로
   * 형변환이 가능하다.
   *
   * class Car {}
   * class FireEngine extends Car {}
   * class Ambulance extends Car {}
   *
   * 만일 위와 같이 Car 클래스가 있고 이를 상속받는 FireEngine, Ambulance 클래스가 있을 때, FireEngine 타입의 참조변수 f 는 조상 타입인 Car 로 형변환이 가능하다.
   * 반대로 Car 타입의 참조변수를 자손타입인 FireEngine 타입으로 형변환하는 것도 가능하다. 그러나, FireEngine 과 Ambulance 는 상속관계가 아니므로 형변환이 불가능하다.
   *
   *  FireEngine f = new FireEngine();
   *  Car c = (Car) f; //조상 타입은 Car 타입으로 형변환 가능(캐스팅 연산자 생략 가능)
   *  FireEngine f2 = (FireEngine) c; //자손인 FireEngine 타입으로 형변환 가능(캐스팅 연산자 생략 불가)
   *  Ambulance a = (Ambulance) f; //불가능. 참조형 변수의 형변환은 상속관계에서만 가능하다.
   *
   *  기본형의 형변환과 달리 참조형의 형변환은 변수에 저장된 값(주소값)이 변환되는 것이 아니다.
   *
   *  Car c = (Car) f; // f 의 값(객체의 주소값)을 c 에 저장
   *  f = (FireEngine) c; //조상타입을 자손타입으로 형변환 하는 경우 캐스팅 연산자를 생략할 수 없다.
   *
   *  참조변수의 형변환은 그저 리모컨(참조변수)을 다른 종류의 것으로 바꾸는 것 뿐이다. 리모컨의 타입을 바꾸는 이유는 사용할 수 있는 멤버 개수를 조절하기 위한 것이고
   *  그 이유는 곧 설명할 것이다. 위과 같이 조상 타입으로의 형변환을 생략할 수 이유는 조상 타입으로 형변환하면 다룰 있는 멤버의 개수가 줄어들기 때문에 항상 안전하기 때문이다.
   *  반대로 실제 객체가 가진 기능보다 리모컨의 버튼이 더 많으면 안된다.
   *
   *  =================================================================================================================
   *  서로 상속관계에 있는 타입 간의 형변환은 양방향으로 자유롭게 수행될 수 있으나, 참조변수가 가리키는 인스턴스의 자손 타입으로 형변환은 허용되지 않는다.
   *  그래서 참조변수가 가리키고 있는 인스턴스의 타입이 무엇인지 먼저 확인하는 것이 중요하다.
   *  =================================================================================================================
   *
   *
   *
   *
   *
   *
   *
   * */

}