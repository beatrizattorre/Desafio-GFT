package Ex3;

public class Caminhão extends Automóvel {
    private String combustível;
    private String diesel;

    public Caminhão(String combustível, String diesel) {
        this.combustível = combustível;
        this.diesel = diesel;
    }

    @Override
    public String getCombustível() {
        return combustível;
    }

    @Override
    public void setCombustível(String combustível) {
        this.combustível = combustível;
    }

    public String getDiesel() {
        return diesel;
    }

    public void setDiesel(String diesel) {
        this.diesel = diesel;
    }
}
