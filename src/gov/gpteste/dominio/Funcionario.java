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
@Table(name = "FUNCIONARIO")
@AttributeOverride(name = "id", column = @Column(name = "id_funcionario", nullable = false))
public class Funcionario extends ObjetoUtil {

    @Column(name = "no_funcionario")
    private String nome;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_equipe", nullable = false)
    private Equipe equipe;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "funcionario", cascade = javax.persistence.CascadeType.ALL)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE_ORPHAN)
    private List<Tarefa> listaTarefa;
    
    public Funcionario() {
    }

    public Funcionario(Long id, String nome, Equipe equipe) {
        this.id = id;
        this.nome = nome;
        this.equipe = equipe;
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

    /**
     * @return the equipe
     */
    public Equipe getEquipe() {
        return equipe;
    }

    /**
     * @param equipe the equipe to set
     */
    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public List<Tarefa> getListaTarefa() {
        return listaTarefa;
    }

    public void setListaTarefa(List<Tarefa> listaTarefa) {
        this.listaTarefa = listaTarefa;
    }
    
    public static List<Funcionario> cargaInicial() {
        List<Funcionario> lista = new ArrayList<Funcionario>();
        
        Equipe equipe1 = new Equipe(1l, "DE6N1", "DEBHE/DE6N1");
        
        Funcionario funcionario1 = new Funcionario(1l, "Julio", equipe1);
        lista.add(funcionario1);
        
        Funcionario funcionario2 = new Funcionario(2l, "Leandro", equipe1);
        lista.add(funcionario2);
        
        Funcionario funcionario3 = new Funcionario(3l, "Saulo", equipe1);
        lista.add(funcionario3);
        
        return lista;
    }
    
    
    
}
