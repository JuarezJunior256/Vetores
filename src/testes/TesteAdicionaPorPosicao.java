
package testes;

import vetores.Vetor;
import model.Aluno;




public class TesteAdicionaPorPosicao {
    
    
    
    public static void main(String[] args) {
        
        //teste adicinar no fim da lista
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();
        Aluno a6 = new Aluno();
        Aluno a7 = new Aluno();
        

        a1.setNome("João");
        a2.setNome("Paulo");
        a3.setNome("Felipe");
        a4.setNome("Eduarda");
        a5.setNome("Rafael");
        a6.setNome("Maria");
        a7.setNome("Danielle");
        
       Vetor lista = new Vetor();
  
        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3);
        lista.adiciona(a4);
        lista.adiciona(a5);
        lista.adiciona(a6);
        lista.adiciona(2, a7);
        
        System.out.println(lista);
        
    }
    
}
