package br.com.spring.injecaodependencias.notificacao

import br.com.spring.injecaodependencias.notificacao.model.Cliente
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Qualifier("normal")
@Component
class NotificadorSMS: Notificador {

    override
    fun notificar(cliente: Cliente?, mensagem: String?) {
        println("Notificando ${cliente!!.nome} por SMS através do telefone ${cliente!!.telefone}: ${mensagem}")
    }
}