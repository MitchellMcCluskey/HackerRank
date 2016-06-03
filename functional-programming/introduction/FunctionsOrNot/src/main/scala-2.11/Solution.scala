import scala.collection.mutable.ListBuffer

object Solution extends App {

    override def main(args: Array[String]): Unit = {
        val functionMappingPattern = "([0-9]+) ([0-9]+)".r
        val allInput = io.Source.stdin.getLines()
        val totalNumberTests = allInput.take(1).map(_.toInt).next()
        (1 to totalNumberTests).foreach { testNum =>
            val functionMappings: ListBuffer[(Int, Int)] = ListBuffer()
            val totalNumberFunctionMappings = allInput.take(1).map(_.toInt).next()
            (1 to totalNumberFunctionMappings).foreach { pairNum =>
                val functionMapping: String = allInput.take(1).next()
                val functionMappingPattern(x, y) = functionMapping
                functionMappings.append(x.toInt -> y.toInt)
            }
            val functionMappingsFinal = functionMappings.toList
            val duplicatesList: Seq[(Int, Int)] =
                for {
                    functionMappingA <- functionMappingsFinal
                    functionMappingB <- functionMappingsFinal
                    if functionMappingA._1 == functionMappingB._1 && functionMappingA._2 != functionMappingB._2
                } yield functionMappingA
            println{
                if (duplicatesList.nonEmpty) "NO"
                else "YES"
            }
        }
    }
}