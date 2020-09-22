package br.com.spring.injecaodependencias.notificacao

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties("notificador.email")
class NotificadorProperties{
    lateinit var hostServidor: String
    lateinit var portaServidor: Integer
}