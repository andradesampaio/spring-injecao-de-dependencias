package br.com.spring.injecaodependencias.notificacao

import br.com.spring.injecaodependencias.notificacao.model.Cliente
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

//@Primary
@Qualifier("urgente")
@Component
class NotificadorEmail(var properties: NotificadorProperties): Notificador {

    override
    fun notificar(cliente: Cliente?, mensagem: String?) {
        println("Host: " + properties.hostServidor);
        println("Porta: " + properties.portaServidor);
        println("Notificando ${cliente!!.nome} através do Email ${cliente!!.email}: ${mensagem}")
    }
}