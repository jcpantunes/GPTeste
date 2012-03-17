/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.gpteste.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author 05163217658
 */
public class DataUtil {
        
    /**
     * Retorna uma String recebendo como parametro uma data (do tipo Date)
     * 
     * @param data
     *            Data a ser convertida
     * @return Data convertida
     */
    public static String retornaDataString10Posicoes(Date data) {
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy", new Locale("pt", "BR"));
        return formato.format(data);
    }

    /**
     * Retorna um Date recebendo como parametro uma string no formato exigido pelo SIOPE. Ex.: "14SET10"
     * 
     * @param data
     *            Data a ser convertida
     * @return Data convertida
     */
    public static Date retornaDataDate(String data) {
        DateFormat formato = new SimpleDateFormat("ddMMMyy", new Locale("pt", "BR"));
        try {
            return formato.parse(data);
        } catch (ParseException e) {
            // LOGGER.error("Erro de parse", e);
            return null;
        }
    }
    
    /**
     * Retorna um Date recebendo como parametro uma string no formato exigido pelo SIOPE de 8 posiÃ§Ãµes. Ex.:
     * "14012010"
     * 
     * @param data
     *            Data a ser convertida
     * @return Data convertida
     */
    public static Date retornaData8Posicoes(String data) {
        DateFormat formato = new SimpleDateFormat("ddMMyyyy", new Locale("pt", "BR"));
        try {
            return formato.parse(data);
        } catch (ParseException e) {
            // LOGGER.error("Erro de parse", e);
            return null;
        }
    }
    
    /**
     * Retorna um Date recebendo como parametro uma string no formato "01/01/2010"
     * 
     * @param data
     *            Data a ser convertida
     * @return Data convertida
     */
    public static Date retornaData10Posicoes(String data) {
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy", new Locale("pt", "BR"));
        try {
            return formato.parse(data);
        } catch (ParseException e) {
            // LOGGER.error("Erro de parse", e);
            return null;
        }
    }
    
    /**
     * Retorna um Date recebendo como parametro uma string no formato "01/01/2010"
     * 
     * @param data
     *            Data a ser convertida
     * @return Data convertida
     */
    public static long retornarDiferencaEmDias(Date dtInicial, Date dtFinal) {
        long diffDia = 0;
        long l1 = dtInicial.getTime();
        long l2 = dtFinal.getTime();
        long diff = l2 - l1;
        diffDia = diff / (1000 * 60 * 60 * 24);
        return diffDia;
    }
    
}
