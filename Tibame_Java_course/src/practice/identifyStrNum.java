package practice;

public class identifyStrNum {
	
	private String eNum(String str) {
		if(str==null) { //空字串回傳Unknow
			return "Unknow";
		}else {
			str=str.trim(); //去頭尾
			boolean isNum = str.chars().allMatch(Character::isDigit); //辨識是否數字
			if(isNum==false) {
				str="-1";
			}
			int i =Integer.parseInt(str); //轉整數
			if(i<0) {
				return "Unknow"; //小於零回傳Uknow
			}else if(i%2==0) { //判斷是否偶數
				return "Even"; 
			}else {
				return "Odd";
			}
		}
	}
	public static void main(String[] args) {
		identifyStrNum a=new identifyStrNum();
		String str=" -120.223 ";
		System.out.println(a.eNum(str));
	}
}