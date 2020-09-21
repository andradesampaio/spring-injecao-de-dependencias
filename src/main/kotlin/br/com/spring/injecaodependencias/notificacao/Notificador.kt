package br.com.spring.injecaodependencias.notificacao

import br.com.spring.injecaodependencias.notificacao.model.Cliente

interface Notificador {
    fun notificar(cliente: Cliente?, mensagem: String?)
}