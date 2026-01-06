import java.util.Scanner;

public class removeVowel_scaler {

//    void removeVowel(String str){
//        String result="";
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if(ch!='a'&& ch!='e'&& ch!='i' && ch!='o' && ch!='u' &&
//                    ch!='A'&& ch!='E'&& ch!='I' && ch!='O' && ch!='U' ){
//                result+=ch;
//            }
//
//        }
//
//        System.out.println("Sentence after removing vowel : "+result);
//    }

 void reverseVowel(String str){
    char[]s=str.toCharArray();
    int i=0;
    int j=s.length-1;
    while(i<j){
        while(s[i] !='a'&& s[i] !='e' && s[i] !='i' && s[i]!='o' && s[i]!='u' &&
                s[i] !='A'&& s[i] !='E' && s[i] !='I' && s[i]!='O' && s[i]!='U'){
            i++;
        }

            while(s[j] !='a'&& s[j] !='e' && s[j] !='i' && s[j]!='o' && s[j]!='u' &&
                    s[j] !='A'&& s[j] !='E' && s[j] !='I' && s[j]!='O' && s[j]!='U'){
                j--;
            }
           if(i>=j){
               break;
           }
        char ch=s[i];
        s[i]=s[j];
        s[j]=ch;
        i++;
        j--;
    }
for(int k=0;k<s.length;k++){
    System.out.print(s[k]);
}


}

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your sentence : ");
        String sentence= sc.nextLine();
removeVowel_scaler reverse=new removeVowel_scaler();
reverse.reverseVowel(sentence);
//remove.removeVowel(sentence);

       }
    }

