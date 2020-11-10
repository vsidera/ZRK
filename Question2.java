public class ReverseStringIn4 {
  public static void main(String[] args) {
    
    String company = "zeraki";
    char [] stringCharArray = company.toCharArray();
    String output = "";
    
    for(int i = stringCharArray.length-1; i>=0; i--) {
      ouput = output + stringCharArray[i];
    }
    
    System.out.print( company );
    System.out.println(output);
  }
}