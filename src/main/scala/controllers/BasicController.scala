package scala.controllers

import models.BasicModel
import models.modeladapters.BasicModelAdapter
import views.viewadapters.BasicViewAdapter

import scala.views.BasicView

object BasicController {
  val model: BasicModel = BasicModel(new BasicViewAdapter{})
  val view: BasicView = BasicView(new BasicModelAdapter {})

  def main(args: Array[String]) = {
    start
  }

  def start = {
    model.start
    view.start
  }
}
