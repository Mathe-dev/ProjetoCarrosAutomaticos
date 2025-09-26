public class Carro {
    protected String modelo;
    protected String cor;
    protected Motor motor;
    protected int velocidade;
    protected double combustivel; // em litros

    public Carro(String modelo, String cor, double combustivelInicial) {
        this.modelo = modelo;
        this.cor = cor;
        this.motor = new Motor();
        this.velocidade = 0;
        this.combustivel = combustivelInicial;
    }

    public void ligar() {
        if (combustivel > 0) {
            motor.ligar();
        } else {
            System.out.println("Não é possível ligar. Tanque vazio!");
        }
    }

    public void desligar() {
        motor.desligar();
        velocidade = 0;
    }

    public void abastecer(double litros) {
        combustivel += litros;
        System.out.println("Carro abastecido com " + litros + "L. Total: " + combustivel + "L");
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo + " | Cor: " + cor +
                " | Velocidade: " + velocidade + " km/h | Combustível: " + combustivel + "L");
    }
}