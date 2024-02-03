package pilha;

public class Main {
    
    public static void main(String[] args){
        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));

        System.out.println(minhaPilha);

        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha);

        minhaPilha.push(new No(99));
        System.out.println(minhaPilha);
    }
}
