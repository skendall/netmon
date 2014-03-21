package org.kndl.controller

import play.api.mvc.{Action, Controller}
import play.api.libs.json.{JsObject, Json}

/**
 *
 *
 *
 */
object AbstractController extends Controller {

  def get = Action {
    Ok(okMessage(0,"OK",Json.obj("key" -> "value")))
  }

  def post = Action(parse.json) { request =>
    Ok(okMessage(0,"OK",Json.obj("key" -> "value")))
  }

  def okMessage(code: Int, msg: String, data: JsObject) = { Json.obj("code" -> 0, "message" -> "Ok", "data" -> data) }

}
