/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.gpteste.controle;

import gov.gpteste.dao.EquipeDAO;
import gov.gpteste.dominio.Equipe;
import java.util.List;

/**
 *
 * @author 05163217658
 */
public class AcaoCadastrarEquipe {
    
    EquipeDAO dao = new EquipeDAO();
    
    public Equipe recuperar(Long id) {
        return null;
    }
    
    public List<Equipe> recuperar() {
        return dao.recuperar();
    }
    
    public void salvar() {
        
    }
    
    public boolean remover(Long id) {
        return true;
    }
    
}
