package sample.org;

import org.phone.PhoneInfo;

public class Sample {
	
	
	public void phoneName() {
		System.out.println("Samsung Galaxy M21");
	}
	
	public void phoneMieiNum() {
		System.out.println("156473897586943");
	}
	
	public void Camera() {
		System.out.println("1080x2340 pixels");
	}
	
	public void storage() {
		System.out.println("64GB/128GB");
	}
	
	public void osName() {
		System.out.println("Android 10, upgradable to Android 11, One UI 3.1 Core");
	}
	
	public static void main(String[] args) {
    PhoneInfo po = new PhoneInfo();
    po.phoneName();
    po.phoneMieiNum();
    po.Camera();
    po.storage();
    po.osName();
	}
	
	

}
