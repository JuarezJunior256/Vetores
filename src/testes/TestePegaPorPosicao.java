
package testes;

import vetores.Vetor;
import model.Aluno;




public class TestePegaPorPosicao {
    
    
    
    public static void main(String[] args) {
        
        //teste adicinar no fim da lista
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        

        a1.setNome("João");
        a2.setNome("Paulo");
        a3.setNome("Felipe");
     
        Vetor lista = new Vetor();
        
        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3);
        
        Aluno aluno1 = (Aluno) lista.pega(0);
        Aluno aluno2 = (Aluno) lista.pega(1);
        
        System.out.println(aluno1);
        System.out.println(aluno2);
    }
    
}
