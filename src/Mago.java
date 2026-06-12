public abstract class Mago extends Personaje {

    protected String poder;

    public Mago(String nombre, String raza, String poder,
                int fuerza, double vitalidad) {
        super(nombre, raza, fuerza, vitalidad);
        this.poder = poder;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public abstract void atacar(Personaje oponente);
}
