def sumOfSquaresOfTwoLarger(xs: Int*): Int = {
  require(xs.nonEmpty)

  def square(x: Int): Int = {
    x * x
  }

  xs.map(square).sum - square(xs.min)
}
