import Ex3.Caminhão;
import Ex3.Esportivo;

public class Main {
    public static void main(String[] args) {
        Esportivo esportivo = new Esportivo();
        esportivo.getCombustível();
        esportivo.setCombustível("Gasolina");

        Caminhão caminhão = new Caminhão();
        caminhão.getCombustível();
        caminhão.setCombustível("Diesel");
    }
}