/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.gpteste.dominio;

import gov.gpteste.util.DataUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;

/**
 *
 * @author 05163217658
 */
@Entity
@Table(name = "TAREFA")
@AttributeOverride(name = "id", column = @Column(name = "id_tarefa", nullable = false))
public class Tarefa extends ObjetoUtil {
    
    @Column(name = "co_nome")
    private String nome;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "dt_inicial")
    private Date dataInicial;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "dt_final")
    private Date dataFinal;
    
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "in_tipo_tarefa")
    @Type(type = "javax.persistence.EnumType", parameters = {
            @Parameter(name = "enumClass", value = "gov.gpteste.dominio.TipoTarefa"),
            @Parameter(name = "identifierMethod", value = "getCodigo"),
            @Parameter(name = "valueOfMethod", value = "valueOfCodigo") })
    private TipoTarefa tipoTarefa;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_funcionario", nullable = false)
    private Funcionario funcionario;

    public Tarefa() {
    }

    public Tarefa(Long id, String nome, Date dataInicial, Date dataFinal, TipoTarefa tipoTarefa, Funcionario funcionario) {
        this.setId(id);
        this.nome = nome;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.tipoTarefa = tipoTarefa;
        this.funcionario = funcionario;
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
     * @return the dataInicial
     */
    public Date getDataInicial() {
        return dataInicial;
    }

    /**
     * @param dataInicial the dataInicial to set
     */
    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    /**
     * @return the dataFinal
     */
    public Date getDataFinal() {
        return dataFinal;
    }

    /**
     * @param dataFinal the dataFinal to set
     */
    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    /**
     * @return the tipoTarefa
     */
    public TipoTarefa getTipoTarefa() {
        return tipoTarefa;
    }

    /**
     * @param tipoTarefa the tipoTarefa to set
     */
    public void setTipoTarefa(TipoTarefa tipoTarefa) {
        this.tipoTarefa = tipoTarefa;
    }

    /**
     * @return the funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    public static List<Tarefa> cargaInicial() {
        List<Tarefa> lista = new ArrayList<Tarefa>();
        
        Equipe equipe1 = new Equipe(1l, "DE6N1", "DEBHE/DE6N1");
        Funcionario funcionario1 = new Funcionario(1l, "Julio", equipe1);
        
        Tarefa tarefa1 = new Tarefa(1l, "Implementar GPTeste", DataUtil.retornaData10Posicoes("15/03/2012"), 
                DataUtil.retornaData10Posicoes("20/03/2012"), TipoTarefa.REDMINE, funcionario1);
        lista.add(tarefa1);

        Tarefa tarefa2 = new Tarefa(2l, "Testar GPTeste", DataUtil.retornaData10Posicoes("21/03/2012"), 
                DataUtil.retornaData10Posicoes("22/03/2012"), TipoTarefa.REDMINE, funcionario1);
        lista.add(tarefa2);

        return lista;
    }
}
