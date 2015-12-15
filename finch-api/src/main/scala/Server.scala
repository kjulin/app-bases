import com.twitter.finagle.Http
import com.twitter.server.TwitterServer
import com.twitter.util.Await

object Environment {
  def get = sys.env.get("APPENV").getOrElse("development")
  def port = sys.env.get("APPPORT").getOrElse("8091")
}

object Server extends TwitterServer {

  def main() {

    val server = Http.server.serve(s":${Environment.port}", Router.api)
    onExit { server.close() }

    Await.ready(adminHttpServer)
  }
}
