package tbje.facelift

class Example {

  import Html._
  import css._

  object FirstPage {
    val titleId = Id("title")
    val titleClass = Class("wide", "cool")
    val titleStyle = Style(Color.Green, MarginPx(45, 20, 10, 10), 'paddingLeft -> "10px")
    val html = <html><body>{ <h1></h1> % titleId % titleClass % titleStyle } </body></html>
  }

  class Form {
    case class Input(initialValue: String, name: String) // Might want to set name.
    val action = ""
    val fields = Seq(Input("test", "name"))
    val validations = ""
  }

  object CssTest {
    import CssSelector._
    val css =
      new CssElement(H1, Class("tst"), A)(
        Color.Green,
        MarginPx(10, 20, 10, 20),
        'marginLeft -> "auto",
        "margin-left" -> "auto",
        'paddingLeft -> "10px",
        FontSizeEm(1.3))
    val css2 =
      new CssElement(Id("link"))(
        'paddingLeft -> "20px",
        'boxShadow -> "auto",
        'boxShadow -> "0 2px 5px rgba(0,0,0,.3)",
        WidthPx(340),
        Margin("30px auto 0"),
        Color.Chartreuse,
        PaddingPx(30),
        TextAlign.Center,
        FontSizePx(18),
        BackgroundColor("#F5F5F5"))

  }

}