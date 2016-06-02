object Solution extends App {

    override def main(args: Array[String]): Unit = {
        println(f(20))
    }

    def f(x: Float): Float = {
        1 + (1 to 9).map(n => power(x, n)).sum
    }

    def power(x: Float, n: Int): Float = (scala.math.pow(x, n) / factorial(n)).toFloat

    def factorial(n: Int): Int = {
        if (n == 0) 1
        else n * factorial(n - 1)
    }

}

(λg.((λf.((λx.(f (x x)))(λx.(f (x x))))) g))