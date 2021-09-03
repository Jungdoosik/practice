package kh.oop1.day01.exam;

public class Pet {
	public static String petType;//펫의 종류
	private String petName;//펫의 이름
	private int petAge;//펫의 나이
	
	//생성자
	public Pet() {}
	//매개변수가 있는 생성자
	public Pet(String petType, String petName, int petAge) {
		this.petType = petType;
		this.petName = petName;
		this.petAge = petAge;
	}
	// getter
	public String getPetType() {
		return petType;
	}
	public String getPetName() {
		return petName;
	}
	public int getPetAge() {
		return petAge;
	}
	// setter
	public void setPetType(String petType) {
		this.petType = petType;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}
	

}
