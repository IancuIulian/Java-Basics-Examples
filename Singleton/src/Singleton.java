/**
 * Created by ulise on 11/04/2017.
 */
public class Singleton {

    private static Singleton firstInstance = null;

    private Singleton () {}

    public static Singleton getInstance(){

        if (firstInstance == null){
            firstInstance = new Singleton();
        }

        return firstInstance;
    }



}
