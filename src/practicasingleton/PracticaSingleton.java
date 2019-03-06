
package practicasingleton;

public class PracticaSingleton {

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance("pedro","libro1");
        Singleton obj2 = Singleton.getInstance("rosa","quijote");
        System.out.println(obj1.toString());
       //hacer lo mismo con obj2
       System.out.println(obj2.toString()); //no nos llega a crear el obj2
       System.out.println(obj1.toString());;
        
        
        
        
    }
    
}
