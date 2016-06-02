object Solution extends App {

    override def main(args: Array[String]): Unit = {
        println(area(List(1, 2, 3, 4, 5), List(6, 7, 8, 9, 10), 2))
    }

    val stepsPerUnit = 1000
    val stepSize = 1f / stepsPerUnit

    def f(coefficients: List[Int], powers: List[Int], x: Double): Double =
        coefficients.zip(powers).map(term => evaluateTerm(term._1, term._2, x)).sum

    def evaluateTerm(coefficient: Int, power: Int, x: Double): Double = coefficient * scala.math.pow(x, power)

    def area(coefficients: List[Int], powers: List[Int], x: Double): Double =
        scala.math.Pi * scala.math.pow(f(coefficients, powers, x), 2)

    def summation(func:(List[Int], List[Int], Double)
        => Double, upperLimit: Int, lowerLimit: Int, coefficients: List[Int], powers: List[Int]): Double =
        Range.Double(lowerLimit, upperLimit, stepSize).map(func(coefficients, powers, _)).sum / stepsPerUnit

}