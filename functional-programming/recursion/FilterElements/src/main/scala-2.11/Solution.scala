object Solution {

    def removeNonDuplicates(duplicateString: List[String], k: Int): List[String] = {
        if (k == 0) duplicateString
        else removeNonDuplicates((duplicateString.reverse diff duplicateString.distinct).reverse, k - 1)
    }

    def main(args: Array[String]): Unit = {
        val allInput = io.Source.stdin.getLines
        (1 to allInput.next.toInt).foreach { _ =>
            val k = allInput.next.split(" ").map(_.toInt).last
            val nonDuplicates = removeNonDuplicates(allInput.next.split(" ").toList.filter(_ != " "), k - 1).distinct
            println {
                if (nonDuplicates.isEmpty) -1
                else nonDuplicates.mkString(" ")
            }
        }
    }
}