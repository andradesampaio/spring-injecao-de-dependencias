package br.com.spring.injecaodependencias.notificacao.service

import br.com.spring.injecaodependencias.notificacao.Notificador
import br.com.spring.injecaodependencias.notificacao.model.Cliente
import br.com.spring.injecaodependencias.notificacao.model.Produto


class EmissaoNotaFiscalService {

    private var notificador: Notificador?

    constructor (notificador: Notificador?) {
        this.notificador = notificador
    }

    fun emitir(cliente: Cliente?, produto: Produto) {
        // TODO emite a nota fiscal aqui...
        notificador!!.notificar(cliente, ("Nota fiscal do produto "
                + produto.nome) + " foi emitida!")
    }
}