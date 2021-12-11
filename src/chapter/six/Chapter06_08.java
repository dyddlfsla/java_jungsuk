package chapter.six;

public class Chapter06_08 {

  /** ◆ 객체 배열
   *
   * 많은 수의 객체를 다루어야 할 때, 배열로 다루면 편리할 것이다. 객체 역시 배열로 다루는 것이 가능하며, 이를 '객체 배열' 이라고 한다.
   * 그렇다고 객체 배열 안에 객체가 직접 저장되는 것은 아니고, 객체의 주소값이 저장된다. 사실 객체 배열은 참조변수들을 하나로 묶은
   * 참조변수 배열인 것이다.
   *
   *  Tv tv1, tv2, tv3; → Tv[] tvArr = new Tv[3];
   *
   * 길이가 3인 객체 배열 tvArr 을 아래와 같이 생성하면, 각 요소는 참조변수의 기본값인 null 로 자동 초기화 된다.
   * 그리고 이 객체 배열은 3개의 객체, 정확히 3개의 객체 주소값을 저장할 수 있다.
   *
   * 객체 배열을 생성하는 것은, 그저 객체를 다루기 위한 참조변수들이 만들어진 것일뿐, 아직 객체 주소가 저장되지 않았다.
   * 따라서, 객체를 생성해서 객체 배열의 각 요소에 주소값을 저장하는 것을 잊으면 안된다. 객체 배열을 다룰 때에 가장 많이
   * 하게 되는 실수가 객체 배열만 생성해 놓고 객체를 사용하려고 하다 에러를 발생시키는 것이다.
   *
   *  Tv[] tvArr = new Tv[3];
   *
   *  //객체를 생성한 후 배열의 각 요소에 저장.
   *  tvArr[0] = new Tv();
   *  tvArr[1] = new Tv();
   *  tvArr[2] = new Tv();
   *
   *  앞서 배웠던 바와 같이 객체 배열 역시 선언과 동시에 초기화 블럭을 사용하여 다음과 같이 한 줄로 작성할 수 있다.
   *
   *  Tv[] tvArr = {new Tv(), newTv(), new Tv()};
   *
   *  만약 다뤄야 할 객체의 수가 많다면 for 문을 고려할 수도 있다.
   *
   *  Tv[] tvArr = new Tv[100];
   *
   *  for (int i = 0; i < tvArr.length; i++) {
   *    tvArr[i] = new tv();
   *  }
   *
   *
   * */

}