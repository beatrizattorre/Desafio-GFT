package Ex3;

import org.w3c.dom.ls.LSOutput;

public class Esportivo extends Automóvel {
    private String combustível;

    public Esportivo(String combustível, String gasolina) {
        this.combustível = combustível;
        this.gasolina = gasolina;
    }

    @Override
    public String getCombustível() {
        return combustível;
    }

    @Override
    public void setCombustível(String combustível) {
        this.combustível = combustível;
    }

    public String getGasolina() {
        return gasolina;
    }

    public void setGasolina(String gasolina) {
        this.gasolina = gasolina;
    }

    private String gasolina;
}
