package Ex3;

public class Esportivo extends Automóvel{
    private String combustível;
    private String gasolina;

    @Override
    public String getCombustível() {
        return combustível;
    }

    @Override
    public void setCombustível(String combustível) {
        this.combustível = combustível;
        System.out.println("Gasolina");
    }

    public static void main(String[] args) {
        Esportivo esportivo = new Esportivo();
        esportivo.setCombustível("Gasolina");
    }
}
