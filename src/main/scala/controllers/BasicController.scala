package scala.controllers

import models.BasicModel
import models.modeladapters.BasicModelAdapter
import views.viewadapters.BasicViewAdapter

import scala.views.BasicView

object BasicController {

  var model: BasicModel = _
  var view: BasicView = _

  model = BasicModel(new BasicViewAdapter{
    override def displayImages(numImages: Int, pixels: Seq[Seq[Seq[Float]]]): Unit = ???
  })
  view = BasicView(new BasicModelAdapter {
    override def createImages(numImages: Int, width: Int, height: Int): Unit = model.createImages(numImages, width, height)
  })

  def main(args: Array[String]) = {
    start
  }

  def start = {
    model.start
    view.start
  }
}
