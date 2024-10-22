public class Roupa{

    private float valor;
    private String cor;
    private String marca;
    private String tamanho;
    private String material;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Roupa(String cor, float valor, String marca,String tamanho, String material) {
        this.cor = cor;
        this.valor = valor;
        this.marca = marca;
        this.tamanho = tamanho;
        this.material = material;
    }

    public Roupa() {

    }

    @Override
    public String toString() {
        return "Roupa{" +
                "cor='" + cor + '\'' +
                ", valor=" + valor +
                ", marca='" + marca + '\'' +
                '}';
    }
}