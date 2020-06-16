package softkadai5;

import java.util.Scanner;

public class IntToEng {
    // メインメソッド
    public static void main(String[] args) {
    	//とりあえず１００回できる
    	for (int i = 1; i <= 100; i++) {
    	Scanner sc = new Scanner(System.in);
        System.out.print("数字を入力してください: ");
        int input = sc.nextInt();
        //IntToEng sh1 = new IntToEng();
        //IntToEng sh2 = new IntToEng();
        //IntToEng shT = new IntToEng();
        System.out.println(translateEng(input));
    	}
    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	 IntToEng sh1 = new IntToEng();
         IntToEng sh2 = new IntToEng();
         IntToEng shT = new IntToEng();
		String a=null;
         if (n/ 10 == 0) {
			a=sh1.show1(n);
		} else if (n / 10 == 1) {
			a=shT.showTeen(n);
		} else if (n / 10 > 1 && n/10 <= 9) {
			a=sh2.show2(n) + " "+ sh1.show1(n%10);
		} else if (n/ 10 >= 10 && n/10 <= 90) {
			a=sh1.show1(n / 100) + " hundred and "+ sh2.show2(n%100) + " " + sh1.show1(n%10);
		}

    	return a;
    }//メソッドを呼ぶ
    	//一番目の人（じま）1~10までの範囲の出力
    
    public String show1 (int n) {
    
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
    	  return no;
    }
    
    //２桁の取扱い
    public String show2 (int n) {
		String no = "";
		switch (n/10) {
			case 0: break;
			case 2: no = "twenty"; break;
			case 3: no = "thirty"; break;
			case 4: no = "forty"; break;
			case 5: no = "fifty"; break;
			case 6: no = "sixty"; break;
			case 7: no = "seventy"; break;
			case 8: no = "eighty"; break;
			case 9: no = "ninety"; break;
		}
		return no;
	}
   // if(n>10) {
    public String showTeen (int n) {	
    	String no = "";
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
    
    	return no;
    }
    	
}
	 
  	