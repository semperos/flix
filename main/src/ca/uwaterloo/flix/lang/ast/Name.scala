package ca.uwaterloo.flix.lang.ast

object Name {

  case class Resolved(parts: List[String]) {
    val format: String = parts.mkString(",")
  }

}