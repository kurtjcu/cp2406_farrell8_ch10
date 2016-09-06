

/**
 * Created by kurt on 6/09/2016.
 */
public class Candle {
    private String colour;
    protected Double height;
    protected Double price;

    /** Setters **/
    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setHeight(Double height) {
        this.height = height;
        this.price = 2d * height;
    }


    /** Getters **/
    public String getColour() {
        return colour;
    }

    public Double getHeight() {
        return height;
    }

    public Double getPrice() {
        return price;
    }
}
