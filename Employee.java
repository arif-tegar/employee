
public class Employee {
  private String nama;  
    private double nominal, Salary;

	public double  getSalary() {
		return this.Salary;
	}

	public void setSalary(double  Salary) {
		this.Salary = Salary;
	}
	public String getnama() {
		return this.nama;
	}

	public void setnama(String nama) {
		this.nama = nama;
	}

	public double getNominal() {
		return this.nominal;
	}

	public void setNominal(double nominal) {
		this.nominal = nominal;
	}
;

public Employee (String name, double nominale) {
  nama = name;
  nominal = nominale;
}
public void print() {    
    System.out.println("____________________________");      
    System.out.println("nama: " + nama);
    System.out.println("nominal: " + nominal);
    System.out.println("____________________________");
}

}
