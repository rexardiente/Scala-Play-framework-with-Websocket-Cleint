
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object page_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import ejisan.play.libs.PageMeta

class page extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[RequestHeader,Messages,PageMeta,WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit header: RequestHeader, messages: Messages, pm: PageMeta, wja: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.89*/("""
"""),_display_(/*2.2*/helper/*2.8*/.base/*2.13*/ {_display_(Seq[Any](format.raw/*2.15*/("""
  """),format.raw/*3.3*/("""<link href=""""),_display_(/*3.16*/routes/*3.22*/.Assets.at("styles/main.css")),format.raw/*3.51*/("""" rel="stylesheet">
""")))}/*4.2*/ {_display_(Seq[Any](format.raw/*4.4*/("""
  """),format.raw/*5.3*/("""<div class="container" id="content"></div>
""")))}/*6.2*/ {_display_(Seq[Any](format.raw/*6.4*/("""
  """),format.raw/*7.3*/("""<script src="https://cdn.jsdelivr.net/riotgear/latest/rg.min.js"></script>

  <script src=""""),_display_(/*9.17*/routes/*9.23*/.Assets.at("comps/dashboard.js")),format.raw/*9.55*/(""""></script>
  <script src=""""),_display_(/*10.17*/routes/*10.23*/.Assets.at("comps/auth/sign-in.js")),format.raw/*10.58*/(""""></script>
  <script src=""""),_display_(/*11.17*/routes/*11.23*/.Assets.at("comps/auth/sign-up.js")),format.raw/*11.58*/(""""></script>
  <script src=""""),_display_(/*12.17*/routes/*12.23*/.Assets.at("scripts/app.js")),format.raw/*12.51*/(""""></script>
""")))}),format.raw/*13.2*/("""
"""))
      }
    }
  }

  def render(header:RequestHeader,messages:Messages,pm:PageMeta,wja:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply()(header,messages,pm,wja)

  def f:(() => (RequestHeader,Messages,PageMeta,WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = () => (header,messages,pm,wja) => apply()(header,messages,pm,wja)

  def ref: this.type = this

}


}

/**/
object page extends page_Scope0.page
              /*
                  -- GENERATED --
                  DATE: Mon Jun 11 14:26:11 PHT 2018
                  SOURCE: /Users/rcadiente/Documents/GitHub/ProvestRE/app/views/page.scala.html
                  HASH: 4af98464f29ee51fa2cbd00b64c423c50e2a9de7
                  MATRIX: 596->1|778->88|805->90|818->96|831->101|870->103|899->106|938->119|952->125|1001->154|1039->175|1077->177|1106->180|1167->224|1205->226|1234->229|1352->321|1366->327|1418->359|1473->387|1488->393|1544->428|1599->456|1614->462|1670->497|1725->525|1740->531|1789->559|1832->572
                  LINES: 21->1|26->1|27->2|27->2|27->2|27->2|28->3|28->3|28->3|28->3|29->4|29->4|30->5|31->6|31->6|32->7|34->9|34->9|34->9|35->10|35->10|35->10|36->11|36->11|36->11|37->12|37->12|37->12|38->13
                  -- GENERATED --
              */
          