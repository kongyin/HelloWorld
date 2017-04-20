import com.sun.scenario.effect.impl.sw.sse.SSEPerspectiveTransformPeer;

import javax.swing.*;

/**
 * Created by kongyin02 on 2017/4/17.
 */


 class Test{
    void max(int a, int b ) //重载  函数名称一样，但是参数的类型和个数不一样，返回值没有影响；构造函数
    {
        System.out.println("最大值： " + ( a > b ? a : b) );
    }

    void max(float a, float b)
    {
        System.out.println(a > b ? a : b);
    }
    //重写是返回值和参数，函数名都一样;
}

class Person{
    public int age;
    public double height;

    void setAge_height(int _age, double _height)
    {
        age = _age;
        height = _height;
    }
    public void info()
    {
        System.out.println("年龄是：" + age + "我的身高是：" + height);
    }
}

//类的继承
class Student extends Person{
     private String school;

     Student(){}
     public String getSchool()
     {
         return school;
     }

     void setSchool(String _school)
     {
         school = _school;
     }

     public int getages()
     {
         return  age;
     }

     public  double getheights()
     {
         return  height;
     }
}

class Point{
     public double x;
     public double y;

     Point(double _x, double _y)
     {
         x = _x;
         y = _y;
     }

     double getX()
     {
         return  x;
     }

     double getY()
     {
         return y;
     }

     void setX(double x1)
     {
         x = x1;
     }

     void setY(double y1)
     {
         y = y1;
     }
}

class Circle{
  public Point o;
  double radio;

  Circle(double _radio)
  {
      o = new Point(0.0 ,0.0);
      radio = _radio;

  }
  Circle(Point p, double _radio)
  {
        o = p;
        radio = _radio;
  }

  public void setO(float _x, float _y)
  {
        o.setX(_x);
        o.setY(_y);
  }

  public double getArea()
  {
      return  3.14 * radio * radio;
  }
}

//this的应用
  class TThis
{
     int i;
     TThis(int i )
     {
         this.i = i;
     }

     TThis increase()
     {
         i++;
         return  this;  //返回自身的一个引用；
     }

     void print()
     {
         System.out.println("this两次调用后的值为："+this.i);
     }
}

//static 数据区，属于类，只有一份，共享，类名直接调用，作用域，计数
class SStatic{
     static int i = 0;
     int b;
     SStatic()
     {
         b = 100;
     }
}

//权限设置 public private protected
class Access{
     private int i = 1;  //私有的继承类，但是不能使用；
     protected int j = 2;
     public int k = 3;
     int m =4;   //同一个目录和包下面就可以访问，包权限；同一个包里的类可以访问；

     public void accessi()
     {
         i = 11;
     }
}

//super关键字的使用
class SuperClass{
     private int i;
     SuperClass()
     {
         System.out.println("Superclass()" + this.i);
     }
     SuperClass(int _i)
     {
         this.i = _i;
         System.out.println("SuperClass(int n)" + this.i);
     }
}

class Subclass extends SuperClass{
     private int i;
     Subclass()
     {
         super(100);  // 调用父类的有参数的构造函数；
         System.out.println("Subclass()" + this.i);
     }
     Subclass(int _i)
     {
         this.i = _i;    //默认调用父类没有参数的构造函数；
         System.out.println("Subclass(int i)" + this.i);
     }
}


//toString方法的测试
class Dog{

     public String toString()  //重写父类的toString
     {
         return "I am a cool Dog!";
     }
}

//多态的测试
abstract class Animal{  // 抽象类；
     private String name;
     Animal(){}
     Animal(String _name)
     {
         name = _name;
     }
     /*
     void enjoy()
     {
         System.out.println("Animal: " + this.name);
     }
     */

     public abstract void enjoy();  //抽象方法；
}

class Cat extends Animal{
     private String name;
     Cat(String _name)
     {
         super("Animal");
         this.name = _name;
     }

     public void enjoy()
     {
         System.out.println("cat :" + this.name);
     }
}

class BigDog extends Animal{
     private String name;
     BigDog(String _name)
     {
         super("Animal");
         this.name = _name;
     }
     public void enjoy()
     {
         System.out.println("BigDog:"+this.name);
     }
}

class Lady{
     private String name;
     private Animal pet;
     Lady(String _name, Animal _pet)
     {
         this.name = _name;
         this.pet = _pet;
     }

     public void mypetenjoy()
     {
         pet.enjoy();
     }
}

//final关键字的测试 const类似 类不能被继承，变量不可改变，方法不可重写 java.lang 中的String
final class FinalTest{      //不可继承
     final int i = 9;       //变量不能改变其值；
     public final void test()    //不可重写
     {
         System.out.println("this class cant change!");
     }
}

//interface接口的测试
interface singer{
     public static final int i = 0;
     public void singing();     //默认的abstruct的；
}

interface runner{
     public void start();

}

interface dancer extends singer{  //接口的继承
     public void dance();
}

abstract class teacher{
    abstract public void teach();
    public void fun(){};
}

class students implements singer{  //
     private String name;
     students(String _name)
     {
         name = _name;
     }
     public void singing()
     {
         System.out.println("students are singing!");
     }
     public void sleep()
     {
         System.out.println("students are sleeping!");
     }
}

class performer extends teacher implements singer,runner{ //一个类可以实现多个接口；
     public void teach()
     {
         System.out.println("extends:performer is a singer!");
     }
     public void singing()
     {
         System.out.println("interface singer implements ");
     }
     public void start()
     {
         System.out.println("runner: start implements");
     }
}

class dancezhang implements dancer
{
    public void dance()
    {
        System.out.println("dancezhang: implements dancer::dance");
    }

    public void singing()
    {
        System.out.println("dancezhang: implements singer::singsing ");
    }
}


public class HelloWorld {
    public static void main(String agrs[]) {
        String s = "你好"+"李刚";
        String $ss$ = "$号可以作为变量名出现";
        char zhong = '风';
        int zhongvalue = 12;
        int iValue = 233;
        byte by = (byte)iValue;
        float ff = (float)5.6;


        SStatic ss = new SStatic();
        ss.i = 100;  //静态的成员直接可以调用；


        String result = "";  //随机生成一串字符串；
        for (int i = 0; i < 6; i++) {
            int intVal = (int)(Math.random()*26 + 97);  //取值得范围是[0,1)
            result = result + (char)intVal;
        }

        //字符串变为整型
        String a = "345";
        int intVa =  Integer.parseInt(a);

        short sValue = 5; //类型自动提升；

        System.out.println("hello" + 7 + 'a');
        System.out.println('b' + 7 +  "hello");  //先算整型，后算字符串的连接；

        //常量池的区别
        String hel = "hello";
        String hel1 =  "hel" + "lo";

        //foreach的用法 不能用于修改变量的值;
        String[] books = {"html","java","c++"};
        for ( String book : books)
        {
            System.out.println("foreach: " + book   );
        }

        //数组是一种引用数据类型了； 引用栈+实际的对象堆；
        //静态分配数组并且初始化；
        int [] arrs = {1,2,3};
        for(int i = 0,len = arrs.length; i < len; i++)
            System.out.println(arrs[i]);

        //动态分配数组
        int []nullarr; //unllarr只是一个空引用；　　
        int [] arrd = new int[4];
        System.out.println("动态数组的长度：" + arrd.length);

        for(int i = 0,len = arrd.length; i < len; i++)
            System.out.println(arrd[i]);

        //定义了一个Person类的数组
        Person []student;  //仅仅定义了一个引用，类似于指针；　
        student = new Person[2];
        Person zhang = new Person();
        zhang.age = 28;
        zhang.height = 170;

        Person kong = new Person();
        kong.age = 27;
        kong.height = 171;
        student[0] = zhang;
        student[1] = kong;

        //定一个二维数组
        int [][]twoarr;
        twoarr = new int[3][];
        for(int i = 0, len = twoarr.length; i < len ; i++)
        {
            System.out.println(twoarr[i]);
            twoarr[i] = new int[2];
            for(int j = 0, len2 = twoarr[i].length; j < len2; j++)
            {
                twoarr[i][j] = i+j;
            }
        }
        //二维数组的遍历；
        for( int i = 0, len = twoarr.length; i < len; i++) {
            for (int j = 0, len2 = twoarr[i].length; j < len2; j++)
                System.out.print(twoarr[i][j]);
            System.out.print("\n");
        }
        kong.info();
        student[1].info();

        //类的调用；
        Circle c1 = new Circle(new Point(1.0,2.0),5);
        Circle c2 = new Circle(6);
        System.out.println("半径为5的圆的面积：" + c1.getArea());
        System.out.println("半径为6的圆的面积：" + c2.getArea());

        //this的调用
        TThis th = new TThis(100);
        th.increase().increase().print();

        Student st = new Student();
        st.setSchool("哈理工");
        st.setAge_height(27,171);

        System.out.println(st.getSchool()+" "+st.getages()+" "+st.getheights());

        //super test
        Subclass sub = new Subclass();  // 100 0
        Subclass sub1 = new Subclass(200); //0 100

        //toString方法
        Dog d = new Dog();
        System.out.println("toString"+d); //类名+哈希编码

        //string里的equals方法的测试
        String s1 = new String("hello");
        String s2 = new String("hello");

        String s3 = "hello1";  //常量池
        String s4 = "hello1";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        // 多态的测试
        //Animal aa = new Animal("Animal"); //抽象类不能实例化；

        Animal bb = new Cat("cat");
        Animal cc = new BigDog("BigDog");

        Lady cao = new Lady("cao",bb);
        Lady li = new Lady("li",cc);

        cao.mypetenjoy();
        li.mypetenjoy();

        //接口的测试
        singer sin =  new performer();
        sin.singing();

        runner run = (runner)sin; //类型的转换；窗口的变换；
        run.start();              //调用run的方法；

        dancer lili = new dancezhang();
        lili.dance();

        singer yan = (singer)lili; //伴随着多态；
        yan.singing();

        //异常的调试
        try{
            System.out.println("除法：" + 5/0);
        }catch(ArithmeticException ae){
            System.out.println("系统维护中：" + ae);
            ae.printStackTrace();
        }


        System.out.println("this is my first java program!");
        System.out.println(s);
        System.out.println($ss$);
        System.out.println(zhong);
        System.out.println(zhongvalue);
        System.out.println("字符串的连接"+3+4+5);
        System.out.println("强转："+by);
        System.out.println(result);
        System.out.println(a);
        System.out.println(hel == hel1);  //常量池的原因，和堆不一样；
    }
}
