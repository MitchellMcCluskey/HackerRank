object Solution {

    def main(args: Array[String]): Unit = {
        val allInput = io.Source.stdin.getLines
        (1 to allInput.next.toInt).foreach { lineNum =>
            println(allInput.next.grouped(2).map(_.reverse).mkString)
        }
    }
}