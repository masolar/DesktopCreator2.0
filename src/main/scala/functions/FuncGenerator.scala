package functions

import functions.zero_arg.{ConstantFunction, XFunction, YFunction, ZeroArgFunction}
import scala.util.Random

/**
  * Creates a function for generating images
  */
object FuncGenerator {
  val leaves: Seq[(Int) => ZeroArgFunction] = Seq((i) => XFunction(i), (i) => YFunction(i))
  val branches = _

  def generateFunction(minDepth: Int, maxDepth: Int): ZeroArgFunction = {
    def generateFunctionHelper(minDepth: Int, maxDepth: Int, currDepth: Int) = {
      if (currDepth == maxDepth) {
        getRandomFunction(leaves) match {
          case one_arg: ((Int) => ZeroArgFunction) => one_arg(Random.nextFloat())
        }
      }
    }
    generateFunctionHelper(minDepth, maxDepth, 1)
  }

  def generateFunction(functionString: String)

  def getRandomFunction(functions: Seq[Any]) = {
    functions(Random.nextInt(functions.length))
  }
}
