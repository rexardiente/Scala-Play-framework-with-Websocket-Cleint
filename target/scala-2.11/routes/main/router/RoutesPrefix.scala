
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/rcadiente/Documents/GitHub/ProvestRE/conf/routes
// @DATE:Mon Jun 11 15:34:42 PHT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
