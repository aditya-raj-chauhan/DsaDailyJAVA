
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// class MyCompare implements Comparator<String>{
//     @Override
//     public int compare(String o1,String o2){
//         return 0;


//     }
// }
class StringLengthCompare implements Comparator<String>{
    @Override
    public int compare(String o1,String o2){
        return o2.length()-o1.length();


    }


}
public class Day2Collections {
    public static void main(String[] args) {

        List<String> words=Arrays.asList("banana","guava","mango");
        words.sort(new StringLengthCompare());
        System.out.println(words);
     
        
        
    }
}