import org.scalamock.generated.GeneratedMockFactory
import org.scalamock.specs2.MockFactory
import org.specs2.mutable.Specification
import eu.delving.MappingEngine

/**
 * 
 * @author Manuel Bernhardt <bernhardt.manuel@gmail.com>
 */
class CollectionProcessorSpec extends Specification with MockFactory with GeneratedMockFactory {

  "A MappingEngine" should {

    "be mocked" in {

      val mockEngine = mock[MappingEngine]
      1 must equalTo (1)

    }

  }

}
