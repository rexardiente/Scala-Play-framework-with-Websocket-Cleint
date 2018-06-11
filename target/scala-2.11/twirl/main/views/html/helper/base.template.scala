
package views.html.helper

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object base_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._
import ejisan.play.libs.PageMeta

class base extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[Html,Html,Html,RequestHeader,Messages,PageMeta,WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(header: Html = Html(""))(content: Html)(footer: Html = Html(""))(implicit requestHeader: RequestHeader, messages: Messages, pageMeta: PageMeta, wja: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.165*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang=""""),_display_(/*3.14*/messages/*3.22*/.lang.code),format.raw/*3.32*/("""">
<head>
  <meta charset="UTF-8">
  """),_display_(/*6.4*/pageMeta/*6.12*/.toHtml),format.raw/*6.19*/("""
  """),format.raw/*7.3*/("""<link href=""""),_display_(/*7.16*/routes/*7.22*/.Assets.at("styles/global.css")),format.raw/*7.53*/("""" rel="stylesheet">
  <link href=""""),_display_(/*8.16*/routes/*8.22*/.Assets.at("styles/global.min.css")),format.raw/*8.57*/("""" rel="stylesheet">
  <link rel="stylesheet" media="screen" href=""""),_display_(/*9.48*/routes/*9.54*/.WebJarAssets.at(wja.locate("bootstrap.min.css"))),format.raw/*9.103*/("""">
  """),format.raw/*10.22*/("""
  """),format.raw/*11.3*/("""<script src=""""),_display_(/*11.17*/routes/*11.23*/.WebJarAssets.at(wja.locate("jquery.min.js"))),format.raw/*11.68*/(""""></script>
  <script src=""""),_display_(/*12.17*/routes/*12.23*/.WebJarAssets.at(wja.locate("foundation.js"))),format.raw/*12.68*/(""""></script>
  <script src='"""),_display_(/*13.17*/routes/*13.23*/.WebJarAssets.at(wja.locate("riot.min.js"))),format.raw/*13.66*/("""'></script>
  <script src='"""),_display_(/*14.17*/routes/*14.23*/.WebJarAssets.at(wja.locate("lodash.min.js"))),format.raw/*14.68*/("""'></script>
  <script src=""""),_display_(/*15.17*/routes/*15.23*/.WebJarAssets.at(wja.locate("bootstrap.js"))),format.raw/*15.67*/(""""></script>
  """),_display_(/*16.4*/header),format.raw/*16.10*/("""
"""),format.raw/*17.1*/("""</head>
<body>
  """),_display_(/*19.4*/content),format.raw/*19.11*/("""

  """),_display_(/*21.4*/footer),format.raw/*21.10*/("""
"""),format.raw/*22.1*/("""</body>
</html>
"""))
      }
    }
  }

  def render(header:Html,content:Html,footer:Html,requestHeader:RequestHeader,messages:Messages,pageMeta:PageMeta,wja:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(header)(content)(footer)(requestHeader,messages,pageMeta,wja)

  def f:((Html) => (Html) => (Html) => (RequestHeader,Messages,PageMeta,WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (header) => (content) => (footer) => (requestHeader,messages,pageMeta,wja) => apply(header)(content)(footer)(requestHeader,messages,pageMeta,wja)

  def ref: this.type = this

}


}

/**/
object base extends base_Scope0.base
              /*
                  -- GENERATED --
                  DATE: Mon Jun 11 13:11:55 PHT 2018
                  SOURCE: /Users/rcadiente/Documents/GitHub/ProvestRE/app/views/helper/base.scala.html
                  HASH: ba08669f00a3d14d977e03e0613d7ba394187b72
                  MATRIX: 618->1|877->164|904->165|959->194|975->202|1005->212|1068->250|1084->258|1111->265|1140->268|1179->281|1193->287|1244->318|1305->353|1319->359|1374->394|1467->461|1481->467|1551->516|1584->540|1614->543|1655->557|1670->563|1736->608|1791->636|1806->642|1872->687|1927->715|1942->721|2006->764|2061->792|2076->798|2142->843|2197->871|2212->877|2277->921|2318->936|2345->942|2373->943|2417->961|2445->968|2476->973|2503->979|2531->980
                  LINES: 21->1|26->1|27->2|28->3|28->3|28->3|31->6|31->6|31->6|32->7|32->7|32->7|32->7|33->8|33->8|33->8|34->9|34->9|34->9|35->10|36->11|36->11|36->11|36->11|37->12|37->12|37->12|38->13|38->13|38->13|39->14|39->14|39->14|40->15|40->15|40->15|41->16|41->16|42->17|44->19|44->19|46->21|46->21|47->22
                  -- GENERATED --
              */
          