package chapter.seven_2nd._34;

public class Ex7_10 {

  public static void main(String[] args) {
    Unit[] group = {
        new Marine(),
        new Tank(),
        new Dropship(),
    };

    //group[0].stimPack(); 리모컨에 stimpack 버튼이 존재하지 않는다.

    Marine marine = new Marine();
    marine.stimPack();

    for (int i = 0; i < group.length; i++) {
      group[i].move(100, 200);
    }
  }

}

abstract class Unit {
  int x, y;

  abstract void move(int x, int y);
  void stop() {}
}

class Marine extends Unit {

  @Override
  void move(int x, int y) {
    System.out.printf("Marine [ x = %d, y = %d ]\n", x, y);
  }
  void stimPack() {
    //스팀팩을 사용한다.
  }
}

class Tank extends Unit {

  @Override
  void move(int x, int y) {
    System.out.printf("Tank [ x = %d, y = %d ]\n", x, y);
  }

  void changeMode() {
    //공격모드를 변환한다.
  }
}

class Dropship extends Unit {

  @Override
  void move(int x, int y) {
    System.out.printf("Dropship [ x = %d, y = %d ]\n", x, y);
  }
  void load() {
    //선택된 대상을 태운다
  }
  void unload() {
    //선택된 대상을 내린다
  }

  /**
   * 위의 예제는 공통조상인 Unit 클래스 타입의 객체 배열을 통해서 서로 다른 종류의 인스턴스를 하나의 묶음으로 다룰 수 있다는 것을 보여 주기 위한 것이다.
   * 다형성에서 배웠듯이, 조상 타입의 참조변수로 자손 타입의 인스턴스를 참조하는 것이 가능하기 때문에 이처럼 조상 타입의 배열에 자손 타입의 인스턴스를 담을 수 있는 것이다.
   * 만일 이들 클래스 간의 공통조상이 없었다면 이처럼 하나의 배열로 다룰 수 없을 것이다. Unit 클래스 에 move 메서드가 비록 추상 메서드로 정의되어 있다 하더라도
   * 이처럼 Unit 클래스 타입의 참조변수로 move 메서드를 호출하는 것이 가능하다. 메서드는 참조변수의 타입에 관계없이 실제 인스턴스에 구현된 것이 호출되기 때문이다.
   * group[i].move(100, 200); 과 같이 호출하는 것이 Unit 클래스의 추상 메서드인 move 를 호출하는 것 같아 보이지만 실제로는 이 추상 메서드가 구현된 Marine, Tank, Dropship  인스턴스의 메서드가 호출되는 것이다.
   * 모든 클래스의 조상인 Object 클래스 타입의 배열로도 서로 다른 종류의 인스턴스를 하나의 묶음으로 다룰 수 있지만, Object 클래스에는 move 메서드가 정의되어 있지 않기 때문에
   * move 메서드를 호출하는 부분에서 에러가 발생한다.
   *
   * */
}
