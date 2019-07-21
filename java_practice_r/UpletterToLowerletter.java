public class UpletterToLowerletter{
	public static void main(String[] args){
		char c = 'A';
        int num = c + 32 ; // char+int=int ;
        char x = (char) num ; // int转char需要强转
        System.out.println(x) ;
		
	}
}