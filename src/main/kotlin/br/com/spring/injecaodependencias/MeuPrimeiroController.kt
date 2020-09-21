package br.com.spring.injecaodependencias

import br.com.spring.injecaodependencias.notificacao.Notificador
import br.com.spring.injecaodependencias.notificacao.model.Cliente
import br.com.spring.injecaodependencias.notificacao.service.AtivacaoClienteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*



@RequestMapping("/v1", produces = [(MediaType.APPLICATION_JSON_VALUE)])
@RestController
class MeuPrimeiroController(private val ativacaoCliente: AtivacaoClienteService) {

    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.OK)
    fun hello(): String? {
        val joao = Cliente("João", "joao@xyz.com", "3499998888")
        ativacaoCliente.ativar(joao)
        return "Hello world.!"
    }

}