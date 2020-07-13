public class CusClass {

    String cusName, cusTel, cusEmail, cusPhyAddress;

    public CusClass() {
        this.cusName = null;
        this.cusTel = null;
        this.cusEmail = null;
        this.cusPhyAddress = null;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public void setCusTel(String cusTel) {
        this.cusTel = cusTel;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    public void setCusPhyAddress(String cusPhyAddress) {
        this.cusPhyAddress = cusPhyAddress;
    }

    public String getCusName() {
        return cusName;
    }

    public String getCusTel() {
        return cusTel;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public String getCusPhyAddress() {
        return cusPhyAddress;
    }

    public String toString() {
        String output = "The customer's details: \n";
        output += "The full name " + getCusName() + "\n";
        output += "The telephone number: " + getCusTel() + "\n";
        output += "The email address: " + getCusEmail() + "\n";
        output += "The Physical Address: " + getCusPhyAddress()+ "\n";

        return output;
    }


}