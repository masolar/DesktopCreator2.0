package functions

import java.awt.Color

trait ArgFunctionBase {
  def getPixel(x: Float, y: Float, alpha: Float): Seq[Float]
}
