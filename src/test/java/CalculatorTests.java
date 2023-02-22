import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 계산기 Test code 작성 클래스
 */
public class CalculatorTests {
  /**
   * 계산기 클래스의 더하기 메서드의 Test code
   */
  @Test
  void plus() {
    float result = Calculator.plus(1, 2); // 에러
    assertEquals(3.0, result); //실행한 결과 값이 기댓값과 같은지 assertEquals(기댓값, 실행값)로 검사
  }
}
