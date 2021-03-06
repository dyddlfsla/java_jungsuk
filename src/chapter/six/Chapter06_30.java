package chapter.six;

public class Chapter06_30 {

  /** ◆ 오버로딩 (overloading)
   *
   * 메서드도 변수와 마찬가지로 같은 클래스 내에서 서로 구별될 수 있어야 하기 떄문에 각기 다른 이름을 가져야 한다.
   * 그러나 자바에서는 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메서드가 있더라도 매개변수의 개수
   * 또는 타입이 다르면, 같은 이름을 사용해서 메서드를 정의할 수 있다.
   *
   *  이처럼, 한 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것을 '메서드 오버로딩'이라 한다.
   *
   * 같은 이름의 메서드를 정의한다고 해서 무조건 오버로딩인 것은 아니다. 오버로딩이 성립하기 위해서는 다음과
   * 같은 조건을 만족해야 한다.
   *
   * ============================================
   *  1. 메서드 이름이 같아야 한다.
   *  2. 매개변수의 개수 또는 타입이 달라야 한다.
   * ============================================
   *
   * 비록 메서드의 이름이 같다 하더라도 매개변수가 다르면 서로 구별될 수 있기 때문에 오버로딩이 가능한 것이다.
   * 위의 조건을 만족시키지 못한다면 메서드는 중복 정의로 간주되어 컴파일러가 에러를 발생시킬 수 있다.
   * 그리고 오버로딩된 메서드들은 매개변수에 의해서만 구별될 수 있으므로 반환 타입은 오버로딩을 구현하는데
   * 아무런 영향을 주지 않는다는 것에 주의하자.
   *
   * 오버로딩의 가장 대표적인 예로 println() 메서드가 있다. 지금까지 우리는 해당 메서드 안에 어떤 값을
   * 넣어도 그 내용을 출력하는데 아무런 지장이 없었다.
   *
   * 그렇게 할 수 있었던 이유는 실제로 println() 를 호출할 때 매개변수로 지정하는 값의 타입에 따라서
   * 호출되는 println() 가 달라졌기 때문이다.
   *
   * PrintStream 클래스에는 어떤 종류의 매개변수를 지정해도 출력할 수 있도록 아래와 같이 10개의
   * 오버로딩된 println() 메서드를 정의해놓고 있다.
   *
   *  void println()
   *  void println(boolean x)
   *  void println(char x)
   *  void println(char[] x)
   *  void println(double x)
   *  void println(float x)
   *  void println(int x)
   *  void println(long x)
   *  void println(Object x)
   *  void println(String x)
   *
   * println 메서드를 호출할 때 매개변수로 넘겨주는 값의 타입에 따라서 위의 오버로딩된 메서드들 중
   * 하나가 선택되어 호출된다.
   *
   * 몇 가지 예를 통해, 조금 더 알아보자.
   *
   * ---------------------------------------
   *  int add(int a, int b){return a + b;}
   *  int add(int x, int y){return x + y;}
   * ---------------------------------------
   *
   * 위의 두 메서드는 매개변수의 이름만 다를 뿐 매개변수의 타입이 같기 때문에 오버로딩이 성립하지 않는다.
   * 매개변수의 이름이 달라지면 메서드 내에서 사용되는 변수의 이름이 달라질뿐, 아무런 의미가 없다.
   *
   * ---------------------------------------------
   * int add(int a, int b){return a + b;}
   * long add(int a, int b){return (long) a + b;}
   * ---------------------------------------------
   * 이번 경우는 리턴 타입만 다른 경우이다. 매개변수의 타입과 개수는 일치하고 리턴 타입만 다르기에
   * 이 역시 오버로딩으로 간주되지 않는다.
   *
   * ---------------------------------------------
   * long add(int a, long b) {return a + b;}
   * long add(long a, int a) {return a + b;}
   * ---------------------------------------------
   * 두 메서드 모두 int, long 을 매개변수로 사용하고 있는데, 서로 순서가 다르게 배치되어 있다.
   * 이 경우에는 메서드 호출 시 매개변수의 값에 의해 호출될 메서드가 구분될 수 있으므로 오버로딩이 성립하게 된다.
   *
   * ※ 메서드 오버로딩에서 중요한 것은, 메서드가 이름이 같더라도 매개변수에 의해 구분될 수 있어야 한다는 것이다.
   *
   *
   *
   *
   *
   *
   * */

}
