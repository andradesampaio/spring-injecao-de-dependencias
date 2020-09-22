package br.com.spring.injecaodependencias.notificacao.service

import br.com.spring.injecaodependencias.notificacao.Notificador
import br.com.spring.injecaodependencias.notificacao.model.Cliente
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Component

@Component
class AtivacaoClienteService(@Qualifier("urgente") private var notificador: Notificador) {

    fun ativar(cliente: Cliente) {
        cliente.ativar()
         notificador!!.notificar(cliente, "Seu cadastro no sistema está ativo!")
    }
}