public class NumbersLoops{
    public NumbersLoops(){
      // while loop prints 0 - 10
      int i = 0;
      while(i < 11){
        System.out.println(i);
        i ++;
      }
      System.out.println("What is index now?: " + i);

      // for i loop prints 0 - 10
      for(int i2 = 0; i2 < 11; i2++){
        System.out.println(i2);
      }

      // lines 4-8 and lines 12-14 do the same thing
      // no difference between for and while loop
      // for loop moves through lists. compiles to a while loop
    }
  
    public int digitSum(int num){
      int sum = 0;
      int i = 0;
      while(i <= num){
        sum = sum + i;
        i++;
        // instead of line 25-26, can do "sum = sum + i++;"
      }
      return sum;

    //   for(int i2 = 0; i2 < num; i2++){
    //     int sum2 = 0;
    //     sum2 = sum2 + i;
    }

    public int reverseNum(int num){
      // 123 mod 10 = 3
      // 123 / 10 = 12
      // 12 mod 10 = 2
      // 12 / 10 = 1
      int newNum = 0;
      while(num > 0){
        newNum = (newNum * 10) + (num % 10);
        num = num / 10;
      }
      return newNum;
    }
    // EX:
    // Start 100, Finish 125
    // returns 3 (101, 111, 121)
    public int palindromeCount(int start, int finish){
      int count = 0;
      for(int x = start; x <= finish; x++){
        if(x == reverseNum(x))
          ++count;
      }
      return count;
    }
  
  
  }
