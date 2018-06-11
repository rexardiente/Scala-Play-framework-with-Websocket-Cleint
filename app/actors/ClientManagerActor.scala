package actors

import javax.inject._
import java.{util, time}
import scala.concurrent.ExecutionContext.Implicits._
import scala.concurrent.duration._
import akka.actor._
import akka.pattern.ask
import play.api.Logger
import play.api.libs.json._
import ClientManagerActor._

object ClientManagerActor {
  def props[T <: ActorRef](out: T) =
   Props(classOf[ClientManagerActor], out)
}

@Singleton
class ClientManagerActor(out: ActorRef) extends Actor {
  override def preStart() = {
    super.preStart
    println("Starting..")
    out ! Json.obj("response" -> "Starting Provest Project")
  }

  override def receive: Receive = {
    case json: JsValue => out ! Json.obj("Json" -> json.toString)
  }
}

