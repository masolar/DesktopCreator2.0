package functions

import functions.zero_arg.{ConstantFunction, XFunction, YFunction, ZeroArgFunction}
import scala.util.Random

/**
  * Creates a function for generating images
  */
object FuncGenerator {
  val leaves: Seq[() => ZeroArgFunction] = Seq(() => XFunction(), () => YFunction())
  val branches = ???

  def generateFunction(minDepth: Int, maxDepth: Int) = {
    def generateFunctionHelper(minDepth: Int, maxDepth: Int, currDepth: Int): ArgFunctionBase = {
      if (currDepth == maxDepth) {
        getRandomFunction(leaves) match {
          case one_arg: (() => ZeroArgFunction) => one_arg()
          case _ => XFunction()
        }
      }
      generateFunctionHelper(minDepth, maxDepth, currDepth + 1)
    }
    generateFunctionHelper(minDepth, maxDepth, 1)
  }

  //def generateFunction(functionString: String) = ???

  def getRandomFunction(functions: Seq[Any]) = {
    functions(Random.nextInt(functions.length))
  }
}
