import java.util.HashMap;

public class max_Frequency {
    public static void main(String[] args) {
        String st="vsjhsdjvhsdkjsdksgafkafg";
        maxFreq(st);
    }
public static void maxFreq(String st){
    HashMap<Character,Integer>fmap=new HashMap<>();
    for(int i=0;i<st.length();i++){
        char ch=st.charAt(i);
        if(fmap.containsKey(ch)){
        int cFre=fmap.get(ch);
        fmap.put(ch,cFre+1);
        }else{
        fmap.put(ch,1);
        }

    }
    int maxVal=0;
    char maxChar='a';
    for(char c: fmap.keySet()){
        if(fmap.get(c)>maxVal){
            maxVal= fmap.get(c);
            maxChar=c;

        }
    }
    System.out.println(maxChar +" "+maxVal);

}



}

