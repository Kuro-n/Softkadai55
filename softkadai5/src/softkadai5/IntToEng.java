package softkadai5;

import java.util.Scanner;

public class IntToEng {
    // メインメソッド
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("数字を入力してください: ");
        int input = sc.nextInt();
        System.out.println(translateEng(input));
    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	//一番目の人（じま）1~10までの範囲の出力
    	String no = "";
    	  switch (n) {
    	   case 0: break;
    	   case 1: no = "one"; break;
    	   case 2: no = "two"; break;
    	   case 3: no = "three"; break;
    	   case 4: no = "four"; break;
    	   case 5: no = "five"; break;
    	   case 6: no = "six"; break;
    	   case 7: no = "seven"; break;
    	   case 8: no = "eight"; break;
    	   case 9: no = "nine"; break;
    	   case 10: no = "ten"; break;
    	  }
    	  //return no;
    //}
    
    //２桁の取扱い
    
    if(n>10) {
    	
    	 switch (n%10) {
			
    	 	case 0: break;
			case 1: no = "eleven"; break;
			case 2: no = "twelve"; break;
			case 3: no = "thirteen"; break;
			case 4: no = "fourteen"; break;
			case 5: no = "fifteen"; break;
			case 6: no = "sixteen"; break;
			case 7: no = "seventeen"; break;
			case 8: no = "eighteen"; break;
			case 9: no = "nineteen"; break;
			
    	}
    }
    	return no;
    }
    	
}
	 
  	