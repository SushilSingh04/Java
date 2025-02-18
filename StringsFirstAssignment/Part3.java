
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
    public Boolean twoOccurances(String stringa, String stringb){
        int firstIndex = stringb.indexOf(stringa);
        if(stringb.indexOf(stringa) != -1 && stringb.indexOf(stringa, firstIndex + stringa.length()) != -1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public String lastPart(String stringa, String stringb){
        int index = stringb.indexOf(stringa);
        if(stringb.indexOf(stringa) != -1){
            return stringb.substring(index + stringa.length());
        }
        else{
            return stringb;
        }
    }
    
    public void testing(){
        String s1 = "zlogy";
        String s2 = "Greatgreat";
        System.out.println(twoOccurances("o", s1));
        System.out.println(twoOccurances("reat", s2));
        System.out.println(lastPart("xerox", s1));
        System.out.println(lastPart("reat", s2));

    }

}
