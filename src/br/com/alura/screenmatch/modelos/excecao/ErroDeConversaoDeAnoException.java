package br.com.alura.screenmatch.modelos.excecao;

import br.com.alura.screenmatch.principal.Principal;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;
    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
