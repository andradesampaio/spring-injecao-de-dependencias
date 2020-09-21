package br.com.spring.injecaodependencias.notificacao

import br.com.spring.injecaodependencias.notificacao.model.Cliente
import org.springframework.stereotype.Component

//@Component
class NotificadorSMS: Notificador {

    override
    fun notificar(cliente: Cliente?, mensagem: String?) {
        println("Notificando ${cliente!!.nome} por SMS através do telefone ${cliente!!.telefone}: ${mensagem}")
    }
}