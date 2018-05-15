package scala.views

import java.awt.Dimension

import javax.swing.{JFrame, WindowConstants}
import models.modeladapters.ModelAdapter

case class BasicView(private val model: ModelAdapter) {
  val screen = new JFrame("App")

  def start = {
    screen.setSize(new Dimension(800, 600))
    screen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)
    screen.setVisible(true)
  }




}
