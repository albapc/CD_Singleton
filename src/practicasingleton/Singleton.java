package practicasingleton;

public class Singleton {

    private String autor, titulo;

    private static Singleton instancia = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instancia == null) {
            instancia = new Singleton();
            return instancia;
        }
        return instancia;
    }

    //OTRA FORMA DE HACERLO: 
    //(cambiando el contenido de los métodos con el mismo nombre y poniendo el obj "instancia" como final)
    /*
    private static final Singleton instancia = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instancia;
    }
     */
    
    public void mostrar() {
        System.out.println("Singleton{: autor " + autor + " titulo: " + titulo);
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
