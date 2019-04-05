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
public class PBL3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HTML paragrafo=new Paragrafo();
        HTML lista=new Lista();
        HTML link=new Link();
        Dispositivo desktop=new Desktop();
        Dispositivo tablet=new Tablet();
        Dispositivo notebook=new Notebook();
        Dispositivo celular=new Celular();
        
        desktop.cadastro(paragrafo);
        tablet.cadastro(paragrafo);
        notebook.cadastro(paragrafo);
        celular.cadastro(paragrafo);
        
        desktop.cadastro(lista);
        tablet.cadastro(lista);
        notebook.cadastro(lista);
        celular.cadastro(lista);
        
        desktop.cadastro(link);
        tablet.cadastro(link);
        notebook.cadastro(link);
        celular.cadastro(link);
        
        paragrafo.setCor("Preto");
        paragrafo.setTamanho(15);
        
        lista.setCor("Vermelho");
        lista.setTamanho(30);
        
        link.setCor("Cinza");
        link.setTamanho(70);
        
        
        if(desktop instanceof Desktop){
            System.out.println("Paragrafo no desktop: "+desktop.tamanho_paragrafo());
            System.out.println("Link no desktop: "+desktop.tamanho_link());
            System.out.println("Lista no desktop: "+desktop.tamanho_lista());
        }
        System.out.println("");
        if(tablet instanceof Tablet){
            System.out.println("Paragrafo no desktop: "+tablet.tamanho_paragrafo());
            System.out.println("Link no desktop: "+tablet.tamanho_link());
            System.out.println("Lista no desktop: "+tablet.tamanho_lista());
        }
        System.out.println("");
        if(notebook instanceof Notebook){
            System.out.println("Paragrafo no desktop: "+notebook.tamanho_paragrafo());
            System.out.println("Link no desktop: "+notebook.tamanho_link());
            System.out.println("Lista no desktop: "+notebook.tamanho_lista());
        }
        System.out.println("");
        if(celular instanceof Celular){
            System.out.println("Paragrafo no desktop: "+celular.tamanho_paragrafo());
            System.out.println("Link no desktop: "+celular.tamanho_link());
            System.out.println("Lista no desktop: "+celular.tamanho_lista());
        }
        
        
        
    }
    
}
