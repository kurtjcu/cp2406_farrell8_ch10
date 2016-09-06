/**
 * Created by kurt on 6/09/2016.
 */
public class PetSold extends ItemSold {

    private Boolean vaccinated;
    private Boolean neutered;
    private Boolean houseTrained;


    /** Setters **/

    public void setVaccinated(Boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public void setNeutered(Boolean neutered) {
        this.neutered = neutered;
    }

    public void setHouseTrained(Boolean houseTrained) {
        this.houseTrained = houseTrained;
    }

    /** Getters **/

    public Boolean getVaccinated() {
        return vaccinated;
    }

    public Boolean getNeutered() {
        return neutered;
    }

    public Boolean getHouseTrained() {
        return houseTrained;
    }

    public String toString(){
        return( super.toString() + " "
                + (getVaccinated() == true ? " Vaccinated" : "not Vaccinated") + " "
                + (getNeutered() == true ? " Neutered" : "not Neutered") + " "
                + (getHouseTrained() == true ? " HouseTrained" : "not HouseTrained") );
    }
}
