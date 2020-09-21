package br.com.spring.injecaodependencias.notificacao.model

import java.math.BigDecimal

data class Produto(
         var nome: String?,
         var valorTotal: BigDecimal?
) {
}