import java.util.Scanner;
public class vc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str;
        int vowel=0,consonant=0;
        System.out.println("Enter the String:");
        str = sc.nextLine();
        for(int i=0; i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                vowel++;
            }
            else if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
            {
                consonant++;
            }
        }
        System.out.println("Vowels:"+vowel);
        System.out.println("Consonants:"+consonant);
    }
}