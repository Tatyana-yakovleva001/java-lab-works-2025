
public class ServiceCenter {

    private String NameStation;
    private String stationAdress;
    private String repairType;
    private String receiptDate;
    private String issueDate;
    private String repairResult;
    private String personel;

    private double repairCoust;

    public ServiceCenter() {

    }

    public ServiceCenter(String nameStation, String stationAdress, String repairType, String receiptDate,
                         String issueDate, String repairResult, String personel, double repairCoust) {
        NameStation = nameStation;
        this.stationAdress = stationAdress;
        this.repairType = repairType;
        this.receiptDate = receiptDate;
        this.issueDate = issueDate;
        this.repairResult = repairResult;
        this.personel = personel;
        this.repairCoust = repairCoust;
    }

    public String getNameStation() {
        return NameStation;
    }

    public void setNameStation(String nameStation) {
        NameStation = nameStation;
    }

    public String getStationAdress() {
        return stationAdress;
    }

    public void setStationAdress(String stationAdress) {
        this.stationAdress = stationAdress;
    }

    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType;
    }

    public String getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(String receiptDate) {
        this.receiptDate = receiptDate;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getRepairResult() {
        return repairResult;
    }

    public void setRepairResult(String repairResult) {
        this.repairResult = repairResult;
    }

    public String getPersonel() {
        return personel;
    }

    public void setPersonel(String personel) {
        this.personel = personel;
    }

    public double getRepairCost() {
        return repairCoust;
    }

    public void setRepairCoust(double repairCoust) {
        this.repairCoust = repairCoust;
    }


    @Override
    public String toString(){
        return "Станция техобслуживания:\n" +
                "Название станции " + NameStation + "\n" +
                "Автотранспорт на ремонте " + stationAdress + "\n" +
                "Вид ремонта " + repairType + "\n" +
                "Дата выдачи " + issueDate + "\n" +
                "Результат ремонта" + repairResult + "\n" +
                "Персонал " + personel + "\n" +
                "Сумма ремонта " + repairCoust + " руб.\n";
    }
}



