object Solution {

    def main(args: Array[String]): Unit = {
        val allInput = io.Source.stdin.getLines.take(2)
        println((allInput.next zip allInput.next).map(letterPair => letterPair._1.toString + letterPair._2.toString).mkString)
    }
}