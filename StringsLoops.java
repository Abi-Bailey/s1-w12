public class StringsLoops{
    public StringsLoops(){
  
    }
  
    public int length(String s){
      int count = 0;
      while (!s.equals("")){
        s = s.substring(1);
        count ++;
      }
      return count;
    }
  
    // "sean", 3 --> "seanseansean"
    public String copy(String s, int num){
      String sum = "";
      while(num != 0){
        sum = sum + s;
        num = num - 1;
      }
      return sum;

      //for loop variation (does the same as the while)
      //for(int i = 0; i < num; i++){
      //newStr += s;
      //}
    }
  
    //s1 = "sean", s2 = "frog" ==> sferaong
    public String interweaving(String s1, String s2){
      String x = "";
      for(int i = 0; i < s1.length(); i++){
        x += s1.substring(i, i+1) + s2.substring(i, i+1);
      }
      return x;
    }
  
  
  }