package controllers

import javax.inject._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext
import scala.concurrent.ExecutionContext.Implicits.global
import akka.actor._
import akka.stream._
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.mvc.WebSocket._
import play.api.data.Forms._
import play.api.libs.json._
import play.api.libs.streams._
import play.api.i18n.{ I18nSupport, MessagesApi }
import actors._

import ejisan.play.libs.{ PageMetaSupport, PageMetaApi }

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject() (
  implicit val system: ActorSystem,
  implicit val materializer: Materializer,
  val messagesApi: MessagesApi,
  val pageMetaApi: PageMetaApi,
  implicit val wja: WebJarAssets
) extends Controller with I18nSupport with PageMetaSupport {
  implicit val messageFlowTransformer = MessageFlowTransformer.jsonMessageFlowTransformer[JsValue, JsValue]
  /**
   * Create an Action to render an HTML page.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */

  def ws = WebSocket.accept[JsValue, JsValue] { implicit request =>
    ActorFlow.actorRef(out => ClientManagerActor.props(out))
  }

  def index = Action { implicit request =>
    println("Testing")
    Ok(views.html.page())
  }
}
