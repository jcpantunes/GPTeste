/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.gpteste.dao;

import gov.gpteste.dominio.Equipe;
import gov.gpteste.util.BDGPTesteUtil;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author 05163217658
 */
public class EquipeDAOTest {
    
    @Test
    public void testInsert() {
        System.out.println("EXECUTANDO TESTE UNITARIO: testInsert");
        BDGPTesteUtil.realizarCargaInicial();
        
        try {
            System.out.println("EXECUTANDO TESTE UNITARIO: testRecuperarTodos");
            
            EquipeDAO dao = new EquipeDAO();
            List<Equipe> lista = dao.recuperar();
            for (int i = 0 ; i < lista.size() ; i++) {
                Equipe e = lista.get(i);
                System.out.println(" => Id " + e.getId() + " Codigo: " + e.getCodigo() + " - Name: " + e.getNome());
            }
            
            System.out.println("EXECUTANDO TESTE UNITARIO: testRecuperarUm");
            Equipe equipe = dao.recuperar(11l);
            if (equipe != null) {
                System.out.println("Equipe Codigo: " + equipe.getCodigo());
            } else {
                System.out.println("Objeto com id 11 nao encontrado");
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
