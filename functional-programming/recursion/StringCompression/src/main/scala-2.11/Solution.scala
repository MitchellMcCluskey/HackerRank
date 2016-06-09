object Solution {

    def compress(string: List[Char], repetition: Int): List[Char] = {
        string match {
            case x::y::xs =>
                if (x == y) compress(y::xs, repetition + 1)
                else {
                    if (repetition > 1) x::repetition.toString.toList:::compress(y::xs, 1)
                    else x::compress(y::xs, 1)
                }
            case x::_ =>
                if (repetition > 1) x::repetition.toString.toList:::compress(Nil, 1)
                else x::compress(Nil, 1)
            case Nil => Nil
        }
    }

    def main(args: Array[String]): Unit = println(compress(io.Source.stdin.getLines.next.toList, 1).mkString)
}