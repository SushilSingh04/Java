
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {
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
    
    public void testFindStopCodon(){
        String dna1 = "TAAATGTAA";
        String dna2 = "fjnfjbejhTAGhtk";
        System.out.println(findStopCodon(dna1, 0, "TAA"));
        System.out.println(findStopCodon(dna1, 0, "TAG"));
        System.out.println(findStopCodon(dna2, 0, "TAG"));
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
    
    public void testFindGene(){
        String dna1 = "ACCATGCGT";
        String dna2 = "CATGTCGTAA";
        String dna3 = "ACGATGTAGTGATAA";
        String dna4 = "CATGTCGTACTGG";
        String dna5 = "CTAAATGTCGTAGTGA";
        System.out.println(findGene(dna1, 0));
        System.out.println(findGene(dna2, 0));
        System.out.println(findGene(dna3, 0));
        System.out.println(findGene(dna4, 0));
        System.out.println(findGene(dna5, 0));
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
    
    public void test(){
        String dna1 = "CATGTCTTAATACATGTGGTAG";
        printAllGenes(dna1);
    }
}
