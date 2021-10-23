import java.util.ArrayList;
import java.util.List;

public class KaiTest {
    public static void main(String[] args) {
        int a=12;

        System.out.println("根号"+a+"开跟为");
        KaiGen(a).forEach(i->{System.out.println(i);});

    }
    static List<Object> list=new ArrayList<Object>();
   static List list1;
//    开跟函数
    public  static List<Object> KaiGen(int num){


        if(num%2==0){
//          一部分
          int part = num/2;
//          将part开跟
            if(part%2==0){
                list1  =    KaiGen(part);

            }else {
                list.add(part);
                return list;
            }
          if(part!=2){
              if(part%2==0){
           list1  =    KaiGen(part);
              }
          }else {
            list.add(2);
            list.add(part);
            list.add(list1);
              return list;
          }

//现在是 根号2 和 根号part
      }else {
            list.add(num);
          return list;
      }
        list.add(num);
        return list;

    }
}
