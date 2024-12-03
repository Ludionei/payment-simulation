package com.destaxa.server.protocol;

public class ISO8583Response0210 extends ISO8583 {

    private String nsuHost;
    private String codigoAutorizacao;
    private String codigoResposta;

    public String getNsuHost() {
        return nsuHost;
    }

    public void setNsuHost(String nsuHost) {
        this.nsuHost = nsuHost;
    }

    public String getCodigoAutorizacao() {
        return codigoAutorizacao;
    }

    public void setCodigoAutorizacao(String codigoAutorizacao) {
        this.codigoAutorizacao = codigoAutorizacao;
    }

    public String getCodigoResposta() {
        return codigoResposta;
    }

    public void setCodigoResposta(String codigoResposta) {
        this.codigoResposta = codigoResposta;
    }

}