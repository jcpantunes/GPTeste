/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.gpteste.dao;

import gov.gpteste.dominio.ObjetoUtil;
import java.util.List;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;

/**
 *
 * @author 05163217658
 */
public abstract class DAOUtil<T extends ObjetoUtil> {
    
    protected Session session;

    public DAOUtil() {
    }

    public void iniciarTransacao() {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
    }
    
    public void encerrarTransacao(){
        session.close();
    }
    
    public void salvar(T objeto){
        iniciarTransacao();
        session.saveOrUpdate(objeto);
        session.getTransaction().commit();
        session.flush();
        encerrarTransacao();
    }
 
    public void merge(T objeto){
        iniciarTransacao();
        session.merge(objeto);
        session.flush();
        encerrarTransacao();
    }
 
    public T recuperar(Class clazz, Long id){
        iniciarTransacao();
        T objeto = (T) session.load(clazz, id);
        try {
            if (id.compareTo(objeto.getId()) != 0) {
                return null;
            }
        } catch (ObjectNotFoundException e) {
            return null;
        }
        return objeto;
    }
    
    public List<T> recuperar(Class clazz){
        iniciarTransacao();
        List<T> lista = session.createQuery("from " + clazz.getName()).list();
        return lista;
    }
 
    public void remover(T objeto){
        iniciarTransacao();
        session.delete(objeto);
        session.flush();
        encerrarTransacao();
    }
}
