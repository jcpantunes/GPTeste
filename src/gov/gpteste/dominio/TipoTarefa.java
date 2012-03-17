/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.gpteste.dominio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 05163217658
 */
public enum TipoTarefa {
   
    MANTIS (1, "Mantis"), REDMINE (2, "Redmine"), SM (3, "SM");
    
    private Integer codigo;
    private String nome;

    private TipoTarefa(Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
    
    public List<String> getValores() {
        List<String> lista = new ArrayList<String>();
        lista.add(MANTIS.nome);
        lista.add(REDMINE.nome);
        lista.add(SM.nome);
        return lista;
    }
    
    public static TipoTarefa valueOfCodigo(Integer codigo) {
        for (TipoTarefa tipoTarefa : values()) {
            if (codigo.equals(tipoTarefa.getCodigo())) {
                return tipoTarefa;
            }
        }
        return null;
    }
}
