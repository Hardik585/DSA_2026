package lec_14;

import java.util.ArrayList;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<Integer> arrList =new ArrayList<Integer>();
         System.out.println(arrList);
         arrList.add(10);    // 0(1)
         arrList.add(20);   // 0(1)
         arrList.add(30);  // 0(1)
         
         System.out.println(arrList);
         
         arrList.add(2, -9);  //no elm delete, elm shifted 
         
         System.out.println(arrList);
         
         //remove
         
	}

}
