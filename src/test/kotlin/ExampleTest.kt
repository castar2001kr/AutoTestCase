import io.kotest.core.spec.style.FeatureSpec
import io.kotest.data.forAll
import io.kotest.data.headers
import io.kotest.data.row
import io.kotest.data.table
import io.kotest.matchers.shouldBe

class TestSpeck : FeatureSpec() {
    init {
        feature("sum with datas") {
            table(
                headers("a", "b", "result"),
                row(1, 2, 3),
                row(2, 4, 6),
                row(3, 4, 7)
            ).forAll { a, b, c ->
                scenario("시나리오 $a+$b == $c") {

                    a + b shouldBe c
                }
            }
        }
    }
}