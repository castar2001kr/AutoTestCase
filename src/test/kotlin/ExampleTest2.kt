import io.kotest.core.spec.style.FeatureSpec
import io.kotest.data.forAll
import io.kotest.data.headers
import io.kotest.data.row
import io.kotest.data.table
import io.kotest.matchers.shouldBe

class TestSpeck2 : FeatureSpec() {
    init {
        feature("sum with datas") {
            val path = ".\\src\\main\\resources\\TCS\\TC001.csv"
            val sampleSearcher = SampleSearcher(path)

            val featureName = "feature_1"
            val sc = sampleSearcher.getSc(featureName)
            val re = sampleSearcher.getRe(featureName)
            val pre = sampleSearcher.getPreCondition(featureName)




        }
    }
}