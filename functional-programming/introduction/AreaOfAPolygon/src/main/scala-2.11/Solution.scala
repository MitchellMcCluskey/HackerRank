case class Point(x: Int, y: Int)

object Solution extends App {

    override def main(args: Array[String]): Unit = {
        val pointPattern = "([0-9]+) ([0-9]+)".r
        val allInput = io.Source.stdin.getLines()
        allInput.next()
        val firstPoint = allInput.next()
        val allInputPlusFirst: Iterator[String] = Iterator(firstPoint) ++ allInput ++ Iterator(firstPoint)
        println {
            math.abs {
                allInputPlusFirst.map { pointInput =>
                    val pointPattern(x, y) = pointInput
                    Point(x.toInt, y.toInt)
                }.sliding(2).map { twoPoints =>
                    val point1 = twoPoints.head
                    val point2 = twoPoints.last
                    point1.x * point2.y - point1.y * point2.x
                }.sum / 2d
            }
        }
    }
}


