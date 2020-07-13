public class ConClass {

    String conName, conTel, conEmail, conPhyAddress;

    public ConClass(){
        this.conName = null;
        this.conTel = null;
        this.conEmail = null;
        this.conPhyAddress = null;
    }

    public void setConName(String conName) {
        this.conName = conName;
    }

    public void setConTel(String conTel) {
        this.conTel = conTel;
    }

    public void setConEmail(String conEmail) {
        this.conEmail = conEmail;
    }

    public void setConPhyAddress(String conPhyAddress) {
        this.conPhyAddress = conPhyAddress;
    }

    public String getConName() {
        return conName;
    }

    public String getConTel() {
        return conTel;
    }

    public String getConEmail() {
        return conEmail;
    }

    public String getConPhyAddress() {
        return conPhyAddress;
    }

    public String toString() {
        String output = "The contractor's details: \n";
        output += "The full name " + getConName() + "\n";
        output += "The telephone number: " + getConTel() + "\n";
        output += "The email address: " + getConEmail() + "\n";
        output += "The Physical Address: " + getConPhyAddress() + "\n";

        return output;
    }

    public String[] informationFile (){
        String[] infoQueue = new String[4];

        infoQueue[0] = getConName();
        infoQueue[1] = getConTel();
        infoQueue[2] = getConEmail();
        infoQueue[3] = getConPhyAddress();


        return  infoQueue;
    }
}
