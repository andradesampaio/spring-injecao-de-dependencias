package br.com.spring.injecaodependencias

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class InjecaoDependenciasApplication

fun main(args: Array<String>) {
	runApplication<InjecaoDependenciasApplication>(*args)
}
