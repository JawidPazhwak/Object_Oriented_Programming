public class StringManipulation {
    public String str;
    
    public void reverseString(String str){
        this.str = str;
        System.out.println("Reversed string: ");
        for(int i = this.str.length() - 1; i >= 0; i --){
        System.out.print(this.str.charAt(i));
       }
    }
    public void countVowel(String str){
        this.str = str;
        int counter = 0;
        for(int i = 0; i < str.length(); i ++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U'){
                counter ++;
            }
            else{
                continue;
        }
    }
        System.out.println("Vowels: " + counter);
    }
    public boolean palindrome(String str){
        this.str = str;
        String result = "";
        for(int i = str.length() - 1; i >=0 ; i --){
            result = result + str.charAt(i);
        }
        if(result.equals(str)){
            return true;
        }
        else{
            return false;
        }
    }
}
