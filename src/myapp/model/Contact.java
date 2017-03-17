package myapp.model;

public class Contact {
	String id, EmployeeName, MobileNo, HomeNo, OfficeNo, Email;
public Contact()
{
	
}

	public Contact(String id, String employeeName, String mobileNo, String homeNo, String officeNo, String email) {
		super();
		this.id = id;
		EmployeeName = employeeName;
		MobileNo = mobileNo;
		HomeNo = homeNo;
		OfficeNo = officeNo;
		Email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}

	public String getHomeNo() {
		return HomeNo;
	}

	public void setHomeNo(String homeNo) {
		HomeNo = homeNo;
	}

	public String getOfficeNo() {
		return OfficeNo;
	}

	public void setOfficeNo(String officeNo) {
		OfficeNo = officeNo;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

}
