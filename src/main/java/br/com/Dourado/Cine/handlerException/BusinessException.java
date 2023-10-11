package br.com.Dourado.Cine.handlerException;

public class BusinessException  extends  RuntimeException{

    public BusinessException(String mensagem){
        super(mensagem);
    }

    public BusinessException(String mensagem, Object ... patams){
        super(String.format(mensagem,patams));
    }
}
