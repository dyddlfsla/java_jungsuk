package chapter.fourteen._24;

public class Chapter14_24 {

  /*
  * ◆ 스트림의 연산 - 중간 연산
  *
  * Stream 에 정의된 중간 연산을 정리하면 다음과 같다. 각각의 내용은 뒤에서 자세히 다루니 지금은 대략적인 종류들을 살펴보자.
  *
  * 1. Stream<T> distinct(): 스트림 요소 중 중복된 요소들을 제거한다.
  * 2. Stream<T> filter(Predicate<T> predicate): 스트림 요소 중 주어진 조건에 맞지 않는 요소들을 제외시킨다.
  * 3. Stream<T> limit(long maxSize): 스트림의 요소의 갯수를 지정된 수만큼 제한한다.
  * 4. Stream<T> skip(long n): 스트림의 요소를 n 번만큼 건너뛴다.
  * 5. Stream<T> peek(Consumer<T> action): 스트림의 각 요소에 action 작업을 수행한다. forEach 는 달리 스트림의 요소를 소모하지 않는다.
  * 6. Stream<T> sorted(): 스트림의 요소를 요소가 가지고 있는 기본 방식으로 정렬시킨다.
  * 7. Stream<T> sorted(Comparator<T> comparator): 지정된 comparator 를 이용해서 스트림 요소들을 정렬시킨다.
  * 8. Stream<R> map(Function<T, R> mapper): 스트림의 요소에 주어진 람다식을 적용해 변형하거나 추출한다.
  * 9. DoubleStream mapToDouble(ToDoubleFunction<T> mapper)
  * 9. IntStream mapToInt(ToIntFunction<T> mapper)
  * 9. LongStream mapToLong(ToLongFunction<T> mapper)
  *
  * 중간 연산에서 핵심은 map() 과 flatMap() 이다. 나머지는 이름만으로 기능을 유추하기도 쉽고 사용법도 간단하다.
  *
  *
  *
  *
  * */

}
