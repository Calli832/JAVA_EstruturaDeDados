package Atividade_3.Lista;

public class no {
    private int info;
    private no proximo;

    public no (int info)
    {
        this.info = info;
        this.proximo = null;
    }

    //getters
    public int getInfo() {
        return info;
    }
    public no getProximo() {
        return proximo;
    }

    //setters
    public void setInfo(int info) {
        this.info = info;
    }
    public void setProximo(no proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString () {
        String s = "[" + this.info + "]";
        if (this.proximo == null)
            s = s + "";
        return s;
    }
}
