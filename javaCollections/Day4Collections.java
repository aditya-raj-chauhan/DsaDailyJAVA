import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Day4Collections {
    public static void main(String[] args) {

        
        List<Integer>cowArr=new ArrayList<>();
        cowArr.add(5);
        cowArr.add(4);
        cowArr.add(3);
        cowArr.add(2);
        System.out.println(cowArr);

        for (Integer integer : cowArr) {
            if (integer==2) {
                cowArr.add(1);
                System.out.println("added the last desired element in the list");
                
            }
            
        }

        System.out.println("updated shopping list"+cowArr);
    }
}