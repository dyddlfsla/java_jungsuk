package chapter.ten._10;

public class Chapter10_10 {

  /** ◆ Decimal Format
   *
   * 형식화 클래스 중에서 숫자를 형식화 하는데 사용되는 것이 Decimal Format 이다. Decimal Format 을 사용하면
   * 숫자 데이터를 정수, 부동소수점, 금액 등의 다양한 형식으로 표현할 수 있으며, 반대로 일정한 형식의 텍스트 데이터를
   * 숫자로 쉽게 변환하는 것도 가능하다.
   *
   *
   *
   *      기호                  의미                               패턴                   결과(1234567.89)
   *  1.   0                 10진수(값이 없을때는 0)                  0                      12345678
   *                                                              0.0                     1234567.9
   *                                                     0000000000.0000                 0001234567.8900
   *  =========================================================================================================
   *  2.   #                 10진수                                #                       12345678
   *                                                             #.#                      1234567.9
   *                                                     ##########.####                  1234567.89
   *  =========================================================================================================
   *  3.   .                 소수점                              #.#                       1234567.9
   *  =========================================================================================================
   *  4.   -                  음수 부호                          #.#-                      1234567.9-
   *                                                          -#.#                       -1234567.9
   *  =========================================================================================================
   *  5.   E                  지수 기호                        #E0                           .1E7
   *  =========================================================================================================
   *  6.   ,                  단위 구분자                      #,###.##                    1,234,567.89
   *                                                        #,####.##                    123,4567.89
   *  ==========================================================================================================
   *  7.   ;                  패턴 구분자                 #,###.##+;#,###.##-              1,234,567.89+(양수일때)
   *                                                                                     1,234,567.89-(음수일때)
   *  ==========================================================================================================
   *  8.   %                   퍼센트                          #.#%                        123456789%
   *  ==========================================================================================================
   *  9. \u2030                 퍼밀                          #.#\u2030                    1234567890%
   *  ==========================================================================================================
   *  10. \u00A4                통화                          \u00A4 #,###                 ￦ 1,234,568
   *  ==========================================================================================================
   *  11.  '                   escape 문자                    '#'#,###                      #1,234,568
   *                                                         "#,###                         '1,234,568
   *  ==========================================================================================================
   *
   *  Decimal Format 을 사용하는 방법은 간단하다. 먼저 원하는 출력형식의 패턴을 작성하여 DecimalFormat 인스턴스를 생성한 다음, 출력하고자 하는
   *  문자열로 format 메서드를 호출하면 원하는 패턴에 맞게 변환된 문자열을 얻게 된다.
   *
   *  double number = 1234567.89;
   *  DecimalFormat df = new DecimalFormat("#.#E0");
   *  String result = df.format(number);
   *  //result = "1.2E6"
   *
   *
   *
   *
   * */

}