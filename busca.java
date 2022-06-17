public class busca {
    public static double linear(double[] vetor, double chave){
    int posicao=0;
    int n =vetor.length;
    while(posicao< n){
    if(vetor[posicao]== chave){
    return posicao;    
    }
    posicao+=1;    
    }
    
    return -1;
    }
        
    
    public static double linear_melhorada(double[] vetor, double chave){
    for (int posicao=0; posicao <= vetor.length && chave>=v[posicao]; posicao++) {
    if(vetor[posicao]==chave){		           
    return posicao;
                }
                }
    return -1;
                }
    
    public static double binaria(double[] vetor, double chave){
    int esq = 0;
    int dir = vetor.length - 1;
    int posicao;
    
     while (esq <= dir){
    posicao = (int) Math.floor((esq + dir)/2);
    
    if (vetor[posicao] == chave){
    return posicao;
    } 
    else if (chave > vetor[posicao]) {
    esq = posicao + 1;
    } 
    else {
    dir = posicao - 1;
    }
    }
    return -1;
    }   
}
