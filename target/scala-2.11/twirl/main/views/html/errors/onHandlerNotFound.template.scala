
package views.html.errors

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object onHandlerNotFound_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import ejisan.play.libs.PageMeta

class onHandlerNotFound extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.26*/("""

"""),_display_(/*3.2*/("Handler Not Found")),format.raw/*3.23*/(""" """),format.raw/*3.24*/("""{"""),format.raw/*3.25*/("""

  """),format.raw/*5.3*/("""<h1>Handler Not Found</h1>
  <p>You requested: """),_display_(/*6.22*/request/*6.29*/.path),format.raw/*6.34*/("""</p>

"""),format.raw/*8.1*/("""}"""),format.raw/*8.2*/("""
"""))
      }
    }
  }

  def render(request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(request)

  def f:((RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (request) => apply(request)

  def ref: this.type = this

}


}

/**/
object onHandlerNotFound extends onHandlerNotFound_Scope0.onHandlerNotFound
              /*
                  -- GENERATED --
                  DATE: Mon Jun 11 14:45:08 PHT 2018
                  SOURCE: /Users/rcadiente/Documents/GitHub/ProvestRE/app/views/errors/onHandlerNotFound.scala.html
                  HASH: 3d84055ca2edf3d3c8be7d95f49814024a24dbd8
                  MATRIX: 598->1|717->25|745->28|786->49|814->50|842->51|872->55|946->103|961->110|986->115|1018->121|1045->122
                  LINES: 21->1|26->1|28->3|28->3|28->3|28->3|30->5|31->6|31->6|31->6|33->8|33->8
                  -- GENERATED --
              */
          