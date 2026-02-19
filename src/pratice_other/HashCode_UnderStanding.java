package pratice_other;

//public class HashCode_UnderStanding {
//	public static void main(String[] args) {
//		
//		HashCode_UnderStanding obj = new HashCode_UnderStanding();
//		HashCode_UnderStanding obj2 = new HashCode_UnderStanding();
//		HashCode_UnderStanding obj3 = obj2;
//		System.out.println(obj.hashCode()); //	925858445
//		System.out.println(obj2.hashCode());//	798154996
//		System.out.println(obj3.hashCode()); // 798154996

// 	}	
//}

public class HashCode_UnderStanding {
	public static void main(String[] args) {
		HashCode_UnderStanding obj = new HashCode_UnderStanding();
		HashCode_UnderStanding obj2 = new HashCode_UnderStanding();
		System.out.println(obj.hashCode());  //1159190947
		System.out.println(obj2.hashCode()); // 1159190947
	}
	
	public int hashCode() {
		return getClass().hashCode();
	}
}
