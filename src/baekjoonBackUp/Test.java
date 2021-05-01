package baekjoonBackUp;

public class Test {

	public static void main(String[] args) {
		String[] arrNum = new String[3];
//		arrNum[0]="1";
//		arrNum[1]="0";
//		arrNum[2]="2";

		String[] arrChar = new String[2];
		arrChar[0]="가산동";
//		arrChar[1]="가산디지털단지";
		
		String sqlResult ="select * from tabel where 1=1";
		String sqlLoc="";
		String sqlOption="";
		
		for(int k=0; k<arrChar.length; k++) {
			if(arrChar[k]==null) {break;} 	
			sqlLoc +=" and loc="+"'"+arrChar[k]+"'"+" and subway="+"'"+arrChar[k]+"'";	
		}
		
		for(int i=0; i<arrNum.length; i++) {
			if(arrNum[i]==null) {break;} 
			int j = Integer.parseInt(arrNum[i]);
					
			switch (j) {
			case 0: sqlOption += " and column=1"; break;
			case 1:	sqlOption += " and column2=1"; break;
			case 2:	sqlOption += " and column3=1"; break;
			default: break;
			}
		}
		System.out.println(sqlResult + sqlOption + sqlLoc +";");
	}
}
