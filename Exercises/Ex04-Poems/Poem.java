/**
 * Created by kurt on 6/09/2016.
 */
public class Poem {
    protected String name;
    protected Integer numLines;


    public Poem(String name, Integer numLines) {
        this.name = name;
        this.numLines = numLines;
    }

    /** Setters **/

    public void setName(String name) {
        this.name = name;
    }

    public void setNumLines(Integer numLines) {
        this.numLines = numLines;
    }

    /** Getters **/

    public String getName() {
        return name;
    }

    public Integer getNumLines() {
        return numLines;
    }

    public String toString(){
        return( name + " " + numLines);
    }
}
