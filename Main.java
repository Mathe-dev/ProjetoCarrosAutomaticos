public class Main {
    public static void main(String[] args) {
        Frota frota = new Frota();

        CarroAutomatico carro1 = new CarroAutomatico("Toyota Corolla", "Preto", 50);
        CarroAutomatico carro2 = new CarroAutomatico("Honda Civic", "Prata", 40);

        frota.adicionarCarro(carro1);
        frota.adicionarCarro(carro2);

        frota.listarCarros();

        // Testando o carro1
        carro1.ligar();
        carro1.mudarMarcha("D");
        carro1.acelerar(20);
        carro1.acelerar(30);
        carro1.frear(25);
        carro1.desligar();

        // Exibir novamente depois do uso
        frota.listarCarros();
    }
}