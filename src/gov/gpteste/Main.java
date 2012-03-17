/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gov.gpteste;

import gov.gpteste.visao.JFramePrincipal;
import gov.gpteste.visao.JPanelEquipeConsulta;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;


/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Menu menu = new Menu();
        // JPanelEquipeConsulta p = new JPanelEquipeConsulta();
        JFramePrincipal p = new JFramePrincipal().getInstance();
        
        //DesktopFrame p = new DesktopFrame();
//        p.addWindowListener(new WindowAdapter() {
//            public void windowClosing (WindowEvent e) {
//                System.exit(0);
//            }
//        });
        p.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        p.setSize( 800, 600 ); // set frame size
        p.setVisible(true);
    }

}
