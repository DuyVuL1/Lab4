
public class Test {
	public static void main(String[] args) {
		BenhVien bv1 = new BenhVien("Lao Cai", "Lao Cai", "Nguyen Duy Vu");
		BenhNhan bn1 = new BenhNhan("Pham Thien Hoang", 19, '♂',"Benh Tim", "Suy Tim", bv1);
		
		
		System.out.println(bn1.toString());
		
	}
}