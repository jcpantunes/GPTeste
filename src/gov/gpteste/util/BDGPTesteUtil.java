/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.gpteste.util;

import gov.gpteste.dao.DAOUtil;
import gov.gpteste.dao.EquipeDAO;
import gov.gpteste.dao.FuncionarioDAO;
import gov.gpteste.dao.TarefaDAO;
import gov.gpteste.dominio.Equipe;
import gov.gpteste.dominio.Funcionario;
import gov.gpteste.dominio.Tarefa;
import java.util.List;

/**
 *
 * @author 05163217658
 */
public class BDGPTesteUtil {
    
    private static void realizarCargaInicial_Equipe(EquipeDAO dao, List<Equipe> lista) {
        try {
            for (int i = 0 ; i < lista.size() ; i++) {
                Equipe objeto = dao.recuperar(lista.get(i).getId());
                if (objeto == null) {
                    lista.get(i).setId(null);
                    dao.salvar(lista.get(i));
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private static void realizarCargaInicial_Funcionario(FuncionarioDAO dao, List<Funcionario> lista) {
        try {
            for (int i = 0 ; i < lista.size() ; i++) {
                Funcionario objeto = dao.recuperar(lista.get(i).getId());
                if (objeto == null) {
                    lista.get(i).setId(null);
                    dao.salvar(lista.get(i));
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private static void realizarCargaInicial_Tarefa(TarefaDAO dao, List<Tarefa> lista) {
        try {
            for (int i = 0 ; i < lista.size() ; i++) {
                Tarefa objeto = dao.recuperar(lista.get(i).getId());
                if (objeto == null) {
                    lista.get(i).setId(null);
                    dao.salvar(lista.get(i));
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void realizarCargaInicial() {

        realizarCargaInicial_Equipe(new EquipeDAO(), Equipe.cargaInicial());
        realizarCargaInicial_Funcionario(new FuncionarioDAO(), Funcionario.cargaInicial());
        realizarCargaInicial_Tarefa(new TarefaDAO(), Tarefa.cargaInicial());

    }
    
}
