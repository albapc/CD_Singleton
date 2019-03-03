
package practicasingleton;

public class PracticaSingleton {

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        obj1.setAutor("pedro");
        obj1.setTitulo("libro1");
        obj1.mostrar();
       //hacer lo mismo con obj2
       obj2.setAutor("rosa");
       obj2.setTitulo("quijote");
       obj2.mostrar();
       obj1.mostrar(); //sincroniza los atributos de los dos objetos
        
        
        
    }
    
}
