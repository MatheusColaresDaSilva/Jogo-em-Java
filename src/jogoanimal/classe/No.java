/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoanimal.classe;

import javax.swing.JOptionPane;

/**
 *
 * @author Matheus Colares
 */
public class No {
    
    private String Valor;
    private No noesq;
    private No nodir;

    public void perguntaEsq(No no){
    
     int resposta;   
        
     resposta = JOptionPane.showConfirmDialog(null, "O animal que pensou é um(a) ou tem " +no.getNoesq().getValor());
     
        switch(resposta){
            
            case 0:
               if(no.getNoesq().getNoesq() == null){
                   
                   JOptionPane.showMessageDialog(null, "Acertamos.");
               } 
               else{
                 
                   no.perguntaEsq(no.getNoesq());
                }
             break;  
             
            case 1:
                if(no.getNoesq().getNodir() == null){
                   
                   String animal;
                   String diferenca;
                   animal = JOptionPane.showInputDialog(null, "Que animal você pensou?");
                   diferenca = JOptionPane.showInputDialog(null, "O que que um(a) " + animal + " tem, que um " + no.getNoesq().getValor() + " não tem?");
                   
                   //tocar de lugar
                   String animalauxiliar;
                   No novonoesq = new No();
                   No novonodir = new No();
                   
                   //Comandos para mudar o no de lugar
                   animalauxiliar = no.getNoesq().getValor();
                                                          
                   no.getNoesq().setValor(diferenca);
                   no.getNoesq().setNoesq(novonoesq, animal);
                   no.getNoesq().setNodir(novonodir,animalauxiliar);
                   
               } 
               else{
                 
                   no.perguntaDir(no.getNoesq());
                }
             
            break;
        }
    }

    public void perguntaDir(No no){
    
     int resposta;   
        
        
       resposta = JOptionPane.showConfirmDialog(null,"O animal que pensou é um(a) ou tem " + no.getNodir().getValor());
        System.out.println(resposta);
        switch(resposta){
            
            case 0:
               if(no.getNodir().getNoesq() == null){
                   
                   JOptionPane.showMessageDialog(null, "Acertamos.");
               } 
               else{
                 
                   no.perguntaEsq(no.getNodir());
                }
              break; 
              
            case 1:
                if(no.getNodir().getNodir() == null){
                   
                   String animal;
                   String diferenca;
                   animal = JOptionPane.showInputDialog(null, "Que animal você pensou?");
                   diferenca = JOptionPane.showInputDialog(null, "O que que um(a) " + animal + " tem, que um " + no.getNodir().getValor() + " não tem?");
                   
                   //tocar de lugar
                   String animalauxiliar;
                   No novonoesq = new No();
                   No novonodir = new No();
                   
                   //Comandos para mudar o no de lugar
                   animalauxiliar = no.getNodir().getValor();
                                                         
                   no.getNodir().setValor(diferenca);
                   no.getNodir().setNoesq(novonoesq, animal);
                   no.getNodir().setNodir(novonodir,animalauxiliar);
 
               } 
               else{
                 
                   no.perguntaDir(no.getNodir());
                }
                
                break;
        }
    }
    
    public String getValor() {
        return Valor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }

    public No getNoesq() {
        return noesq;
    }

    public void setNoesq(No noesq,String valor) {
        
        this.noesq = noesq;
        noesq.setValor(valor);
    }

    public No getNodir() {
        return nodir;
    }

    public void setNodir(No nodir,String valor) {
        
        this.nodir = nodir;
        nodir.setValor(valor);
    }
   
}
