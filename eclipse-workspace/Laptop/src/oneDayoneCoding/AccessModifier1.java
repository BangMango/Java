package oneDayoneCoding;

public class AccessModifier1 {
	private String name;
	private Integer age;
	private String address;
	private Boolean gender=null;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(Integer age) {
		this.age=age;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public void setGender(Boolean gender) {
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	public Boolean getGender() {
		return gender;
	}
}
