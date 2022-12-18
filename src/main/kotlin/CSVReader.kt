import com.opencsv.CSVReader
import java.io.File
import java.io.FileReader

fun main() {
    /*println(System.getProperty("user.dir"))

    val reader = CSVReader(FileReader(".\\src\\main\\resources\\TCS\\TC001.csv"))
    val rows = reader.readAll()
    for( row in rows){
        println(row.joinToString(","))
    }
    reader.close()*/


}

class SampleSearcher(val path: String) {

    fun getPreCondition(featureName: String) {
        val csvReader = CSVReader(FileReader(path))
        val precondition = csvReader
            .readAll()
            .filter { it ->
                it[0].equals(featureName)
            }.first()[1]
            .split("=")


    }

    fun getSc(featureName: String): MutableList<String> {
        val csvReader = CSVReader(FileReader(path))
        val iter = csvReader.readAll().iterator()
        val saveDatas = mutableListOf<String>()

        while (iter.hasNext()) {
            if (iter.next()[0].equals(featureName)) {

                var data = iter.next()
                while (data[0].equals("")) {
                    saveDatas.add(data[3])
                    data = iter.next()
                }
            }
        }

        return saveDatas
    }

    fun getRe(featureName: String): MutableList<String> {
        val csvReader = CSVReader(FileReader(path))
        val iter = csvReader.readAll().iterator()
        val saveDatas = mutableListOf<String>()

        while (iter.hasNext()) {
            if (iter.next()[0].equals(featureName)) {

                var data = iter.next()
                while (data[0].equals("")) {
                    saveDatas.add(data[4])
                    data = iter.next()
                }
            }
        }

        return saveDatas
    }

}