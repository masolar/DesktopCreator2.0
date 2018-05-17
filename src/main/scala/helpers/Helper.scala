package helpers

object Helper {
  def clampInclusive(value: Float, min: Float, max: Float) = if (value < min) min else if (value > max) max else value
}
