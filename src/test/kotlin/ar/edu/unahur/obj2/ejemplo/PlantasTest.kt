package ar.edu.unahur.obj2.ejemplo

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.shouldBe


class EspeciesTest : DescribeSpec({
  describe("Probando la Menta") {
    val menta = Menta(2022,1.0)
    val mentita = Menta(2018,0.3)
    it("Menta con semillas y espaciosa") {
      menta.daSemillas().shouldBeTrue()
      menta.espacio().shouldBe(2.0)
    }
    it("Menta sin semillas y pequeña"){
      mentita.daSemillas().shouldBeFalse()
      mentita.espacio().shouldBe(1.3)
    }
  }
  describe("Probando la Soja"){
    val soja = Soja(2008,0.8) // Da semillas
    val sojita = Soja(2007,0.76) // No da semillas por anio
    val sojilenta = Soja(2015,0.9) // no da semillas altura mayor
    val soj = Soja(2011,0.4) // no da semillas altura menor}
    val ultimaSoja = Soja(2015 , 1.1)
    val testEjemplo = Soja(2009,0.6)
    it("Sojas Test de semillas por anio"){
      soja.daSemillas().shouldBeTrue()
      sojita.daSemillas().shouldBeFalse()
      sojilenta.daSemillas().shouldBeTrue()
      soj.daSemillas().shouldBeFalse()
      ultimaSoja.daSemillas().shouldBeTrue()
    }
    it("Soja Test ejemplo enunciado"){
      testEjemplo.daSemillas().shouldBeFalse()
      testEjemplo.horasDeSolToleradas().shouldBe(8)

    }
    it("Sojas Test espacio"){
      soja.espacio().shouldBe(0.4)
      sojita.espacio().shouldBe(0.38)
      sojilenta.espacio().shouldBe(0.45)
      soj.espacio().shouldBe(0.2)
    }

  }
})
