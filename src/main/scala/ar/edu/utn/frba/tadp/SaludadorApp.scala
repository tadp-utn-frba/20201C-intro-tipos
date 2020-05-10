package ar.edu.utn.frba.tadp

object SaludadorApp extends App {
  println(new Saludador().saludar(new Persona("Ernesto")))
  println(new Saludador(true).saludar(new Persona("Ernesto")))
  println(new Saludador(true).saludar(
    new AsistenteVirtual("Siri")))
}

trait Nombrable {
  def nombre: String
}

class Persona(val nombre: String) extends Nombrable
class AsistenteVirtual(val nombre: String) extends Nombrable

class Saludador(cordial: Boolean = false) {
  def saludar(a: Nombrable) = {
    if(cordial) {
      "Buenos días estimado/a " + a.nombre
    } else {
      "Holiiiissss"
    }
  }
}



