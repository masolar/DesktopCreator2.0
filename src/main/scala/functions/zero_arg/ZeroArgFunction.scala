/**
  Represents all functions that do not call on other functions. Essentially, these are the
  leaves of the function tree.
  **/

package functions.zero_arg

import java.awt.Color

import functions.ArgFunctionBase
import helpers.Helper._

trait ZeroArgFunction extends ArgFunctionBase

case class XFunction(alpha: Float) extends ZeroArgFunction {
  override def getPixel(x: Float, y: Float) = {
    Seq[Float](x, x, x, alpha) map {clampInclusive(_, 0.0f, 1.0f)}
  }
}

case class YFunction(alpha: Float) extends ZeroArgFunction {
  override def getPixel(x: Float, y: Float) = {
    Seq[Float](y, y, y, alpha) map {clampInclusive(_, 0.0f, 1.0f)}
  }
}

case class ConstantFunction(value: Float, alpha: Float) extends ZeroArgFunction {
  override def getPixel(x: Float, y: Float) = {
    Seq[Float](value, value, value, alpha) map {clampInclusive(_, 0.0f, 1.0f)}
  }
}