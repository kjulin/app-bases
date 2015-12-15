import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import io.finch.response.Ok

import io.finch._
import io.finch.jackson._

import scala.util.control.NonFatal

case class TestResponse(operation: String, result: String)

object Router {

  implicit val objectMapper: ObjectMapper = new ObjectMapper().registerModule(DefaultScalaModule)

  val api = ((

      get("api" / "test") { Ok(TestResponse("Testing", "Done!"))}

    ) handle {
    case NonFatal(e) => InternalServerError("err" -> e.getMessage)
  }).toService
}
