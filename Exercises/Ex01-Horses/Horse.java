/**
 * Created by kurt on 6/09/2016.
 */
public class Horse {
    private String name;
    private String colour;
    private Integer birthYear;


    /** Setters **/
    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setName(String name) {
        this.name = name;
    }

    /** Getters **/
    public Integer getBirthYear() {
        return birthYear;
    }

    public String getColour() {

        return colour;
    }

    public String getName() {

        return name;
    }


}
