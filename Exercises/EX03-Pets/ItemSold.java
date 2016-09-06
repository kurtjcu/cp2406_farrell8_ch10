/**
 * Created by kurt on 6/09/2016.
 */
public class ItemSold {
    protected Integer invoiceNo;
    protected String description;
    protected Double price;



    /** Setters **/
    public void setInvoiceNo(Integer invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    /** Getters **/

    public Integer getInvoiceNo() {
        return invoiceNo;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String toString(){
        return( getInvoiceNo() + " " + getDescription() + " " + getPrice());
    }
}
