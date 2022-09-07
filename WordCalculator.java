import java.util.*;
import java.lang.*;

public class WordCalculator{
    public static String wc(String s){
        int index=0;
        char operator=' ';
        String result="";
        HashMap<String, Character> mp = new HashMap<>();
        Stack<Character> st = new Stack<>();
        Stack<Character>st1 = new Stack<>();
        StringBuilder op1=new StringBuilder();
        StringBuilder op2=new StringBuilder();
        int r1=0;
        int r2=0;
        int answer=0;
        int temp=0;
        mp.put("zero",'0');
        mp.put("one",'1');
        mp.put("two",'2');
        mp.put("three",'3');
        mp.put("four",'4');
        mp.put("five",'5');
        mp.put("six",'6');
        mp.put("seven",'7');
        mp.put("eight",'8');
        mp.put("nine",'9');
        mp.put("plus",'+');
        mp.put("minus",'-');
         while(index<s.length()-1){
     
        if((index+2)<s.length()&&mp.containsKey(s.substring(index,index+3))){
            st.push(mp.get(s.substring(index,index+3)));
            index=index+3;
            
        }
        else
        if((index+3)<s.length()&&mp.containsKey(s.substring(index,index+4))){
            st.push(mp.get(s.substring(index,index+4)));
            index=index+4;
            
        }
        else
        if((index+4)<s.length()&&mp.containsKey(s.substring(index,index+5))){
            st.push(mp.get(s.substring(index,index+5)));
            index=index+5;
            
        }
        else{
        result="-1";
        break;}
        
        }
        
        while(!st.isEmpty())
          st1.push(st.pop());
         if(result=="-1" ||st1.peek()=='+'|| st1.get(0)=='+'||st1.peek()=='-'|| st1.get(0)=='-')
        return "-1";
   while(!st1.isEmpty()){
            
            
            while(!st1.isEmpty() && st1.peek()!='+' && st1.peek()!='-'){
                
                op1.append(st1.pop());
            
                
            }
            if(op1.length()!=0){
             temp=Integer.parseInt(op1.toString());
             answer=temp+answer;
             temp=0;}
            if(!st1.isEmpty()){
            operator=st1.pop();
                
            }
             while(!st1.isEmpty() && st1.peek()!='+' && st1.peek()!='-'){
                
                op2.append(st1.pop());
                
                
            }
             if(op2.length()==0){ 
                 if(st1.isEmpty());
                 else
                 return "-1";}
             if(op2.length()!=0){   
            temp=Integer.parseInt(op2.toString());}
            if(operator=='+'){
            answer+=temp;
                temp=0;}

if(operator=='-'){
            answer=answer-temp;
            temp=0;
            }
            op1.delete(0,op1.length());
            op2.delete(0,op2.length());
            
        }
        String abcd=Integer.toString(answer);
        
        HashMap<Character,String> mp1=  new HashMap<>();
        mp1.put('0',"zero");
        mp1.put('1',"one");
        mp1.put('2',"two");
        mp1.put('3',"three");
        mp1.put('4',"four");
        mp1.put('5',"five");
        mp1.put('6',"six");
        mp1.put('7',"seven");
        mp1.put('8',"eight");
        mp1.put('9',"nine");
        for(int k=0;k<abcd.length();k++){
            result+=mp1.get(abcd.charAt(k));
        }
        
        return result;
    }

    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        String ans = wc(str);
        System.out.println(ans);
    }
    
}

