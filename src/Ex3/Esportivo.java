package Ex3;

public class Esportivo extends Automóvel{
    private String combustível;
    private String gasolina;

    @Override
    public String getCombustível() {
        return gasolina;
    }

    @Override
    public void setCombustível(String combustível) {
        this.combustível = gasolina;
        System.out.println("Gasolina");
    }
}
