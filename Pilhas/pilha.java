package Atividade_3.Pilhas;

public class pilha {
    private no topo;
    private int tamanho = 0;

    public pilha() {
        this.topo = null;
    }
    public boolean estaVazia() {
        return this.topo == null;
    }
    public void push (int i) {
        no novo = new no(i);
        if (!this.estaVazia()){
            novo.setProximo(this.topo);
        }
        this.topo = novo;
    } 
    public int pop () {
        int i = this.topo.getInfo();
        this.topo = this.topo.getProximo();
        return i;
    }
    public int peek() {
        return this.topo.getInfo();
    }
    public void print(){
        no corr = this.topo;
        while(corr!=null){
            System.out.println(corr);
            corr = corr.getProximo();
        }
    }

    public void inverter(){
        pilha auxi1 = new pilha();
        pilha auxi2 = new pilha();

        while(!estaVazia()){
            int removido = pop();
            auxi1.push(removido);
        }
        while(!auxi1.estaVazia()){
            auxi2.push(auxi1.pop());
        }
        while(!auxi2.estaVazia()){
            push(auxi2.pop());
        }
    }

    public String elementos(pilha p2){
        no run1 = this.topo;
        no run2 = p2.topo;
        int t1 = 0;
        int t2 = 0;
        while(run1!=null){
            t1++;
            run1 = run1.getProximo();
        }
        while(run2!=null){
            t2++;
            run2 = run2.getProximo();
        }
        if(t1 == t2){
            return "Eles tem tamanhos iguais";
        }else if(t1 > t2){
            return "A P1 é maior que a P2";
        }else{
            return "A P2 é maior que a P1";
        }
    }

    public String iguais(pilha p2){
        no fast1 = this.topo;
        no fast2 = p2.topo;

        if(fast1 == null){
            return "A P1 é nula";
        }else if(fast2 == null){
            return "A P2 é nula";
        }else{
            while(fast1 != null || fast2 != null){
                if(fast1.getInfo() != fast2.getInfo()){
                    return "As pilhas são diferentes";
                    }
                fast1 = fast1.getProximo();
                fast2 = fast2.getProximo();
            }
        }
        return "As pilhas são iguais";
    }

    @Override
    public String toString() {
        String s = "pilha: ";
        if (this.estaVazia())
            s = s + "esta vazia";
        else {
            no aux = this.topo;
            while (aux != null) {
                s = s + aux.getInfo() + " ";
                aux = aux.getProximo();
            }
        }
        return s + "\n";
    }
}
