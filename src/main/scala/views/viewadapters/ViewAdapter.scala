package views.viewadapters

trait ViewAdapter {
  def displayImages(numImages: Int, pixels: Seq[Seq[Seq[Float]]])
}
