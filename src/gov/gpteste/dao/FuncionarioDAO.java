/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.gpteste.dao;

import gov.gpteste.dominio.Funcionario;
import java.util.List;

/**
 *
 * @author 05163217658
 */
public class FuncionarioDAO extends DAOUtil<Funcionario> {

    public FuncionarioDAO() {
        super();
    }
 
    public Funcionario recuperar(Long id){
        return super.recuperar(Funcionario.class, id);
    }
    
    public List<Funcionario> recuperar(){
        return super.recuperar(Funcionario.class);
    }
}
