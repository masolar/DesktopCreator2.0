package scala.views

import java.awt.Dimension
import java.awt.image.BufferedImage

import javax.imageio.ImageIO
import javax.swing.{ImageIcon, JFrame, JLabel, WindowConstants}
import models.modeladapters.ModelAdapter

case class BasicView(private val model: ModelAdapter) {
  val screen = new JFrame("App")

  def start = {
    screen.setSize(new Dimension(800, 600))
    screen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)

    initGUI
  }

  def initGUI = {
    screen.setVisible(true)
  }


  // Fix this. View shouldn't be worried about calculating the input
  def displayImages(pixels: Seq[Seq[Seq[Float]]]) = {
    val image:BufferedImage = new BufferedImage(800, 600, BufferedImage.TYPE_4BYTE_ABGR)
    screen.add(new JLabel(new ImageIcon(image)))
  }

}
