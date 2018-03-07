package vetores;



import java.util.Arrays;
import model.Aluno;




public class Vetor {
    
                    //ATRIBUTOS
    
    //declarando e inicializando um array de aluno com capacidade 100
    private Object[] objetos = new Object[100];
    
    //variável que irá receber total de alunos no vetor
    private int totalDeObjetos = 0;
    
                   
                    //METODOS
    //metodo para garantir espaço no vetor, caso o vetor esteja cheio
    private void garantaEspaco(){
        if(this.totalDeObjetos == this.objetos.length){
            Object[] novoVetor = new Object[this.objetos.length *2];
            for (int i = 0; i < this.objetos.length; i++) {
                novoVetor[i] = this.objetos[i];
            }
            
            this.objetos = novoVetor;
        }
    }
    
    public void adiciona(Object object){
        this.garantaEspaco();
        this.objetos[this.totalDeObjetos] = object;
        this.totalDeObjetos++;
    }
    
    //metodo para adicionar um aluno em uma determinada posição
    public void adiciona(int posicao, Aluno aluno){
        
        if(!this.posicaoValida(posicao)){
            throw new IllegalArgumentException("Posição inválida");
        }
        
        for (int i = this.totalDeObjetos - 1;  i >= posicao; i-=1) {
            this.objetos[i + 1] = this.objetos[i];
        }
        
        this.objetos[posicao] = aluno;
        this.totalDeObjetos++;
    }
    
    //pegar um aluno de uma dada posição
    public Object pega(int posicao){
       if(!this.posicaoOcupada(posicao)){
           throw new IllegalArgumentException("Posião inválida");
       }
       return this.objetos[posicao];
    }
    //metodo que confere se a posição indicada está vazia ou não
    private boolean posicaoOcupada(int posicao){
        
       return posicao >= 0 && posicao < this.totalDeObjetos;
    }
    //metodo que confere se a posiçao indicada é valida ou não
     private boolean posicaoValida(int posicao){
        
       return posicao >= 0 && posicao < this.totalDeObjetos;
    }
    
    //remove do vetor dada pelo posição
    public void remove(int posicao){
        
        if(!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição inválida");
        }
        
        for (int i = posicao; i < totalDeObjetos - 1; i++) {
            this.objetos[i] = this.objetos[i +1];
        }
        this.totalDeObjetos--;
    }
    
    //Metodo que confere se o aluno está presente no Vetor
    public boolean contem(Aluno aluno){
        for(int i = 0; i < this.totalDeObjetos; i++){
            if(aluno.equals(this.objetos[i])){
                return true;
            }
        }
        return false;
    }
    
    //informa o tamanho do vetor atual
    public int tamanho(){
        return this.totalDeObjetos;
    }
    
    public String toString(){
        if(this.totalDeObjetos == 0){
            return "[]";
        }
        
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        
        for(int i = 0; i < this.totalDeObjetos -1; i++ ){
            
            builder.append(this.objetos[i]);
            builder.append(", ");
        }
        
        builder.append(this.objetos[this.totalDeObjetos - 1]);
        builder.append("]");
        
        return builder.toString();
    }
    
}
