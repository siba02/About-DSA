class palindrome {

    public static boolean ispalindrome(int x){
        if(x<0){
            return false;
        }
        int rev=0;
        int temp=x;
        int rem;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if (rev==x){
            System.out.println(rev+" is a palindrome");
        }
        else{
            System.out.println(rev+" is not a palindrome");
        }
        return (rev==x);
        
    }

    public static void main(String[] args){
        int x=121;
        palindrome. ispalindrome(x);

    }
}