/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.gpteste.dao;

import gov.gpteste.dominio.Funcionario;
import gov.gpteste.util.BDGPTesteUtil;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author 05163217658
 */
public class FuncionarioDAOTest {

    @Test
    public void testInsert() {
        System.out.println("EXECUTANDO TESTE UNITARIO: testInsert");
        BDGPTesteUtil.realizarCargaInicial();
        
        try {
            System.out.println("EXECUTANDO TESTE UNITARIO: testRecuperarTodos");
            
            FuncionarioDAO dao = new FuncionarioDAO();
            List<Funcionario> lista = dao.recuperar();
            for (int i = 0 ; i < lista.size() ; i++) {
                Funcionario f = lista.get(i);
                System.out.println(" => Id " + f.getId() + " Nome: " + f.getNome());
            }
            
            System.out.println("EXECUTANDO TESTE UNITARIO: testRecuperarUm");
            Funcionario f = dao.recuperar(1l);
            if (f != null) {
                System.out.println("Funcionario: " + f.getNome());
            } else {
                System.out.println("Objeto com id 1 nao encontrado");
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
