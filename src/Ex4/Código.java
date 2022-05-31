package Ex4;

public final class Código extends Telefone{
    public int código;

    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public Código(int código, long telefone) {
        super(telefone);
    }
}
