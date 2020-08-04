package Calculator.Groovy

import spock.lang.Specification


class Calculator02Spec extends Specification {
  def calculator = new Calculator()

  def "two plus two should equal four"() {
    given:
        int left = 2
        int right = 2
 
    when:
        int result = left + right
 
    then:
        result == 4
  }
}
