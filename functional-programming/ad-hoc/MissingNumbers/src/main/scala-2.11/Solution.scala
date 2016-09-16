
object Solution {

    private def mapKeys(keyValues: (Int, List[Int])): Int = keyValues._1

    def main(args: Array[String]): Unit = {
        val lines = io.Source.stdin.getLines
        val n = lines.next.toInt
        val ns = lines.next.split(" ").map(_.toInt).toList
        val m = lines.next.toInt
        val ms = lines.next.split(" ").map(_.toInt).toList

        val remainder = ms.groupBy(identity).toSet -- ns.groupBy(identity).toSet

        println(remainder.map(mapKeys).toList.sortBy(identity).mkString(" "))

    }
}