object Solution {

    private def pascalTriangle(row: Int): Seq[Int] = {
        val previousRow = {
            if (row > 1) pascalTriangle(row - 1)
            else Seq[Int]()
        }
        val thisRow = (0 until row).map { column =>
            if (previousRow.isDefinedAt(column - 1) && previousRow.isDefinedAt(column))
                previousRow(column - 1) + previousRow(column)
            else 1
        }
        println(thisRow.mkString(" "))
        thisRow
    }

    def main(args: Array[String]): Unit = {
        pascalTriangle(io.Source.stdin.getLines().take(1).map(_.toInt).next())
    }
}