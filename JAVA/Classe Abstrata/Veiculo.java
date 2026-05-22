public abstract class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract double calcularConsumo();

    public void exibirInformacoes() {
        System.out.println("===== Informações do Veículo =====");
        System.out.println("Marca:   " + marca);
        System.out.println("Modelo:  " + modelo);
        System.out.println("Consumo: " + calcularConsumo() + " km/l");
        System.out.println("==================================");
    }

    public String getMarca()  { return marca; }
    public String getModelo() { return modelo; }
}