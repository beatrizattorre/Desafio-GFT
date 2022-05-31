package Ex3;

public class Caminhão extends Automóvel {
    private String combustível;
    private String diesel;

    @Override
    public String getCombustível() {
        return diesel;
    }

    @Override
    public void setCombustível(String combustível) {
        this.combustível = diesel;
        System.out.println("Diesel");
    }
}
