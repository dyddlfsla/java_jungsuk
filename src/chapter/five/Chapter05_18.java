package chapter.five;

public class Chapter05_18 {

  /** ◆ 2차원 배열의 선언
   *
   * 지금까지 우리가 배운 배열은 1차원 배열인데, 2차원 이상의 배열, 즉 다차원 배열도 선언해서 사용할 수 있다.
   * 메모리 용량이 허용하는 한, 차원의 제한은 없지만 주로 1, 2차 배열이 사용된다.
   *
   * 2차원 배열을 선언하는 방법은 1차원 배열을 선언하는 것과 크게 다르지 않다. 다만 대괄호[] 가 하나 더 들어갈 뿐이다.
   *
   *  타입[][] 변수이름;   int[][] score;
   *  타입 변수이름[][];   int score[][];
   *  타입[] 변수이름[];   int[] score[];
   *
   *  고차원의 배열은 대괄호[]를 차원의 갯수만큼 추가해주면 된다.
   *
   *  2차원 배열은 주로 테이블 형태의 데이터를 담는데 사용되며 만일 4행 3열의 데이터를 담기 위한 배열을 생성하려면 다음과 같이 한다.
   *
   *   int[][] score = new int[4][3];
   *
   *   위 문장이 수행되면 아래의 그림처럼 4행 3열의 데이터, 모두 12개의 int 값을 저장할 수 있는 공간이 마련된다.
   *   배열이 생성되면 배열의 각 요소에는 배열요소 타입의 기본값이 저장된다.
   *
   *
   *  ◆ 2차원 배열의 인덱스
   *
   *  2차원 배열은 행(row)과 컬럼(column)으로 구성되어 있기 때문에 index 도 행과 열에 각각 하나씩 존재한다.
   *  '행 index' 의 범위는 '0 ~ 행의 길이 -1' 이고 '열 index' 의 범위도 '0 ~ 컬럼의 길이 -1'이다.
   *
   *   int[][] score = new int[4][3];
   *
   *   score[0][0] score[0][1] score[0][2]
   *   score[1][0] score[1][1] score[1][2]
   *   score[2][0] score[2][1] score[2][2]
   *   score[3][0] score[3][1] score[3][2]
   *
   *
   * ◆ 2차원 배열의 초기화
   *
   * 2차원 배열도 괄호{} 를 사용하여 생성과 초기화를 동시에 할 수 있다. 다만, 1차원 배열보다 괄호{}를 한번 더 사용하여 행별로 구분한다.
   *
   *  int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}};
   *  int[][] arr = {{1, 2, 3,}, {4, 5, 6}};
   *
   *  크기가 작은 배열은 위와 같이 간단히 한 줄로 작성할 수도 있지만, 가능하면 다음과 같이 행별로 줄 바꿈을 해주는 것이 보기도 좋고 이해하기도 쉽다.
   *
   *   int[][] arr = {
   *                   {1, 2, 3},
   *                   {4, 5, 6}
   *                 }
   *
   * */

}
