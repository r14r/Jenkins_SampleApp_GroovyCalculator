package Calculator.Groovy

import spock.lang.Specification


class Calculator01Spec extends Specification {
  def calculator = new Calculator()

  def "add: 2 + 3"() {
    expect:
    calculator.add(2,3) == 5
  }

  def "subtract: 4 - 3"() {
    expect:
    calculator.subtract(4,3) == 1
  }

  def "multiply: 2 * 3"() {
    expect:
    calculator.multiply(2,3) == 6
  }

}
