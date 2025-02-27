import java.util.ArrayList;
import edu.duke.*;
/**
 * Write a description of CharactersInPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharactersInPlay {
    private ArrayList<String> charNames;
    private ArrayList<Integer> freqNames;
    
    public CharactersInPlay(){
        charNames = new ArrayList<String>();
        freqNames = new ArrayList<Integer>();
    }
    
    private void update(String person){
        person = person.toLowerCase();
        int index = charNames.indexOf(person);
        if(index == -1){
            charNames.add(person);
            freqNames.add(1);
        }
        else{
            int freq = freqNames.get(index);
            freqNames.set(index, freq + 1);
        }
    }
    
    public void findAllCharacters(){
        charNames.clear();
        freqNames.clear();
        FileResource fr = new FileResource();
        for(String s : fr.lines()){
            s = s.trim();
            int dotIndex = s.indexOf(".");
            if(dotIndex != -1){
                update(s.substring(0, dotIndex));
            }
        }
    }
    
    private int maxIndex(){
        int max = freqNames.get(0);
        int maxIndex = 0;
        for(int k = 0; k < freqNames.size(); k++){
            if(freqNames.get(k) > max){
                max = freqNames.get(k);
                maxIndex = k;
            }
        }
        return maxIndex;
    }
    
    public void charactersWithNumParts(int num1, int num2){
        for(int  i  = 0; i < freqNames.size(); i++){
            if(freqNames.get(i) >= num1 && freqNames.get(i) <= num2){
                System.out.println("Character Name - " + charNames.get(i) + "  Lines " + freqNames.get(i));
            }
        }
    }
    
    public void tester(){
        findAllCharacters();
        //int moreThan = 2;
        //System.out.println(maxIndex());
        //System.out.println("Main Character\t" + charNames.get(maxIndex()) + " has " + freqNames.get(maxIndex()) + " speaking parts");
        charactersWithNumParts(10, 15);
        /*for(int i = 0; i < freqNames.size(); i++){
                System.out.println("Character Name -\t" + freqNames.get(i));
        }*/
    }
}
