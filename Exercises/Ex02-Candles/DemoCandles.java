/**
 * Created by kurt on 6/09/2016.
 */
public class DemoCandles {
    public static void main(String[] args) {

        Candle candle= new Candle();
        candle.setColour("Blue");
        candle.setHeight(4.5d);

        System.out.println("candle is " + candle.getColour()
                + "\n and is " + candle.getHeight() + " high"
                + "\n It will cost you: $" + candle.getPrice());

        ScentedCandle stinkyCandle= new ScentedCandle();
        stinkyCandle.setColour("Pink");
        stinkyCandle.setHeight(2d);

        System.out.println("Stinky candle is " + stinkyCandle.getColour()
                + "\n and is " + stinkyCandle.getHeight() + " high"
                + "\n It will cost you: $" + stinkyCandle.getPrice());
    }
}
