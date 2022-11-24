/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;
import view.SIGView;

/**
 *
 * @author salma.abdelnour
 */
public class Controller implements ActionListener{
    SIGView frame ;
    public Controller (SIGView frame){
        this.frame=frame;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
       System.out.println("Action Fired");
       String Command = e.getActionCommand();
       switch(Command){
            

           case "Create New Invoice" :
              createInvoice();
               break;

           case "Delete Invoice" :
                deleteInvoce();
               
               break;

           case "Create":
               CreateItem();
               
               break;

           case "Cancel":
               CancelItem();
               break;
           case   "Load" :
               Load(null,null);
               break;     
       case "Save":
           Save();
           break;
       }
    }

    private void createInvoice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void deleteInvoce() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void CreateItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void CancelItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Load(String headerPath, String linePath) {
        File headerFile = null;
        File lineFile = null ;
        if(headerPath==null && linePath == null){
            JFileChooser Fc = new JFileChooser();
            int result = Fc.showOpenDialog(frame);
            if(result == JFileChooser.APPROVE_OPTION){
                headerFile = Fc.getSelectedFile();
                result = Fc.showOpenDialog(frame);
                if(result == JFileChooser.APPROVE_OPTION){
                    lineFile = Fc.getSelectedFile();
                }
                
            }
            
        }else{
            headerFile= new File(headerPath);
            lineFile = new File(linePath);
        }
        if(headerFile!=null && lineFile!=null){
            try{
                List<String> headerLine = File.lines(paths.get(headrFile.getAbsolutepath())).collect(Collectors.toList());
            }
        }
        
        List<String>linLines = Files.lines(Paths.get(lineFile.getAbsolutePath())).collect(Collectors.toList());
        frame.getInvoices().clear();
        for(String headerLine: headerLines){
            String[] parts = headerLine.split(linePath, 0);
        }
         
    }

    private void Save() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
