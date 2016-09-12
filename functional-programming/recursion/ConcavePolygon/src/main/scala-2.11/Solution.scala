import scala.collection.mutable.ListBuffer

object Solution {

    case class Point(x: Int, y: Int) extends Ordered[Point] {
        override def compare(that: Point): Int = {
            if (this.x < that.x) -1
            else if (this.x > that.x) 1
            else if (this.y < that.y) -1
            else if (this.y > that.y) 1
            else 0
        }
    }

    private def hull(points: Seq[Point]): ListBuffer[Point] = {
        val hullPoints = ListBuffer[Point]()
        for (point <- points) {
            while (hullPoints.length >= 2 && crossProduct(hullPoints(hullPoints.length - 2), hullPoints.last, point) > 0)
                hullPoints -= hullPoints.last
            hullPoints += point
        }
        hullPoints
    }

    private def crossProduct(point1: Point, point2: Point, point3: Point): Int =
        (point2.x - point1.x) * (point3.y - point1.y) - (point2.y - point1.y) * (point3.x - point1.x)

    def main(args: Array[String]): Unit = {
        val pointPattern = "([0-9]+) ([0-9]+)".r
        val lines = io.Source.stdin.getLines
        val totalPoints = lines.next.toInt
        val points = (1 to totalPoints)
            .map { int =>
                val pointPattern(x, y) = lines.next
                Point(x.toInt, y.toInt)
            }
            .sorted

        println {
            if (hull(points).length + hull(points.reverse).length - 2 == points.length) "NO"
            else "YES"
        }
    }
}