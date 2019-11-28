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
        if(Tipo.SINTEIRO.equals(token.getTipo()) || Tipo.SBOOLEAN.equals(token.getTipo())) {
            return analisaDeclaracaoVariavel();
        } else if (Tipo.SESCREVA.equals(token.getTipo())) {
            return analisaEscreva();
        } else if (Tipo.SIDENTIFICADOR.equals(token.getTipo()) || Tipo.SNUMERO.equals(token.getTipo()) ) {
            return analisaIdentificadorENumero();
        } else if (Tipo.SFECHA_CHAVES.equals(token.getTipo())) {
            fetchToken();
            return Tipo.SFECHA_CHAVES.equals(token.getTipo());
        }

        return false;
    }

    private Boolean analisaDeclaracaoVariavel() {
        // todo: declarar variavel sem atribuir
        if(Tipo.SINTEIRO.equals(token.getTipo()) || Tipo.SBOOLEAN.equals(token.getTipo())) {
            fetchToken();
            if (Tipo.SIDENTIFICADOR.equals(token.getTipo())) {
                fetchToken();
                if (Tipo.SATRIBUICAO.equals(token.getTipo())) {
                    fetchToken();
                    if (Tipo.SNUMERO.equals(token.getTipo()) || Tipo.SBOOLEAN_TRUE.equals(token.getTipo()) || Tipo.SBOOLEAN_FALSE.equals(token.getTipo())) {
                        fetchToken();
                        if (Tipo.SPONTO_E_VIRGULA.equals(token.getTipo())) {
                            fetchToken();
                            return analisaBloco();
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

    private Boolean analisaIdentificadorENumero() {
        //todo: numero junto com identificador
        if (Tipo.SIDENTIFICADOR.equals(token.getTipo()) || Tipo.SNUMERO.equals(token.getTipo())) {
            fetchToken();
            if (Tipo.SMAIS.equals(token.getTipo()) || Tipo.SMENOS.equals(token.getTipo())
                    || Tipo.SMULTIPLICACAO.equals(token.getTipo()) || Tipo.SDIVISAO.equals(token.getTipo())) {
                return analisaOperacao();
            }
            // apenas identificador ou numero
            return true;
        }
        return false;
    }

    private Boolean analisaOperacao() {
        if (Tipo.SMAIS.equals(token.getTipo()) || Tipo.SMENOS.equals(token.getTipo())
                || Tipo.SMULTIPLICACAO.equals(token.getTipo()) || Tipo.SDIVISAO.equals(token.getTipo())) {
            fetchToken();
            if (Tipo.SIDENTIFICADOR.equals(token.getTipo()) || Tipo.SNUMERO.equals(token.getTipo())) {
                fetchToken();
                if (Tipo.SPONTO_E_VIRGULA.equals(token.getTipo())) {
                    fetchToken();
                    return analisaBloco();
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private Boolean analisaEscreva() {
        if(Tipo.SESCREVA.equals(token.getTipo())) {
            fetchToken();
            if (Tipo.SABRE_PARENTESIS.equals(token.getTipo())) {
                fetchToken();
                if (analisaBloco()) {
                    //fetchToken();
                    if (Tipo.SFECHA_PARENTESIS.equals(token.getTipo())) {
                        fetchToken();
                        if (Tipo.SPONTO_E_VIRGULA.equals(token.getTipo())) {
                            fetchToken();
                            return analisaBloco();
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
}
