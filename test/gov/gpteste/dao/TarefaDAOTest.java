/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.gpteste.dao;

import gov.gpteste.dominio.Tarefa;
import gov.gpteste.util.BDGPTesteUtil;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author 05163217658
 */
public class TarefaDAOTest {

    @Test
    public void testInsert() {
        System.out.println("EXECUTANDO TESTE UNITARIO: testInsert");
        BDGPTesteUtil.realizarCargaInicial();
        
        try {
            System.out.println("EXECUTANDO TESTE UNITARIO: testRecuperarTodos");
            
            TarefaDAO dao = new TarefaDAO();
            List<Tarefa> lista = dao.recuperar();
            for (int i = 0 ; i < lista.size() ; i++) {
                Tarefa t = lista.get(i);
                System.out.println(" => Id " + t.getId() + " Nome: " + t.getNome());
            }
            
            System.out.println("EXECUTANDO TESTE UNITARIO: testRecuperarUm");
            Tarefa t = dao.recuperar(1l);
            if (t != null) {
                System.out.println("Tarefa: " + t.getNome());
            } else {
                System.out.println("Objeto com id 1 nao encontrado");
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
