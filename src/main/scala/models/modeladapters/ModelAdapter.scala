package models.modeladapters

trait ModelAdapter {
  def createImages(numImages: Int, width: Int, height: Int): Unit
}
