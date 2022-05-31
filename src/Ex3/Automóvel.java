package Ex3;

public class Automóvel {
    public Automóvel(String combustível) {
        this.combustível = combustível;
    }

    public String getCombustível() {
        return combustível;
    }

    public void setCombustível(String combustível) {
        this.combustível = combustível;
    }

    private String combustível;
}
