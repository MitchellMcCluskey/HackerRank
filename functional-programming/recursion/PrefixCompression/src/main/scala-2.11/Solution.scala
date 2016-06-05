object Solution {

    def main(args: Array[String]): Unit = {
        val allInput = io.Source.stdin.getLines
        val line1 = allInput.next
        val line2 = allInput.next
        val commonPrefix = line1.zip(line2).takeWhile(p => p._1 == p._2).map(_._1).mkString
        val line1WithoutPrefix = line1.drop(commonPrefix.length)
        val line2WithoutPrefix = line2.drop(commonPrefix.length)
        printLengthAndString(commonPrefix)
        printLengthAndString(line1WithoutPrefix)
        printLengthAndString(line2WithoutPrefix)
    }

    private def printLengthAndString(string: String): Unit = println(s"${string.length} $string")
}