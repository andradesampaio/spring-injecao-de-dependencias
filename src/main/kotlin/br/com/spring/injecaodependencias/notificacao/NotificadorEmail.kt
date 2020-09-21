package br.com.spring.injecaodependencias.notificacao

import br.com.spring.injecaodependencias.notificacao.model.Cliente


class NotificadorEmail :Notificador{

    private var caixaAlta = false
    private var hostServidorSmtp: String? = null

    constructor(hostServidorSmtp: String?) {
        this.hostServidorSmtp = hostServidorSmtp
        println("NotificadorEmail")
    }


    override fun notificar(cliente: Cliente?, mensagem: String?) {
        var newMensagem: String? = null

        if (this.caixaAlta) {
            newMensagem = mensagem!!.toUpperCase()
        }

        println("Notificando: ${cliente?.nome} através do e-mail: ${cliente?.email}, host: ${this.hostServidorSmtp}, ${newMensagem}")
    }

    fun setCaixaAlta(caixaAlta: Boolean) {
        this.caixaAlta = caixaAlta
    }


//    fun notificar(cliente: Cliente?, mensagem: String?) {
//        println("Notificando: ${cliente?.nome} através do e-mail: ${cliente?.email}, ${mensagem}" )
//    }
}