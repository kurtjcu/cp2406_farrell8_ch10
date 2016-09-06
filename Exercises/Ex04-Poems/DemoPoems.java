import java.util.ArrayList;

/**
 * Created by kurt on 6/09/2016.
 */
public class DemoPoems {

    public static void main(String[] args) {
        ArrayList<Poem> poems = new ArrayList<>();
        poems.add(new Couplet("couplet"));
        poems.add(new Limerick("limeric"));
        poems.add(new Haiku("haiku"));


        for (Poem poem : poems){
            System.out.println(poem);
        }
    }
}
