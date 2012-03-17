/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.gpteste.dao;

import gov.gpteste.dominio.Tarefa;
import java.util.List;

/**
 *
 * @author 05163217658
 */
public class TarefaDAO extends DAOUtil<Tarefa> {

    public TarefaDAO() {
        super();
    }
 
    public Tarefa recuperar(Long id){
        return super.recuperar(Tarefa.class, id);
    }
    
    public List<Tarefa> recuperar(){
        return super.recuperar(Tarefa.class);
    }
}
