/**
 * Created by kurt on 6/09/2016.
 */

import java.util.*;
public class DemoHorses {

    String[] sHorsesName = {"Charlie", "Steed"};
    String[] sHorsesColour = {"Shit Brown", "Chocolate"};
    Integer[] iHorseYear = {1861, 1885};

    ArrayList<Horse> horseArrayList;

    String[] sRaceHorsesName = {"Racing Charlie", "Racing Steed"};
    String[] sRaceHorsesColour = {"Racing Shit Brown", "Racing Chocolate"};
    Integer[] iRaceHorseYear = {1961, 1985};
    Integer[] iRaceHorseRaceNum = {5, 9};
    ArrayList<RaceHorse> RacehorseArrayList;

    public static void main(String[] args) {
        DemoHorses myDemoHorse = new DemoHorses();

        myDemoHorse.horseArrayList = new ArrayList<>();
        myDemoHorse.RacehorseArrayList = new ArrayList<>();

        for( int i = 0; i < myDemoHorse.sHorsesName.length; i++){
            Horse tempHorse = new Horse();
            tempHorse.setName(myDemoHorse.sHorsesName[i]);
            tempHorse.setColour(myDemoHorse.sHorsesColour[i]);
            tempHorse.setBirthYear(myDemoHorse.iHorseYear[i]);

            myDemoHorse.horseArrayList.add(tempHorse);
        }

        for( int i = 0; i < myDemoHorse.sRaceHorsesName.length; i++){
            RaceHorse tempHorse = new RaceHorse();
            tempHorse.setName(myDemoHorse.sRaceHorsesName[i]);
            tempHorse.setColour(myDemoHorse.sRaceHorsesColour[i]);
            tempHorse.setBirthYear(myDemoHorse.iRaceHorseYear[i]);
            tempHorse.setNumRaces(myDemoHorse.iRaceHorseRaceNum[i]);

            myDemoHorse.RacehorseArrayList.add(tempHorse);
        }

    }


}
