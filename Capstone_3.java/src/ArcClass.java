public class ArcClass {

    String arcName,arcTel,arcEmail,arcPhyAddress;

    public ArcClass(){
        this.arcName = null;
        this.arcTel = null;
        this.arcEmail = null;
        this.arcPhyAddress = null;
    }

    public void setArcName(String arcName) {
        this.arcName = arcName;
    }

    public void setArcTel(String arcTel){
        this.arcTel = arcTel;
    }

    public void setArcEmail(String arcEmail) {
        this.arcEmail = arcEmail;
    }

    public void setArcPhyAddress(String arcPhyAddress) {
        this.arcPhyAddress = arcPhyAddress;
    }

    public String getArcName() {
        return arcName;
    }

    public String getArcTel() {
        return arcTel;
    }

    public String getArcEmail() {
        return arcEmail;
    }

    public String getArcPhyAddress() {
        return arcPhyAddress;
    }

    public String toString() {
       String output = "The architect's details: \n";
       output += "The full name " + getArcName() + "\n";
       output += "The telephone number: " + getArcTel() + "\n";
       output += "The email address: " + getArcEmail() + "\n";
       output += "The Physical Address: " + getArcPhyAddress() + "\n";

       return output;
    }

    public String[] informationFile (){
        String[] infoQueue = new String[4];

        infoQueue[0] = getArcName();
        infoQueue[1] = getArcTel();
        infoQueue[2] = getArcEmail();
        infoQueue[3] = getArcPhyAddress();


        return  infoQueue;
    }
}

