package chapter.six;

public class Chapter06_05 {

  /** ◆ 한 파일에 여러 클래스 작성하기
   *
   * 하나의 소스 파일에 하나의 클래스만을 정의하는 것이 보통이지만, 하나의 소스파일에 둘 이상의 클래스를 정의하는 것도 가능하다.
   * 이때 주의해야 할 점은 '소스파일의 이름은 public class 의 이름과 일치해야 한다.' 는 것이다. 만일 소스파일 내에
   * public class 가 없다면 소스파일의 이름은 어느 것으로 해도 상관없다.
   *
   *
   * ======================================================================
   *  올바른 작성 예           |
   * ======================================================================
   * Hello.java             |  public class 가 있는 경우, 소스파일의 이름은 반드시
   *                        |  public class 의 이름과 일치해야 한다.
   * public class Hello2{}  |
   *        class Hello3{}  |
   * ======================================================================
   * Hello2.java            | public class 가 없는 경우, 소스파일의 이름은
   *                        | Hello2, Hello3 둘 중 어느 것으로 해도 좋다.
   * class Hello2{}         |
   * class Hello3{}         |
   * ======================================================================
   *  잘못된 작성 예           |
   * ======================================================================
   * Hello2.java            | 하나의 소스파일에 둘 이상의 public class 가 존재하면
   *                        | 안된다. 각 클래스를 별도의 소스파일에 나눠 작성하던가
   * public class Hello2{}  | 아니면 둘 중 하나에 public 을 제거해야 한다.
   * public class Hello3{}  |
   * ======================================================================
   * Hello3.java            | 소스파일의 이름이 public class 의 이름과 일치하지 않는다.
   *                        | Hello2.java 로 수정해야 한다.
   * public class Hello2{}  |
   *        class Hello3{}  |
   * ======================================================================
   * hello2.java            | 소스파일의 이름과 public class 의 이름은 대소문자까지
   *                        | 완벽하게 일치해야 한다.
   * public class Hello2{}  |
   *        class Hello3{}  |
   *=======================================================================
   *
   *
   * 단, 소스파일(*.java)와 달리 클래스파일(*.class)은 각 클래스마다 하나씩 만들어지므로
   * 소스파일의 갯수와 상관없이 클래스의 갯수대로 클래스 파일이 만들어진다.
   *
   *
   * */

}
