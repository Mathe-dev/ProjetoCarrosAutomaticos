import java.util.ArrayList;

public class Frota {
    private ArrayList<CarroAutomatico> carros;

    public Frota() {
        carros = new ArrayList<>();
    }

    public void adicionarCarro(CarroAutomatico carro) {
        carros.add(carro);
    }

    public void listarCarros() {
        System.out.println("=== Frota de Carros ===");
        for (CarroAutomatico carro : carros) {
            carro.exibirInfo();
        }
    }
}