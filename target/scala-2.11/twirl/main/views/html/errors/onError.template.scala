
package views.html.errors

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object onError_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import ejisan.play.libs.PageMeta

class onError extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Throwable,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(throwable: Throwable):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""

"""),_display_(/*3.2*/("onError Happened")),format.raw/*3.22*/(""" """),format.raw/*3.23*/("""{"""),format.raw/*3.24*/("""

  """),format.raw/*5.3*/("""<h1>onError Happened</h1>
  <p>"""),_display_(/*6.7*/throwable/*6.16*/.getMessage),format.raw/*6.27*/("""</p>

"""),format.raw/*8.1*/("""}"""),format.raw/*8.2*/("""
"""))
      }
    }
  }

  def render(throwable:Throwable): play.twirl.api.HtmlFormat.Appendable = apply(throwable)

  def f:((Throwable) => play.twirl.api.HtmlFormat.Appendable) = (throwable) => apply(throwable)

  def ref: this.type = this

}


}

/**/
object onError extends onError_Scope0.onError
              /*
                  -- GENERATED --
                  DATE: Mon Jun 11 14:46:31 PHT 2018
                  SOURCE: /Users/rcadiente/Documents/GitHub/ProvestRE/app/views/errors/onError.scala.html
                  HASH: 4df39dcdb6e7ece8ef567a56181cbf5b87dcbf03
                  MATRIX: 574->1|691->23|719->26|759->46|787->47|815->48|845->52|902->84|919->93|950->104|982->110|1009->111
                  LINES: 21->1|26->1|28->3|28->3|28->3|28->3|30->5|31->6|31->6|31->6|33->8|33->8
                  -- GENERATED --
              */
          