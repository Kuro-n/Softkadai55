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
        System.out.println(translateEng(input));
    	}
    }
    

    // 数値を英訳する変換するメソッド
    public static String translateEng(int n) {
    	
    	
    	//一番目の人（じま）1~10までの範囲の出力
    }
    
    public String show1(int n) {
   
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
    	
    public String showTeen(int n) {
    	 // if(n>10) {
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
    public String show2(int n) {
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
}
	
    	
    
    
    	    
    
    	    
    		
    		
