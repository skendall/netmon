package controllers

import play.api.mvc.{Action, Controller}

/**
 *
 *
 *
 */
object HostController extends Controller {

  def index = Action {
    Ok(views.html.hosts())
  }

  def getHosts = Action {
    Ok("getHosts not implemented yet")
  }

  def getHost(id: String) = Action {
    Ok("getHosts not implemented yet")
  }

  def addHost = Action {
    Ok("addHost not implemented yet")
  }

  def updateHost = Action {
    Ok("updateHost not implemented yet")
  }


}
