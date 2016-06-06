object Solution {

    def main(args: Array[String]): Unit = {
        val allInput = io.Source.stdin.getLines
        (1 to allInput.next.toInt).foreach { num =>
            val string = allInput.next
            val strings = Seq.fill[String](string.length)(string)
            println {
                strings.zipWithIndex.map { case (e, i) => e.substring(i + 1) + e.take(i + 1) }.mkString(" ")
            }
        }
    }
}