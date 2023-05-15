import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyClass {

    public void calculate(int a, int b, int c){
        System.out.println("");
    }

    public void calculate(String name){
        System.out.println("");
    }


    public static void main(String[] args) {
        MyClass myClass=new MyClass();
        myClass.calculate("name");

        Map<String, Integer> hashMap=new HashMap<>();
        hashMap.put("one",1);
        hashMap.put("two",2);
        hashMap.put("three",3);

        List<Integer> number =List.of(1,5,3,6,8,10);

        Integer max= number.stream().max(Comparator.comparing(Integer::valueOf)).get();
        Integer min= number.stream().min(Comparator.comparing(Integer::valueOf)).get();

        System.out.println(max+"--------"+min);

        List<Integer> even =number.stream().filter(x-> x%2==0).collect(Collectors.toList());
        List<Integer> odd =number.stream().filter(x-> x%2==1).collect(Collectors.toList());

        System.out.println(even +""+ odd);




        number.stream().forEach(x-> {
            System.out.println("**  "+x);
        });



        hashMap.forEach((k,v)->{
            System.out.println(k+ "  "+ v);
        });

    }



}
