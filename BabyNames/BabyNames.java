import edu.duke.*;
import org.apache.commons.csv.*;
import java.io.File;
/**
 * Write a description of BabyNames here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BabyNames {
    public void totalBirths(FileResource fr){
        int totalBoys = 0;
        int totalGirls = 0;
        int totalBirths = 0;
        CSVParser parser = fr.getCSVParser(false);
        for(CSVRecord rec : parser){
            int numBorn = Integer.parseInt(rec.get(2));
            totalBirths += numBorn; 
            if(rec.get(1).equals("M")){
                totalBoys += numBorn;
            }
            else{
                totalGirls += numBorn; 
            }
        }
            System.out.println("totalbirths = " + totalBirths);
            System.out.println("total boys = " + totalBoys);
            System.out.println("total girls = " + totalGirls);
    }
    
    public void numberOfNames(FileResource fr){
        int girlsNames = 0;
        int boysNames = 0;
        int totalNames = 0;
        for(CSVRecord rec : fr.getCSVParser(false)){
            totalNames++;
            if(rec.get(1).equals("F")){
                girlsNames++;
            }
            else{
                boysNames++;
            }
        }
        System.out.println(totalNames);
        System.out.println(girlsNames);
        System.out.println(boysNames);
    }
    
    public void testNumberOfNames(){
        FileResource fr = new FileResource();
        numberOfNames(fr);
    }
    
    public void testTotalBirths(){
        FileResource fr = new FileResource();
        totalBirths(fr);
    }
    
    public int getRank(CSVParser parser, String name, String gender){
        int rank = 0;
        String name1 = "";
        for(CSVRecord rec : parser){
            if(rec.get(1).equals(gender)){
                if(rec.get(0).equals(name)){
                    name1 = rec.get(0);
                    rank++;
                    break;
                }
                else{
                    rank++;
                }
            }
            else{
                continue;
            }
        }
        //DON'T COMPARE STRINGS IN JAVA USING EQUALITY OPERATOR!!!!!!
        if(name1.equals(name)){
            return rank;
        }
        else{
            return -1;
        }
    }
        
    public void testGetRank(){
        FileResource fr = new FileResource();
        System.out.println(getRank(fr.getCSVParser(false),"Frank", "M"));
    }
    //getRank(parser, rec.get(0), gender)
    public String getName(CSVParser parser, int rank, String gender){
        String name = "";
        int count = 0;
        for(CSVRecord rec : parser){
            if(rec.get(1).equals(gender)){
                count++;
                if(count == rank){
                    name = rec.get(0);
                }
            }
            else{
                continue;
            }
        }
        if(name.equals("")){ name = "NO NAME";}
        return name;
    }
    
    public void testGetName(){
        FileResource fr = new FileResource();
        System.out.println(getName(fr.getCSVParser(false), 450, "M"));
    }
    
    public void whatIsNameInYear(String name, CSVParser parser1, CSVParser parser2, String gender){
        int rank = getRank(parser1, name, gender);
        String newName = getName(parser2, rank, gender);
        System.out.println(name + " born in prevoius year would be " + newName + " if she/he was born in this year");
    }
    
    public void testWhatIsNameInYear(){
        FileResource fr1 = new FileResource();
        FileResource fr2 = new FileResource();
        whatIsNameInYear("Owen", fr1.getCSVParser(false), fr2.getCSVParser(false), "M");
    }
    
    public String yearOfHighestRank(String name, String gender){
        int rankMax = -1;
        String yearHighest = "";
        DirectoryResource dr = new DirectoryResource();
        for(File f : dr.selectedFiles()){
            FileResource fr = new FileResource(f);
            CSVParser parser = fr.getCSVParser(false);
            int rank = getRank(parser, name, gender);
            //System.out.println(rank);
            if(rankMax == -1 && rank != -1){ rankMax = rank;}
            else if(rank != -1){
                if(rank < rankMax){
                    rankMax = rank;
                    yearHighest = f.getName().substring(3, 7);
                    //System.out.println(yearHighest);
                }
                else if(rank == rankMax){ yearHighest += (" & " + f.getName().substring(3, 7));}
            }
        }
        return yearHighest;
    }

    
    public void testyearOfHighestRank(){
        System.out.println(yearOfHighestRank("Mich", "M"));
    }
    
    public double getAverageRank(String name, String gender){
        int sum = 0;
        int count = 0;
        DirectoryResource dr = new DirectoryResource();
        for(File f : dr.selectedFiles()){
            FileResource fr = new FileResource(f);
            CSVParser parser = fr.getCSVParser(false);
            int rank = getRank(parser, name, gender);
            //System.out.println(rank);
            if(rank != -1){
                sum += rank;
                count++;
            }
        }
        if(count == 0){
            System.out.println("Try a different combination");
            return -1;
        }
        else{
            return (double)(sum)/count;
        }
    }
    
    public void testAverageRank(){
        System.out.println(getAverageRank("Robert", "M"));
    }
    
    public int getTotalBirthsRankedHigher(CSVParser parser, String name, String gender){
        int totalBirthsSum = 0;
        //int count = 0;
        for(CSVRecord rec : parser){
           // System.out.println(getRank(parser, name, gender) != -1);
            //if(getRank(parser, name, gender) != -1){
                if(rec.get(1).equals(gender)){
                    //System.out.println(rec.get(2));
                    if(rec.get(0).equals(name)){
                        break;
                    }
                    else{
                        totalBirthsSum += Integer.parseInt(rec.get(2));
                    }
                }
                else{
                    continue;
                }
           // }
        }
        return totalBirthsSum;
    }
    
    public void testGetTotalBirthsRankedHigher(){
        FileResource fr = new FileResource();
        System.out.println(getTotalBirthsRankedHigher(fr.getCSVParser(false), "Drew", "M"));
    }
    
}
