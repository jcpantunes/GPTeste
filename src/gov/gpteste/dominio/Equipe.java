/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.gpteste.dominio;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;

/**
 *
 * @author 05163217658
 */
@Entity
@Table(name = "EQUIPE")
@AttributeOverride(name = "id", column = @Column(name = "id_equipe", nullable = false))
public class Equipe extends ObjetoUtil {
   
    @Column(name = "co_equipe")
    private String codigo;
    
    @Column(name = "no_equipe")
    private String nome;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "equipe", cascade = javax.persistence.CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE_ORPHAN)
    private List<Funcionario> listaFuncionario;
    
    public Equipe() {
    }
    
    public Equipe(Long id, String codigo, String nome) {
        this.setId(id);
        this.codigo = codigo;
        this.nome = nome;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getListaFuncionario() {
        return listaFuncionario;
    }

    public void setListaFuncionario(List<Funcionario> listaFuncionario) {
        this.listaFuncionario = listaFuncionario;
    }
    
    public static List<Equipe> cargaInicial() {
        List<Equipe> lista = new ArrayList<Equipe>();
        
        Equipe equipe1 = new Equipe(1l, "DE6N1", "DEBHE/DE6N1");
        lista.add(equipe1);
        
        Equipe equipe2 = new Equipe(2l, "DE6NS", "DEBHE/DE6NS");
        lista.add(equipe2);
        
        Equipe equipe3 = new Equipe(3l, "DE6N2", "DEBHE/DE6N2");
        lista.add(equipe3);
        
        return lista;
    }

}
