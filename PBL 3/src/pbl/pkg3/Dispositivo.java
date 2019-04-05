/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl.pkg3;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public abstract class Dispositivo {
    protected ArrayList<HTML>html;
    
    public Dispositivo(){
        this.html=new ArrayList();
    }

    public ArrayList<HTML> getHtml() {
        return html;
    }

    public void setHtml(ArrayList<HTML> html) {
        this.html = html;
    }
    public void cadastro(HTML html){
        this.html.add(html);
    }
    
    public abstract double tamanho_paragrafo();
    public abstract double tamanho_link();
    public abstract double tamanho_lista();
}
