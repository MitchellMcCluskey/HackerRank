case class Point(x: Int, y: Int) {
    def distanceToPoint(point: Point): Double = {
        val xDistance = x - point.x
        val yDistance = y - point.y
        math.sqrt((xDistance * xDistance) + (yDistance * yDistance))
    }
}

object Solution extends App {

    override def main(args: Array[String]): Unit = {
        val pointPattern = "([0-9]+) ([0-9]+)".r
        val allInput = io.Source.stdin.getLines()
        allInput.next()
        val firstPoint = allInput.next()
        val allInputPlusFirst: Iterator[String] = Iterator(firstPoint) ++ allInput ++ Iterator(firstPoint)
        println {
            allInputPlusFirst.map { pointInput =>
                val pointPattern(x, y) = pointInput
                Point(x.toInt, y.toInt)
            }.sliding(2).map(twoPoints => twoPoints.head.distanceToPoint(twoPoints.last)).sum
        }
    }
}


