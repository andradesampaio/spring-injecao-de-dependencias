package br.com.spring.injecaodependencias.notificacao.model

data class Cliente(
         var nome: String?,
         var email: String?,
         var telefone: String?,
         var ativo: Boolean? = false
){
    fun ativar() {
        this.ativo = true
    }
}