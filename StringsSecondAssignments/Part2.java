
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {
    public int howMany(String stringa, String stringb){
        int where = 0;
        int count = 0;
        while(true){
            int currIndex = stringb.indexOf(stringa, where);
            if(currIndex != -1){ count += 1;}
            else{ break;}
            where = currIndex + stringa.length();
        }
        return count;
    }
    
    public void testHowMany(){
        System.out.println(howMany("GA", "ATGATGGAGA"));
        System.out.println(howMany("GG", "ATGATGGGGG"));
    }

}
