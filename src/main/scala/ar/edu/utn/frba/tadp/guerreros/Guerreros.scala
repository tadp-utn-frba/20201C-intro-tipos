package ar.edu.utn.frba.tadp.guerreros

class Guerrero(_potencialOfensivo: Int = 40, _potencialDefensivo: Int = 20)
  extends Defensor
    with Atacante {
  def potencialDefensivo: Int = _potencialDefensivo

  def potencialOfensivo: Int = _potencialOfensivo
}

class Espadachin(espada: Espada, _potencialOfensivo: Int = 40, _potencialDefensivo: Int = 20)
  extends Guerrero(_potencialOfensivo, _potencialDefensivo) {
  override def potencialOfensivo: Int =
    super.potencialOfensivo + espada.potencialOfensivo
}

class Espada(val potencialOfensivo: Int)

trait Defensor {
  var energia: Int = 100

  def potencialDefensivo: Int

  def recibiDaño(daño: Int) = this.energia -= daño
}

trait Atacante {
  def potencialOfensivo: Int

  def atacarA(defensor: Defensor) = {
    if (defensor.potencialDefensivo < potencialOfensivo) {
      defensor.recibiDaño(potencialOfensivo - defensor.potencialDefensivo)
    }
  }
}

class Muralla(_potencialDefensivo: Int = 30) extends Defensor {
  def potencialDefensivo: Int = _potencialDefensivo
}

class Misil(val potencialOfensivo: Int = 110) extends Atacante
