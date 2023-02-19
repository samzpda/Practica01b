public class Tren extends Transporte{

    int bagones;
    String color;
    double velocidad;

    public Tren(String tipo, int llanta, double combustible, int bagones, String color, double velocidad) {
        super(tipo, llanta, combustible);
        this.bagones = bagones;
        this.color = color;
        this.velocidad = velocidad;
    }

    public int getBagones() {
        return bagones;
    }

    public void setBagones(int bagones) {
        this.bagones = bagones;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
}
