
/**
 * Write a description of Part3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part3 {
    public int findStopCodon(String dna, int startIndex, String stopCodon){
        int stopIndex = dna.indexOf(stopCodon, startIndex + 3);
        while(stopIndex != -1){
            if((stopIndex - startIndex) % 3 == 0){
                return stopIndex;
            }
            else{
                stopIndex = dna.indexOf(stopCodon, stopIndex + 1);
            }
        }
        return dna.length();
    }
    
    public String findGene(String dna, int where){
        int startIndex = dna.indexOf("ATG", where);
        if(startIndex == -1){
            return "";
        }
        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG");
        int tgaIndex = findStopCodon(dna, startIndex, "TGA");
        int minIndex = Math.min(Math.min(taaIndex, tagIndex), tgaIndex);
        if(minIndex == dna.length()){
            return "";
        }
        else{
            return dna.substring(startIndex, minIndex + 3);
        }
    }
    
    public void printAllGenes(String dna){
        int startIndex = 0;
        while(true){
            String currGene = findGene(dna, startIndex);
            if(currGene.isEmpty()){ break;}
            System.out.println(currGene);
            startIndex = dna.indexOf("ATG", startIndex) + currGene.length();
        }
    }
    
    public int countGenes(String dna){
        int startIndex = 0;
        int count = 0;
        while(true){
            String currGene = findGene(dna, startIndex);
            if(currGene.isEmpty()){ break;}
            else {count += 1;}
            startIndex = dna.indexOf("ATG", startIndex) + currGene.length();
        }
        return count;
    }
    
    public void testCountGenes(){
        System.out.println(countGenes("AATGGGGTAGATGGCGTGA"));
        System.out.println(countGenes("GATTGCAGG"));
        System.out.println(countGenes("ATTATGGCATAT"));
        System.out.println(countGenes("AGTATGGTATAA"));
    }
    
    public void testPrintAllGenes(){
        printAllGenes("ACGATGGGGTAATCCATGTAG");
    }
}
