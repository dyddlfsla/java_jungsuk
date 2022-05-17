package chapter.eleven._02;

public class Chapter11_02 {

  /** ◆ 컬렉션 프레임워크의 핵심 인터페이스
   *
   * 컬렉션 프레임워크에서는 컬렉션 데이터 그룹을 크게 3가지 타입이 존재한다고 인식하고, 각 컬렉션을 다루는데 필요한 기능을 가진 3개의 인터페이스를 정의하였다.
   * 그리고 인터페이스 List 와 Set 의 공통적인 부분을 다시 뽑아서 새로운 인터페이스인 Collection 을 추가로 정의하였다.
   *
   *            Collection
   *         ↗             ↖
   *    List              Set         Map
   *
   * 인터페이스 List 와 Set 을 구현한 컬렉션 클래스들은 서로 많은 공통 부분이 있어서, 공통된 부분을 다시 뽑아 Collection 인터페이스를 정의할 수 있었지만
   * Map 인터페이스는 이들과는 전혀 다른 형태로 컬렉션을 다루기 때문에 같은 상속계층도에 포함되지 못하였다.
   *
   * 1. 인터페이스의 종류과 특징
   *
   * ① List : 순서가 있는 데이터의 집합. 데이터의 중복을 허용한다. → ArrayList, LinkedList, Vector
   * ② Set : 순서를 유지하지 않는 데이터의 집합. 데이터의 중복을 허용하지 않는다. → 양의 정수집합, 소수의 집합
   * ③ Map : 키(key) 와 값(value) 의 쌍(pair) 으로 이루어진 데이터의 집합
   *         순서는 유지되지 않으며, 키는 중복을 허용하지 않지만 값은 중복을 허용한다. → HashMap, TreeMap, Hashtable, Properties
   *
   * ※ 키(key) 란, 데이터 집합 중에서 어떤 값(value)을 찾는데 열쇠(key) 가 된다는 의미에서 붙여진 이름이며, 그래서 키는 중복을 허용하지 않는다.
   *
   * 실제 개발 시에는 다루고자 하는 컬렉션의 특징을 파악하고 어떤 인터페이스를 구현한 컬렉션 클래스를 사용해야 하는지 결정해야 하므로 각 인터페이스의 특징과 차이를 잘 이해하고 있어야 한다.
   * 컬렉션 프레임워크의 모든 컬렉션 클래스들은 List, Set, Map 중의 하나를 구현하고 있으며, 구현한 인터페이스의 이름이 클래스의 이름에 포함되어 있어서 이름만으로도 클래스의 특징을
   * 쉽게 알 수 있도록 되어있다.
   *
   *
   * */

}

