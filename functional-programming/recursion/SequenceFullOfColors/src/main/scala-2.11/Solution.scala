object Solution {

    private def validateColors(chars: List[Char], redCount: Int, greenCount: Int, blueCount: Int, yellowCount: Int): Boolean = {
        if (chars.isEmpty) {
            redCount == greenCount && blueCount == yellowCount
        }
        else {
            val nextColor = chars.head
            val newRedCount    = if (nextColor == 'R') redCount + 1    else redCount
            val newGreenCount  = if (nextColor == 'G') greenCount + 1  else greenCount
            val newBlueCount   = if (nextColor == 'B') blueCount + 1   else blueCount
            val newYellowCount = if (nextColor == 'Y') yellowCount + 1 else yellowCount
            if (math.abs(newRedCount - newGreenCount) > 1 || math.abs(newBlueCount - newYellowCount) > 1) false
            else validateColors(chars.tail, newRedCount, newGreenCount, newBlueCount, newYellowCount)
        }
    }

    def main(args: Array[String]): Unit = {
        val allInput = io.Source.stdin.getLines
        (1 to allInput.next.toInt).foreach { _ =>
            val testString = allInput.next
            println {
                if (validateColors(testString.toList, 0, 0, 0, 0)) "True"
                else "False"
            }
        }
    }
}