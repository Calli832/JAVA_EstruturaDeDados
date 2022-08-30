package Atividade_3.Lista;

public class lista {
    private no primeiro;
    private no ultimo;
    private int tamanho;

    public lista(){
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }
    public no getPrimeiro() {
        return this.primeiro;
    }
    public no getUltimo() {
        return this.ultimo;
    }
    public void setPrimeiro(no primeiro) {
        this.primeiro = primeiro;
    }
    public void setUltimo(no ultimo) {
        this.ultimo = ultimo;
    }
    public int getTamanho() {
        return this.tamanho;
    }
    public boolean esta_vazia() {
        return (this.primeiro == null);
    }
    public void insereInicio (int i) {
        no novo = new no(i);
        if (this.esta_vazia())
            this.setUltimo(novo);
        else
            novo.setProximo(this.primeiro);  
        this.setPrimeiro(novo);
        this.tamanho++;
    }
    public void insereFim (int i) {
        no novo = new no(i);
        if (this.esta_vazia()) 
            this.setPrimeiro(novo);
        else
            this.ultimo.setProximo(novo);
        this.setUltimo(novo);
        this.tamanho++;
    }
    @Override
    public String toString() {
        String s = "";
        if (this.esta_vazia())
            s = "esta vazia";
        else {
            no aux = this.primeiro;
            while (aux != null) { //busca pelo fim da lista
                s = s + aux;
                aux = aux.getProximo();
            }
        }
        return s;
    }
    public void print(){
        no corr = this.primeiro;
        while(corr!=null){
            System.out.println(corr);
            corr = corr.getProximo();
        }
    }

    public boolean verifica(int num){
        no auxi = this.primeiro;
        while(auxi != null){
            if(num == auxi.getInfo())
            {
                return true;
            }
            auxi = auxi.getProximo();
        }
        return false;
    }
    
    public int verifica2(int num1){
        no auxi2 = this.primeiro;
        int cont = 0;
        while(auxi2 != null){
            if(num1 == auxi2.getInfo())
            {
                cont++;
            }
            auxi2 = auxi2.getProximo();
        }
        return cont;
    }

    public int verifica3(int num2){
        no auxi3 = this.primeiro;
        int cont1 = 0;
        while(auxi3 != null){
            if(num2 != auxi3.getInfo())
            {
                cont1++;
            }else
            {
                return cont1;
            }
            auxi3 = auxi3.getProximo();
        }
        return -1;
    }

    public void separar(lista par, lista impar){
        no fast1 = this.primeiro;
        no auxi;
        no auxi2;
        while(fast1 != null){
            if(fast1.getInfo() % 2 == 0){
                auxi = fast1;
                par.insereInicio(auxi.getInfo());
            }else{
                auxi2 = fast1;
                impar.insereInicio(auxi2.getInfo());
            }
            fast1 = fast1.getProximo();
        }
    }

    public void junta(lista D1, lista D2){
        no f1 = D1.primeiro;
        no f2 = D2.primeiro;

        while(f1 != null){
            insereInicio(f1.getInfo());
            f1 = f1.getProximo();
        }
        while(f2 != null){
            insereInicio(f2.getInfo());
            f2 = f2.getProximo();
        }
    }
}

