package Discos;

public class Discos extends Multimedia {

    private Genero genero;

    public Discos(String titulo, String autor, Formato formato, double duracion, Genero g) {
        super(titulo, autor, formato, duracion);
        this.genero = g;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String toString() {
        return super.toString() + "\nGenero: " + genero;
    }

}
