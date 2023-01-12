package UshAbstragimiSeanca9;

public class Banke extends ATM {
    private int employeeNumber;
    private String name;
    private int clientNumber;
    private double totalCapital;
    private double commisionKapital;
    private double commisionRate;

    public Banke(String name, int empolyeeNumber, int clientNumber, double totalCapital){
        this.name = name;
        this.clientNumber = clientNumber;
        this.employeeNumber = empolyeeNumber;
        this.totalCapital = totalCapital;
    }

    @Override
    public double commission(double terheqje) {
        commisionKapital += terheqje;
        System.out.println("Komisioni "+ terheqje + " iu shtua Kapitalit te komisionit " + this.commisionKapital);
        return commisionKapital;
    }

    public double withdraw(double sasi){
        System.out.println("Ju terhoqet " + sasi + " nga Kapitali Total: " + this.totalCapital );
        totalCapital -= sasi;

        return totalCapital;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
    }

    public double getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(double totalCapital) {
        this.totalCapital = totalCapital;
    }

    public double getCommisionKapital() {
        return commisionKapital;
    }

    public void setCommisionKapital(double commisionKapital) {
        this.commisionKapital = commisionKapital;
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        this.commisionRate = commisionRate;
    }

    public String toString(){
        return "Client: " + this.name + "  with number: " + this.employeeNumber + " has this commission " + this.commisionKapital + " and " + this.totalCapital + " total Capital";
    }

}
