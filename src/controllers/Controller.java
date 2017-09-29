
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.Model;
import views.View;

public class Controller implements ActionListener  {
    private final Model model;
    private final View view;

    public Controller(View view, Model model){
        this.view = view;
        this.model = model;
        view.jbtn_hola.addActionListener(this);
        view.jbtn_adios.addActionListener(this);
        view.jbtn_salir.addActionListener(this);
        initView();
    }
   

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==view.jbtn_hola)
            jbtn_holaActionPerformed();
        else if(e.getSource()==view.jbtn_adios)
            jbtn_adiosActionPerformed();
         else if(e.getSource()==view.jbtn_salir)
            jbtn_salirActionPerformed();
    }

    private void jbtn_holaActionPerformed(){
        JOptionPane.showMessageDialog(null, "¡Hola Lupita!");
    }

    private void jbtn_adiosActionPerformed(){
        JOptionPane.showMessageDialog(null, "¡Adios Lupita!");
    }
    
    
    private void jbtn_salirActionPerformed(){
        JOptionPane.showMessageDialog(null, "¡desea salir!");
       view.setVisible(false);
    }

    public final void initView(){
        view.setTitle("Hola Lupita");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }

}

