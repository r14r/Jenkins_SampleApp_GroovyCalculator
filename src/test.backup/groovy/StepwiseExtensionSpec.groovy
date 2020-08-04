
import spock.lang.*

@Stepwise
class StepwiseExtensionSpec extends Specification {
  def "step 1"() {
    expect: true // try to change this to 'false'
  }

  def "step 2"() {
    expect: true
  }

  def "step 3"() {
    expect: true
  }
}
