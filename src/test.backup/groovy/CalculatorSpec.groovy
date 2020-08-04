import spock.lang.Specification

class CalculatorSpec extends Specification {
  def calculator = new Calculator()

  def "add"() {
    expect: calculator.add(2,3) == 5
  }

  def "multiply"() {
    expect: calculator.add(2,3) == 6
  }

}
