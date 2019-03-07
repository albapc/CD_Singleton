package practicasingleton;

public class Singleton {

    private String autor, titulo;

    private static Singleton instancia = null;

    private Singleton(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public static Singleton getInstance(String autor, String titulo) {
        if (instancia == null) {
            instancia = new Singleton(autor, titulo);
            return instancia;
        }
        return instancia;
    }

    //OTRA FORMA DE HACERLO: 
    //(cambiando el contenido de los métodos con el mismo nombre y poniendo el obj "instancia" como final)
    /*
    private static final Singleton instancia = new Singleton();

    private Singleton(Strin autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public static Singleton getInstance() {
        return instancia;
    }
     */

    @Override
    public String toString() {
        return "Singleton{ " + "autor: " + autor + ", titulo: " + titulo + '}';
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }
    
}
