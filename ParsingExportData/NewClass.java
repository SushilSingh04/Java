import edu.duke.*;
import org.apache.commons.csv.*;
/**
 * Write a description of NewClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewClass {
    public void tester(){
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        listExportersTwoProducts(parser, "cotton", "flower");
        //parser = fr.getCSVParser();
        //System.out.println(numberOfExporters(parser, "cocoa"));
        bigExporters(parser, "$999,999,999,999");
    }
    
    public String countryInfo(CSVParser parser, String country){
        for(CSVRecord record : parser){
            if(record.get("Country").equals(country)){
                String info = record.get("Country") + " : " + record.get("Exports") + " : " + record.get("Value (dollars)");
                return info;
            }
            
        }
        return "NOT FOUND";
    }
    
    public void listExportersTwoProducts(CSVParser parser, String exportItem1, String exportItem2){
        for(CSVRecord record : parser){
            if(record.get("Exports").contains(exportItem1) && record.get("Exports").contains(exportItem2)){
                System.out.println(record.get("Country"));
            }
        }
    }
    
    public int numberOfExporters(CSVParser parser, String exportItem){
        int count = 0;
        for(CSVRecord record : parser){
            if(record.get("Exports").contains(exportItem)){
                count += 1;
            }
        }
        return count;
    }
    
    public void bigExporters(CSVParser parser, String amount){
        String max = "";
        for(CSVRecord record : parser){
            String rec = record.get("Value (dollars)");
            if(rec.length() > amount.length()){
                max = rec;
                System.out.println(record.get("Country"));
            }
        }
    }
}


