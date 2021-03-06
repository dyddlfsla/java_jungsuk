package chapter.eleven._10;

public class Chapter11_10 {

  /** ◆ ArrayList 의 추가 / 삭제
   *
   * ArrayList 의 요소를 삭제하는 경우, 삭제할 객체의 바로 아래에 있는 데이터를 한 칸씩 위로 복사해서 삭제할 객체를 덮어 씌우는 방식으로 처리한다.
   * 만일 삭제할 객체가 마지막 데이터라면, 복사할 필요 없이 마지막 객체만 null 로 변경해주기만 하면 된다.
   *
   * 그 과정을 정리해서 살펴보면
   *
   * ==========================================================================
   * 1. 삭제할 데이터의 아래에 있는 데이터를 한 칸씩 위로 복사해서 삭제할 데이터를 덮어쓴다.
   * 2. 데이터가 모두 한 칸씩 위로 이동하였으므로 마지막 데이터는 null 로 변경해야 한다.
   * 3. 데이터가 삭제되어 데이터의 갯수(size) 가 줄었으므로 size 의 값을 1 감소시킨다.
   * ==========================================================================
   *
   * 위 과정을 통해 배워야 할 것은 배열에 객체를 순차적으로 저장할 때 객체를 마지막에 저장된 것부터 삭제하면 데이터를 옮기지 않아도 되기 때문에
   * 작업 시간이 짧지만, 배열의 중간에 위치한 객체를 추가하거나 삭제하는 경우 다른 데이터의 위치를 이동시켜 줘야 하기 떄문에 다루는 데이터의 개수가 많아지고
   * 작업 시간이 오래 걸린다는 것이다.
   *
   * ArrayList 에 새로운 요소를 추가할때도 마찬가지로 먼저 추가할 위치 이후의 요소들을 모두 복사한 뒤 한 칸씩 이동시킨 후 저장해야 한다.
   *
   *
   * */

}
