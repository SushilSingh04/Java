
/**
 * Write a description of Part1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part1 {
    public String findSimpleGene(String dna) {
        int startIndex = dna.indexOf("ATG");
        if(startIndex == -1){
            return "";
        }
        String result = "";
        int stopIndex = dna.indexOf("TAA", startIndex + 3);
        if(stopIndex == -1){
            return "";
        }
        if((startIndex - stopIndex) % 3 == 0){
            result = dna.substring(startIndex, stopIndex + 3);
        }
        else{
            result = "";
        }
        return result;
    }
    public void testSimpleGene(){
        String dna1 = "GTACTGACGATAA";
        String dna2 = "ATGGCTAGCATCG";
        String dna3 = "TACCGATACGCAA";
        String dna4 = "TATGATCAGGTAA";
        String dna5 = "TAAGACACGTTAA";
        System.out.println("DNA1 is " + dna1);
        System.out.println("Gene is " + findSimpleGene(dna1));
        System.out.println("DNA2 is " + dna2);
        System.out.println("Gene is " + findSimpleGene(dna2));
        System.out.println("DNA3 is " + dna3);
        System.out.println("Gene is " + findSimpleGene(dna3));
        System.out.println("DNA4 is " + dna4);
        System.out.println("Gene is " + findSimpleGene(dna4));
        System.out.println("DNA5 is " + dna5);
        System.out.println("Gene is " + findSimpleGene(dna5));
    }

}
