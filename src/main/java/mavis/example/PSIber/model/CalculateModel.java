package mavis.example.PSIber.model;

public class CalculateModel {
	
	private int age;
	private String taxYear;
    private String taxAnnual;
    private String taxMonthly;
	private String medicalAidMembers;

    public int getAge() {
      return age;
    }
    public void setAge(int age) {
      this.age = age;
    }

    public String getTaxYear() {
       return taxYear;
    }
    public void setTaxYear(String taxYear) {
       this.taxYear = taxYear;
    }
   
    public String getTaxAnnual() {
       return taxAnnual;
    }
    public void setTaxAnnual(String taxAnnual) {
       this.taxAnnual = taxAnnual;
    }

    public String getTaxMonthly() {
        return taxMonthly;
     }
     public void setTaxMonthly(String taxMonthly) {
        this.taxMonthly = taxMonthly;
     }

    public String getMedicalAidMembers() {
       return medicalAidMembers;
    }
    public void setMedicalAidMembers(String medicalAidMembers) {
       this.medicalAidMembers = medicalAidMembers;
    }
}