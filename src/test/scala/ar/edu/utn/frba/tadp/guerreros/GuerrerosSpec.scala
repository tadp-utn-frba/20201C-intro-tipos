package ar.edu.utn.frba.tadp.guerreros

import org.scalatest.{FreeSpec, Matchers}

class GuerrerosSpec extends FreeSpec with Matchers {

  "Un guerrero" - {
    "cuando ataca a otro guerrero, éste pierde energía" in {
      val atila = new Guerrero()
      val conan = new Guerrero()

      atila.atacarA(conan)

      assert(conan.energia == 80)
    }
  }

  "Un espadachin" - {
    "cuando ataca a otro guerrero, éste pierde energía" in {
      val zorro = new Espadachin(new Espada(20))
      val conan = new Guerrero()

      zorro.atacarA(conan)

      assert(conan.energia == 60)
    }
  }

  "Una muralla" - {
    "recibe un ataque" in {
      val atila = new Guerrero()
      val murallaChina = new Muralla()

      atila.atacarA(murallaChina)

      assert(murallaChina.energia == 90)
    }
  }

  "Una misil" - {
    "ataca a un guerrero" in {
      val atila = new Guerrero()
      val misil = new Misil()

      misil.atacarA(atila)

      assert(atila.energia == 10)
    }
  }

}