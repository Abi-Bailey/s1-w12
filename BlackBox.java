public class BlackBox {

    public int findIndexofLetter(String word, String letter){
        for(int count = 0; count < word.length(); count++){
            if(count == word.indexOf(letter)){
                return word.indexOf(letter);
            }
        }
        return -1;

        // code below works the same:
        // for(int x = 0; x < word.length(); x++){
        //     if(word.substring(x, x+1).equals(letter))
        //         return x;
        // }
        // return -1;
    }
}
