/**
 * Created by kurt on 6/09/2016.
 */
public class ScentedCandle extends Candle{
    private String scent;


    /** Setters **/
    public void setScent(String scent) {
        this.scent = scent;
    }

    public void setHeight(Double height){
        super.height = height;
        super.price = 3d * height;

    }

    /** Getters **/
    public String getScent() {
        return scent;
    }


}
