package br.com.spring.injecaodependencias.notificacao

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class NotificacaoConfig {

    @Bean
    fun notificadorEmail(): NotificadorEmail? {
        val notificador = NotificadorEmail("smtp.algamail.com.br")
        notificador.setCaixaAlta(true)
        return notificador
    }

}