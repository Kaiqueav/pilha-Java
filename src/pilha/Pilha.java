package pilha;

public class Pilha {
    private No refNoEntradaP;

    public Pilha() {
        this.refNoEntradaP = null;
    }

    public void push(No newNo){
        No refAuxiliar = refNoEntradaP;
        refNoEntradaP = newNo;
        refNoEntradaP.setRefNo(refAuxiliar);
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaP;
            refNoEntradaP = refNoEntradaP.getRefNo();
            return noPoped;
        }return null;
    }
    public No top(){
        return refNoEntradaP;
    }
    public boolean isEmpty(){
        return refNoEntradaP == null ? true : false;
    }




}
