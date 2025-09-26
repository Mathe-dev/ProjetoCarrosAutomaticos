public class CarroAutomatico extends Carro {
    private String marchaAtual;

    public CarroAutomatico(String modelo, String cor, double combustivelInicial) {
        super(modelo, cor, combustivelInicial);
        this.marchaAtual = "P";
    }

    public void mudarMarcha(String marcha) {
        if (motor.isLigado()) {
            this.marchaAtual = marcha;
            System.out.println("Marcha alterada para: " + marchaAtual);
        } else {
            System.out.println("Não é possível mudar a marcha com o motor desligado!");
        }
    }

    public void acelerar(int incremento) {
        if (motor.isLigado() && combustivel > 0) {
            velocidade += incremento;
            combustivel -= incremento * 0.1; // Consome combustível
            System.out.println("Acelerando... Velocidade: " + velocidade + " km/h | Combustível: " + combustivel + "L");
        } else {
            System.out.println("Não é possível acelerar. Motor desligado ou tanque vazio!");
        }
    }

    public void frear(int decremento) {
        if (velocidade > 0) {
            velocidade -= decremento;
            if (velocidade < 0) velocidade = 0;
            System.out.println("Freando... Velocidade: " + velocidade + " km/h");
        } else {
            System.out.println("O carro já está parado!");
        }
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Marcha atual: " + marchaAtual);
    }
}
