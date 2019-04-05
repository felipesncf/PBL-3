/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl.pkg3;

/**
 *
 * @author aluno
 */
public class Tablet extends Dispositivo{
    @Override
    public double tamanho_paragrafo() {
        double x=0;
        for(int i=0;i<1;i++){
            x=super.getHtml().get(i).tamanho * 1;
        }
        return x;
    }
    @Override
    public double tamanho_link() {
        double x=0;
        for(int i=0;i<1;i++){
            x=super.getHtml().get(i).tamanho * 1;
        }
        return x;
    }
    @Override
    public double tamanho_lista() {
        double x=0;
        for(int i=0;i<1;i++){
            x=super.getHtml().get(i).tamanho * 1;
        }
        return x;
    }
    
    
}
