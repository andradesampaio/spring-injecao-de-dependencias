package br.com.spring.injecaodependencias.notificacao

import br.com.spring.injecaodependencias.notificacao.model.Cliente
import br.com.spring.injecaodependencias.notificacao.service.AtivacaoClienteService

fun main(){

    val joao = Cliente("João", "joao@xyz.com", "3499998888")
    val maria = Cliente("Maria", "maria@xyz.com", "1177772222")


    val notificador = NotificadorEmail("smtp.algamail.com.br")
//
    val ativacaoCliente = AtivacaoClienteService(notificador)
    ativacaoCliente.ativar(joao)
//    ativacaoCliente.ativar(maria)
}