import java.util.ArrayList;

/**
 * Created by kurt on 6/09/2016.
 */
public class DemoItemsAndPets {

    public static void main(String[] args) {
        Integer[] iInvNum = { 1, 2, 3, 4};
        String[] sDescription = {"boring", "Fluffy as", "needless", "Super Happy Shiny Disco Dog"};
        Double[] dPrice = {1.23, 200.50, 64.30, 1200d};
        Boolean [] bVaccinated = {true, false};
        Boolean [] bNeutered = {true, false};
        Boolean [] bHouseTrained = {true, false};

        ArrayList<ItemSold> itemList = new ArrayList<>();

        for(int i = 0; i < iInvNum.length; i++){

            if (i % 2 == 0){
                ItemSold tempItem = new ItemSold();
                tempItem.setInvoiceNo(iInvNum[i]);
                tempItem.setDescription(sDescription[i]);
                tempItem.setPrice(dPrice[i]);
                itemList.add(tempItem);
            } else {
                PetSold tempItem = new PetSold();
                tempItem.setInvoiceNo(iInvNum[i]);
                tempItem.setDescription(sDescription[i]);
                tempItem.setPrice(dPrice[i]);
                tempItem.setVaccinated(bVaccinated[i/2]);
                tempItem.setNeutered(bNeutered[i/2]);
                tempItem.setHouseTrained(bHouseTrained[i/2]);


                itemList.add(tempItem);
            }
        }

        for(ItemSold  item : itemList){
            System.out.println(item);
        }

    }
}
