package main.java.com.gabrielspassos.poc;

import java.io.IOException;

public class AnalisadorSintatico extends Parser {

    public AnalisadorSintatico(String codeFileName) throws IOException {
        super(codeFileName);
    }

    @Override
    public Boolean parse() {
        return analisaMiniJava();
    }

    private Boolean analisaMiniJava() {
        return analisaClass();
    }

    private Boolean analisaClass() {
        fetchToken();
        if(Tipo.SCLASS.equals(token.getTipo())) {
            fetchToken();
            if(Tipo.SIDENTIFICADOR.equals(token.getTipo())) {
                fetchToken();
                if (Tipo.SABRE_CHAVES.equals(token.getTipo())){
                    fetchToken();
                    if (analisaMain()) {
                        fetchToken();
                        if (Tipo.SFECHA_CHAVES.equals(token.getTipo())) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private Boolean analisaMain() {
        if (Tipo.SPUBLIC.equals(token.getTipo())) {
            fetchToken();
            if (Tipo.SSTATIC.equals(token.getTipo())) {
                fetchToken();
                if(Tipo.SVOID.equals(token.getTipo())) {
                    fetchToken();
                    if (Tipo.SMAIN.equals(token.getTipo())) {
                        fetchToken();
                        if (Tipo.SABRE_PARENTESIS.equals(token.getTipo())) {
                            fetchToken();
                            if (Tipo.SSTRING.equals(token.getTipo())) {
                                fetchToken();
                                if (Tipo.SABRE_COLCHETES.equals(token.getTipo())) {
                                    fetchToken();
                                    if (Tipo.SFECHA_COLCHETES.equals(token.getTipo())) {
                                        fetchToken();
                                        if (Tipo.SIDENTIFICADOR.equals(token.getTipo())) {
                                            fetchToken();
                                            if (Tipo.SFECHA_PARENTESIS.equals(token.getTipo())) {
                                                fetchToken();
                                                if (Tipo.SABRE_CHAVES.equals(token.getTipo())) {
                                                    fetchToken();
                                                    if(analisaBloco()) {
                                                        fetchToken();
                                                        if (Tipo.SFECHA_CHAVES.equals(token.getTipo())) {
                                                            return true;
                                                        }
                                                        return false;
                                                    }
                                                    return false;
                                                }
                                                return false;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private Boolean analisaBloco() {
        return true;
    }
}
