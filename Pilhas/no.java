package Atividade_3.Pilhas;

public class no {
    private int info;
    private no proximo;
    

    public no (int info)
    {
        this.info = info;
        this.proximo = null;
    }

    public int getInfo() {
        return info;
    }
    public no getProximo() {
        return proximo;
    }

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
