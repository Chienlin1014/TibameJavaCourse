package practice_temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_002 {

	public static void main(String[] args) {
		int i;
		try {
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			String str =br.readLine();
			i= Integer.parseInt(str);
		}catch(IOException e) {
			System.out.println("發生IO事件");
			i=5;
		}
		}
	}


