public class Transporte {
    String tipo;
    int llantas;
    double combustible;

    public Transporte(String tipo, int llantas, double combustible) {
        this.tipo = tipo;
        this.llantas = llantas;
        this.combustible = combustible;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }
}
