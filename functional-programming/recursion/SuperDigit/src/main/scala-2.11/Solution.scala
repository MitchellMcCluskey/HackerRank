object Solution {

    def superDigit(int: BigInt): BigInt = {
        if (int < 10) int
        else superDigit(sumOfDigits(int.toString))
    }

    def sumOfDigits(digits: String): BigInt = (0 /: digits) (_ + _.asDigit)

    def main(args: Array[String]): Unit = {
        val input = io.Source.stdin.getLines.next.split(" ")
        println(superDigit(sumOfDigits(input.head) * input.last.toInt))
    }
}