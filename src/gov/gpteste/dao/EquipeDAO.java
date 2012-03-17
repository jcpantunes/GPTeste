/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.gpteste.dao;

import gov.gpteste.dominio.Equipe;
import java.util.List;

/**
 *
 * @author 05163217658
 */
public class EquipeDAO extends DAOUtil<Equipe> {

    public EquipeDAO() {
        super();
    }
 
    public Equipe recuperar(Long id){
        return super.recuperar(Equipe.class, id);
    }
    
    public List<Equipe> recuperar(){
        return super.recuperar(Equipe.class);
    }

}
