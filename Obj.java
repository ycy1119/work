import java.sql.SQLOutput;

public class Obj {
    public static void main(String[] args) {

        /*
    　　1）对于==，如果作用于基本数据类型的变量，则直接比较其存储的 “值”是否相等；
           如果作用于引用类型的变量，则比较的是所指向的对象的地址
    　　2）对于equals方法，注意：equals方法不能作用于基本数据类型的变量
    　　　如果没有对equals方法进行重写，则比较的是引用类型的变量所指向的对象的地址；
    　　　诸如String、Date等类对equals方法进行了重写的话，比较的是所指向的对象的内容。
         */
        int a = 3;
        int b = 3;

        /*在java中有8中基本数据类型：float,double,byte,short,int,long,char,boolean
          对于这8种基本数据类型的变量，变量直接存储的是“值”，因此在用关系操作符==
          来进行比较实时，比较的就是“值”的本身。
         */
        //变量a和变量吧存储的值都为3，所以是相等的
        System.out.println(a == b);//true

        String str = new String("hello");
        String str1 = new String("hello");
        String str2 = new String("hello");

        /*
        String类对equals方法进行了重写，用来比较指向的字符串对象所存储的字符串是否相等。
　　   其他的一些类诸如Double，Date，Integer等，都对equals方法进行了重写用来比较指向的对象所存储的内容是否相等。
         */
        System.out.println(str1.equals(str2));//true
        /*
        对于非基本数据类型的变量，在一些书籍中称作为引用类型的变量。比如上面的str1就是
        引用类型的变量，引用类型的变量存储的并不是“值”的本身，而是其关联的对象在内存
        中的地址。如
            String str1；这句话声明了一个引用类型的变量，此时它并没有任何对象关联
            str1= new String("hello");　那么str1指向了一个对象（很多地方也把str1称作为对象的引用），
            此时变量str1中存储的是它指向的对象在内存中的存储地址，并不是“值”本身，也就是说并不是
            直接存储的字符串"hello"。
         所以用==对str1和str2进行第一次比较时，得到的是false，因此它们分别指向的是不同的UI小，也就是说
         它们实际存储的内错错错地址不同。
         */
        System.out.println(str1 == str2);//false

        str1 = str;
        str2 = str;

        /*
        str1和str2都指向了str的对象，所以是true
         */
        System.out.println(str1==str2);//true



    }
}
