package chapter.twelve._24;

public class Chapter12_24 {

  /*
  * ◆ 표준 애너테이션
  *
  * 자바에서 기본적으로 제공하는 애너테이션은 몇 개 없다. 그나마 이들의 일부는 '메타 애너테이션(meta annotation)' 으로 애너테이션을 정의하는데 사용되는 애너테이션이다.
  * 아직, 학습자 수준에서는 대부분 새로운 애너테이션을 정의하기보다는 이미 작성된 애너테이션을 사용하는 경우가 많으므로 가볍게 시작하는 것이 좋을 것이다.
  *
  * @Override: 컴파일러에게 해당 메서드는 오버라이딩된 것이라고 알려준다.
  * @Deprecated: 앞으로 사용하지 않길 권장하는 대상에 붙인다.
  * @SuppressWarnings: 컴파일러의 특정 경고메시지가 나타나지 않게 해준다.
  * @SafeVarargs: 제네릭스 타입의 가변인자에 사용한다.(JDK 1.7)
  * @FunctionalInterface: 함수형 인터페이스라는 것을 알린다.(JDK 1.8)
  * @Native: native 메서드에서 참조되는 상수 앞에 붙인다.
  *
  * --------- 메타 애너테이션 --------------------------------------------------------------------------
  * @Target: 애너테이션이 적용가능한 대상을 지정한다.
  * @Documented: 애너테이션 정보가 javadoc 으로 작성되 문서에 포함되게 한다.
  * @Inherited: 애너테이션이 자손 클래스에 상속되도록 한다.
  * @Retention: 애너테이션이 유지되는 범위를 지정한다.
  * @Repeatable: 애너테이션을 반복해서 적용할 수 있게 한다.
  *
  * */

}
