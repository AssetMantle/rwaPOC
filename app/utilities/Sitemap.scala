package utilities

import controllers.routes
import play.api.mvc.Call

import scala.xml.Elem

case class Sitemap(call: Call, priority: Double = 0.5, changeFrequency: String = "weekly") {

  def location = s"${constants.CommonConfig.WebAppUrl}${this.call.url}"

  def urlElement: Elem = <url>
    <loc>
      {this.location}
    </loc>
    <changefreq>
      {this.changeFrequency}
    </changefreq>
    <priority>
      {this.priority}
    </priority>
  </url>
}

object Sitemap {

  val allElements: Seq[Sitemap] = Seq(
    Sitemap(routes.IndexController.index(), 1.0),
    Sitemap(routes.SecondaryMarketController.view(), 0.98),
  )


  def generate: Elem = <urlset xmlns="http://www.sitemaps.org/schemas/sitemap/0.9">
    {allElements.map(_.urlElement)}
  </urlset>
}
