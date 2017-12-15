package com.myjava;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//访问修饰符，public，private，protected，default
//class 类，具有相同或者相似特征的对象的集合
//Wu_Activity表示类名

public class Wu_Activity extends AppCompatActivity {
    private static final String TAG = "Wu_Activity";
    public static boolean flag = true;
    // static:静态的，可以修饰类，方法，属性
    private static String name;
    public int age = 15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wu);
        setDemo20160726_2();
    }


    //		标识符
    private void setDemo20160622(){
//		给类、方法、属性、接口等命名的地方都叫做标识符
//		凡是可以自己命名的地方都叫标识符
//		命名规范：
//		1-标识符只能由字母、数字、下划线、$组成
//		2-数字不能打头
//		3-不能和关键字重复
//		4-我们一般采用驼峰式命名法：类名等每个单词的首字母大写，其余字母小写；方法名、
//		变量名，第一个单词的首字母小写，其后每个单词的首字母大写
//		5-约定俗成"见名知意",看见这个变量，我就知道这个变量是干什么的
//		什么叫做变量？在内存当中的一块存储单元。
//		声明一个变量，并初始化
        int mCount;
        mCount = 200;
        int number = 300;
        int sum  = 0;
        int total = 0;
        int count = 0;
        System.out.println();
    }
    //      java基本数据类型有8种
    private void setDemo20160623(){
//          byte，short，int，long，float，double，char，boolean
//			byte表示字节类型，在内存当中它占8位，-128~127
//			short叫做短整形，在内存当中它占16位，-2的15次方到2的15次方-1
//			int叫做整数类型，在内存当中占32位，-2的31次方到2的31次方-1
//			long叫做长整形，在内存当中占64位，-2的63次方到2的63次方-1
//			float叫做浮点型，单精度，32位,小数点的有效性（准确性） 6-7位
//			double叫做双精度，64位，小数点的有效性15-16
//			char字符类型，16位
//			boolean一般我们不去讨论占位，true或者false
        char c = 'a';
        String s = "abc";
        float f = 3.1445f;
        long l = 1235122315L;
        int i = 312;
        byte b = (byte)129;
        System.out.println(Long.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(b);
//			ASCII码 ‘a’=》97
        System.out.println((char)(c+100));
    }
    //		算术运算符
    private void setDemo20160624(){
//		+、-、*、/、%（求余，模）
//		除法：整数除以整数，结果是个整数;整数除以小数，结果是小数
        double div = 100.0/3.0;
        System.out.println(div);
        System.out.println(5%3);
//		逻辑运算符
//		>、<、>=、<=、<<(左移，乘以2，32位一个循环，左边补0)、>>(右移，除以2，32位一个循环，右边补符号位)
        System.out.println(4>>32);
//		位运算符
//		&（按位与）、|（按位或）、&&（短路与）、||（短路或）、~（按位非）、^(按位异或)
//		&(并且)一般来说左边和右边都是boolean运算
        System.out.println(true&false);
//        结果如果都为true那么就是true，只要有一个是false就是false
        System.out.println(true|false);
//        结果如果有一个为true那么就为true，都为false就为false
//		&&短路与，当前面一个返回为false的时候，（后面一个执行与否都不会影响整体结果）后面一个将不会执行
        System.out.println(5>3&&8>7);
//		||短路或，当前面一个返回为true的时候，（后面一个执行与否都不会影响整体结果）后一个将不会执行
        System.out.println(5>3||7<8);
        System.out.println(3>5&7>8);
        System.out.println(~4);
        System.out.println(5|3);
//		^异或（相异为1，相同为0）
        System.out.println(5^3);
//		=、==、!=、++
        int count = 20;
        int x = count++;//++在后是先取值，后自增
        count = 20;
        int y = ++count;//++在后是先自增，再取值
        System.out.println(x);
        System.out.println(y);
        count = 20;
        System.out.println(20+count++);
        count = 20;
        System.out.println(20+(++count));
//		三目运算符
//		a>b?1:0;？号前面的为true，就取：前面的内容，如果为false就去：后面的内容
//		是if-else的简写方式
        System.out.println(5>6?1:0);
        int m = 0;
        if(5>6){
            m = 1;
        }else {
            m = 0;
        }
        System.out.println(5>3?(7>8?3:5):3);
//		但是此种方式我们不推荐使用，可读性
        boolean flag = false;
        if(!flag){

        }
    }
    //      流程控制
    private void setDemo20160624_1(){
		/*
		 * 二者选其一
		 * if(条件表达式(5>3)){
		 * // true
		 * } else {
		 *  // false
		 *  }
		 */
        // if-else 表示2者选其1
		/*
		 * if(条件表达式){
		 *
		 * }
		 *
		 * if(){
		 *
		 * }
		 */

		/*
		 * 多者选其一 if(5>3){
		 * 1 } else if(7>8){
		 * 2 }else if(5>6){
		 * 3 }else{
		 *
		 * 4 }
		 *
		 *
		 */

        int number = 30;
        if (number > 10 && number < 20) {
            System.out.println(15);
        } else if (number >= 20 && number < 30) {
            System.out.println(25);
        } else {
            System.out.println(number);
        }
        // 1 - 声明变量i，并初始化i(只执行一次)
        // 2 - 进行逻辑判断i<30
        // 3 - 如果判断为true就执行循环体里面的内容，如果为false，就跳出循环
        // 4 - 循环体执行完成后，执行i++
        // 5 - 跳到第二步
        for (int i = 0; i < 30; i++) {
            // do sth
        }

		/*
		 * 循环就是让相同的代码执行多次
		 * while(条件表达式){
		 * 如果为true执行循环体，如果为false，跳出循环
		 * }
		 */

		/*
		 * do{
		 * // 是先运行循环体，然后在判断，至少运行一次循环体
		 * }while(条件表达式);
		 */
        // 多者选其一
        int key = 2;
//		switch会根据key的值进行选择，走哪一条路
//		switch每选择走一条路都会一直往下执行，直到遇到break为止。
//		1-key这个值可以放什么内容？int，short，byte，char，String(jdk1.5)，Enum(jdk1.7)（枚举类型）
        switch (key) {
            case 1:
                System.out.println(1);
                //break;
            case 2:
                System.out.println(2);
                //break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("什么都没有");
                break;
        }
        outer:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(j==5){
                    break outer;//此方法可以跳出多层循环
                    //break;//跳出当前循环
                    //continue;//结束此次循环，执行下次循环
                    //return;//跳出方法
                }
                System.out.print(" "+j);
            }

            System.out.println();
        }
        System.out.println("+++++++");
    }
    //		数组
    private void setDemo20160624_2(){
//		什么叫做数组？一系列相同数据类型的元素的集合。
//		初始化
//		1- int表示此数组存放的数据类型，引用数据类型
        int arr[] = {1,2,3,4,5};
        int number = 5;
        String s = "abc";
//		[I@1db9742可以认为它是一个地址（HashCode）
        System.out.println(arr);
//		2-new 创建
        int[] arr1 = new int[5];
//		3-
        int[] arr2 = new int[]{1,2,3,4,5};
//		arr2是一个变量，类型是一个数组类型，保存的值是一个地址
//		数组下标，从0开始，最大值是arr.length-1
        System.out.println(arr2);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
//			arr[i],数组下标，从0-arr.length-1
//			arr1[0],表示数组的第一个格子
//			arr1[arr1.length-1]
        }

        //System.out.println(arr1[4]);
//		数组一旦创建，将不可改变其长度
//		jdk1.5以后出现的，一般我们只用于遍历集合或者数组，我们不推荐使用
        System.out.println("********************************");
        for (int m : arr2) {
//			冒号后面是集合或者数组，冒号前面是变量
//			将集合里面的内容挨个取出来放到m里面去，每循环一次，m就会被赋值一次
            //优点：语法简单，缺点：没有下标
            System.out.print("---"+m);
        }
        System.out.println();
        System.out.println("********************************");
//		二维数组；
        int[] array[] = new int[5][5];
        int[][] array2 ={{1,2,3,4,5},{4,5,6,7},{7,8,9,10}};
//		遍历2维数组，遍历就是将数组或者集合里面的内容挨个挨个拿出来看。
        for (int i = 0; i < array2.length; i++) {
//			i控制的1维
            for (int j = 0; j < array2[i].length; j++) {
//				j控制的是2维
                System.out.print(array2[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println(array2.length);
        System.out.println(array2[1].length);
        int[][] array3 = new int[5][];
    }
    //      java详情
    private void setDemo20160628(){
        //java分为三部分：java se （基础语法） java EE（web：jsp（html内嵌的java代码；javaScript:EcmaScript DOM BOM）和服务器开发）Java Me(企业级)
        //java jdk(java Development Kit) 1.0 1995(12)
        //jdk 1.2 1998 java正式更名为java2 j2EE
        //jdk 1.4 2002 这个版本比较成熟
//		jdk 1.5 2004
//		网景（netScape）
//		2009年，sun公司被oracle公司收购

//		java两大核心机制：JVM（java virtual Machine） 和GC（垃圾回收机制）
//		JVM为java程序的执行提供了一个容器（java程序是放到jvm里面去执行的）
//		GC:系统会自动释放无用内存，我们程序员一般是无法干预的（促进回收）
//		java程序具有跨平台性。一处编译，多处运行。为什么具有跨平台性？是由于jvm的存在
//		在windows系统下，jvm for windows，在Linux系统下，jvm for linux
//		C++没有跨平台性。

//		*.java结尾的 --javac（编译）--》*.class（字节码）--java（执行）--》
//		java运行环境搭建：
//		1.安装jdk（JRE java Runtime Environment） 2.配置环境变量
    }
    //      输出HelloWord
    private void setDemoHelloWord(){
    //java里面的输出语句
        //方法体
        System.out.println("HelloWorld!");
        //注释
        //单行注释
		/*
		 *多行注释
		 */
        //这两种注释是给我们程序开发人员看的，当编译以后，这些注释不会被添加到*.class
        /**
         文档注释，它主要是给用户看的，可以在eclipse生成文档，当编译以后，这些内容会在*.class里面
         */
        //一个源文件*.java里面有且只有一个public类,这个public类必须与源文件的文件名一致
        //学习方法：
        //先模仿，后创造
        //先框架，后细节
        //先学会怎么做，然后在深究为什么
        //要勤动手，多动脑，在做中会
    }
    //       java数组练习(1)
    private void setDemo20160629(){
        //  随机给长度为10的数组赋值并进行排序
        // 1- 声明
        int[] arr = new int[10];
        // 2 - 初始化
        for (int i = 0; i < arr.length; i++) {
//            Math.random 随机赋值
            arr[i] = (int) (Math.random() * 1000);
        }
        // 3 - 排序：冒泡排序
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
//		4 - 使用for循环，输出数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    //       java数组练习(2)
    private void setDemo20160629_1(){
        /*
        int[]?arr={1,13,45,5,0,0,16,6,0,25,4,17,6,7,0,15};
        要求将以上数组中的0项去掉，将不为0的值存入一个新数组，
        生成新的数组:int[]newArr={1,13,45,5,16,6,25,4,17,6,7,15};
        */
        int[]arr = new int[]{1,13,45,5,0,0,16,6,0,25,4,17,6,7,0,15};
        int count = 0;
//        得到数组不等于0的长度
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=0){
                count++;
            }
        }
//        依照上面的长度new一个新的数组
        int[]newArr= new int[count];
//        遍历老数组，把非0的值赋值给新数组
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                newArr[index]=arr[i];
                index++;
            }
        }
//        输出新数组
        for(int k=0;k<newArr.length;k++){
            System.out.print(newArr[k]+" ");
        }
    }
    //       java数组练习(3)
    private void setDemo20160629_2(){
        /*
        写一个方法输入一个整型数组，
        要求打印出输入的数组所有元素之和，
        并打印出最大值和最小值。
        */
        int[] arr = {21,65,48,47,85};
        int sum = 0;
//        通过遍历取出值，然后相加得到所有元素之和。
        for (int i=0;i<arr.length;i++)
        {
            sum = sum + arr[i];
        }
//        遍历值两两之间相互比较得到最大值与最小值
        int min = arr[0],max = arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if (max < arr[i]){
                max = arr[i];
            }

            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println(sum);
        System.out.println(min);
        System.out.println(max);
    }
    //       java面向对象的理解
    private void setDemo20160629_3(){
//       面向对象，我们操作的核心是对象
//       什么是类？什么是对象？对象和类之间的关系？
//       若干个具有相同或者相似特征的对象的集合或者抽象
//       对象是自然界中一个具体的实物，“万事万物皆对象”
//       类是对象的抽象，对象是类的一个具体实例
//       类也可以理解成类型。int Dog

        // 创建对象
        Person person = new Person();
        person.name = "李刚";
        person.age = 25;
        person.height = 183;
        person.weight = 280;
//		实际参数
        int sum = person.compute(5, 8);
        System.out.println(sum);

        person.compute(1,2,3);
        person.fight(1,2);

        Person person1 = new Person();
        person1.setName("刘德华");
//		下面这行代码等价于前面两行代码
        Person person2 = new Person("张学友");

        Person person3 = new Person("邓紫棋",28);
        person3.setName("张惠妹");
        Person person4 = new Person();
        person4.setAge(28);
        person4.setName("邓紫棋");
        person4.setName("杨千嬅");
        System.out.println(person1.getName());
        System.out.println(person3.getName());
        System.out.println(person3.getAge());
        System.out.println(person4.getName());
        System.out.println(person4.getAge());


//		静态代码块是先于代码块执行的，代码块是先于构造方法执行的

//		Person p = new Person();
//		当我们创建对象的时候，先执行的是代码块，然后才是构造方法
//		静态代码块在类加载的时候就执行了。
    }
    //       java面向对象练习（1）
    private void setDemo20160630(){
       /*
        1.狗类
        a）他们的共有特征有毛发颜色，体重，品种，狗龄，喜欢吃的食物；
        b）能跑，能叫（叫声“汪汪汪”）(使用System.out.print输出一句话就可以了)，能跳；
        */
        DogAttribute dog = new DogAttribute();
        dog.color="黑色";
        dog.weight=16;
        dog.age = 3;
        dog.foodOfLove = "骨头";
        dog.type = "哈士奇";
        dog.call();
        dog.run();
        dog.jump();
        System.out.println(dog.age);
    }
    //       java面向对象练习（2）
    private void setDemo20160704(){
     /*
        2.car类
        a）基本属性：颜色、重量、大小、里程、型号（全为非公开）；
        b）此car可以左转、右转、向前、向后，还能播放我们喜欢的音乐；
        c）对外提供方法展示其基本属性；
        d）有相应的构造方法，并在被实例化的时候给以提示；
        f）在主方法中进行测试；
        */
        Car car = new Car();
        car.setColor("黑色");
        String color=car.getColor();
        System.out.print(color);
        car.setDistance(666);
        double distance=car.getDistance();
        System.out.print(distance);
        car.setType("小型");
        String type=car.getType();
        System.out.print(type);
        car.setWeight("两吨");
        String weight=car.getWeight();
        System.out.print(weight);

        car.Left();
        car.Right();
        car.Forward();
        car.Back();
        car.PlayMusic();
    }
    //       java面向对象练习（3）
    private void setDemo20160704_1(){
     /*
        3.point类
        要求：point为空间某个点，有自己的坐标，且提供方法计算此点到原点的距离，提供方法展示自己的坐标（x，y，z）。
        扩展一：空间有三个点，A、B、C，计算由这3点组成的三角形的周长。
        扩展二：如果有一支小虫，它的爬行速度是m m/s(m可以自由设定)， 它要爬完这个三角形的各边需要多长时间？
        */
        Point pointA = new Point(3, 4, 5);
        Point pointB = new Point(4, 5, 6);
        Point pointC = new Point(7, 8, 9);
		/*double distance = pointA.computeDistance(pointB);
		System.out.println(distance);*/
        double computePerimeter = pointA.computePerimeter(pointA, pointB, pointC);
        System.out.println(computePerimeter);
    }
    //       java面向对象练习（4）
    private void setDemo20160704_2(){
        /*
        猜数字游戏：一个类A有一个成员变量v，有一个初值100。定义一个类，对A类的成员变量v进行猜。
        如果大了则提示大了，小了则提示小了。等于则提示猜测成功。?
        */
           A a=new A();
           a.number=80;
           a.guess();
       /*
       小小的改动了一下，原来使用的是：
       Scanner scr=new Scanner(System.in);
       scr.nextInt();
       从控制台输入数字来与变量v进行对比。。
      */

    }
    //       java值传递
    private void setDemo20160705(){
        /*
       	java里面只有值传递（传参的时候，始终传递的是变量的值），没有引用传递
        */
        int a = 9;
        Student jd = new Student();
        jd.changeOne(a);
        System.out.println(a);
        Student s1 = new Student("王二",14);
        jd.changeTwo(s1);
        System.out.println(s1.getName());
        Student s2 = new Student("老五",16);
        jd.changeThree(s2);
        System.out.println(s2.getName());



    }
    //       java内部类
    private void setDemo20160705_1(){
//		当一个方法或者属性使用static修饰以后，这个方法或者属性就不在属于单个对象，
//		而是属于这个类，也就是说，所有对象共享一个属性
//		如果使用static修饰，我们一般使用类名.属性或者方法调用
//		在静态方法里面不能使用this，super
//		在静态方法里面不能使用非静态变量

//		内部类
//		1- 成员内部类：成员变量
//		在成员内部类里面不能用静态变量
//		怎么样去获取一个内部类的对象？
//		先有外部类的对象，然后再创建内部类（成员内部类自带外部类的引用）
        PersonMemberInternal p5 = new Wu_Activity().new  PersonMemberInternal();
    }
    //       java中的继承
    private void setDemo20160706_1(){
        //		1.什么叫做继承？
//		1 - 获取其他类或者父类的方法和属性
//		2 - 父亲有100W，儿子继承了这100W的财产，可以去使用它
//		继承使用关键字extends,一般来说，子类（衍生类）是父类（超类，基类）
        //		2.什么叫做继承？
//		获取父类的方法和属性
//		使用extends
//		子类对象里面包含一个父类对象
//		当我们初始化子类对象的时候，会默认初始化父类对象
//		java当中的继承是单继承
//		属性的隐藏
//		当访问方法或者属性的时候，子类有的时候，就调用子类，如果没有就会去父类当中找
//		方法重写：在两个类中，一般是有继承关系，两同（方法名相同，方法参数相同），两小（返回值类型要小（只能是其本身或者其子类），抛出的异常要小），一大（访问修饰符的权限范围要大）
//	          在继承当中，静态代码块，代码块，构造方法的执行顺序
//		属性的初始化是先于构造方法执行的
//		1 - 从最高父类的静态代码块开始执行（静态代码块的执行时间是在类加载的时候，所有就算不创建对象，静态代码块的类容也会执行）
//		2 - 从最高父类的代码块=>构造方法
        Bird bird = new Bird();
        try {
            bird.jump();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(bird.color);
//		子类在执行方法或者访问属性的时候，先是在本类当中去查找是否有这个方法或者属性，如果有就执行本类的，如果没有就到父类当中去找
//      *****************************************************************************************************

        //		当创建子类对象的时候，会先去默认创建父类对象
        Child child = new Child("黑色");
        child.run();
//		子类对象包裹着父类对象

    }
    //       java中final
    private void setDemo20160707_3(){
        // TODO Auto-generated method stub
//		final
//		final可以修饰类，方法，属性
//		final修饰类，该类不能被继承
//		final修饰方法，该方法不能被重写
//		final修饰属性，该属性不能被修改(不能被重新赋值)
    }
    //       java中的多态
    private void setDemo20160711(){
        // 什么叫做多态？
     /*
        多态：
        就是父类引用可以持有子类对象。
        这时候只能调用父类中的方法，而子类中特有方法是无法访问的，
        因为这个时候（编译时）你把他看作父类对象的原因，
        但是到了运行的时候，编译器就会发现这个父类引用中原来是一个子类的对像，
        所以如果父类和子类中有相同的方法时，调用的会是子类中的方法，
        而不是父类的。
        可以这么说：编译时看父类，运行时看子类。
        */
        // 对同一个消息做出不同的反应
        // 同一类型的变量调用同一个方法，进行不同的操作
        // 前提：
        // 1 - 要继承关系
        // 2 - 要有方法重写
        // 3 - 父类引用指向子类对象
        AnimalAttribute animal = new Dog();// 向上转型（子类转变成父类）
        Cat cat = new Cat();
        animal.run();
        System.out.println(cat instanceof AnimalAttribute);
        // 作用：
        // 提高程序的扩张性
        animal.testCall(new Dog());
        animal.testCall(new Cat());
        animal.testCall(new Sheep());
//		向下转型（父类转子类）
        AnimalAttribute animal1 = new Sheep();
//		在多态当中，父类只能看到子类继承的那一部分
        if(animal1 instanceof Sheep){
            Sheep sheep = (Sheep)animal1;
            sheep.eat();
        }
    }
    //       java中的抽象
    private void setDemo20160712(){
        // 抽象方法：没有方法体的方法叫做抽象方法
        // 使用abstract修饰
        // 含有抽象方法的类必须声明为抽象类
//         Shape shape = new Shape();
        // 1 - 抽象类是不能实例化的
        // 2 - 主要用于被继承
        // 3 - 一个类继承于一个抽象类，那么这个类要么实现其抽象方法，要么将本类声明为抽象类
        // 4 - 抽象类里面可以包含普通方法
        // 5 - 抽象类可以不包含抽象方法
    }
    //       java中的接口
    private void setDemo20160712_1(){
        // 接口?
        // 抽象的抽象，接口里面只能有抽象方法
        // interface，是和类一个级别的
        // 在接口类不能使用private访问修饰符
//		接口内只能有常量和抽象方法
//		接口一般是用于被实现，类和类之间叫做继承，类和接口之间叫做实现，接口和接口可以继承
//		使用implements关键字
//		一个类实现某个接口，要么实现接口里面的所有抽象方法，要么将此类声明为一个抽象类
//		一个类可以实现多个无关接口，一个接口可以被多个无关的类实现
//		接口的实现过程本质就是多继承
//		实现某个接口，可以理解成让子类具有某种能力
//		多态的前提：
//		要有继承，要有重写，父类引用指向子类对象（接口类引用指向实现类对象）

        Singer s = new StudentInterFace();
        //System.out.println(Singer.name);
        s.sing();
        s.jump();
        Painter p = new StudentInterFace();
        p.paint();
    }
    //       java中的jdk_api文档(1)
    private void setDemo20160713(){
        // java默认导入的是java.lang
        // 所有的类直接或者间接继承于Object
        // Object的equals方法判断的是两个对象的地址是否一样
        // finalize方法在垃圾回收的时候调用
        Person p1 = new Person("张三", 15);
        Person p2 = new Person("张三", 15);
        System.out.println(p1.equals(p2));
        System.out.println(p1 == p2);
        // Serializable序列化，持久化
        String s1 = "";
        String s2 = new String();
        byte[] bytes = new byte[]{97,78,35,97};
//		将字节数组转变成字符串
        String s3 = new String(bytes,1,3);
        System.out.println(s3);
//		unicode utf-8(1-4个字节) utf-16（2个字节）GBK（GB2312） iso9000 GB50430
        char[] ch = new char[]{'a','b'};
//		将字符数组转变成一个字符串
        System.out.println(new String(ch));
    }
    //       java中的jdk_api文档(String)
    private void setDemo20160714(){
//		charAt 检索指定索引位置的char值
        String s1 = "abcdefg";
        System.out.println(s1.charAt(s1.length()-1));
//		compareTo 按字典顺序比较两个字符串。
        String s2 = "ABC";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
//		concat    将指定字符串连接到此字符串的结尾。
        System.out.println(s1.concat(s2));
//		contains  当且仅当此字符串包含指定的 char 值序列时，返回 true。
        System.out.println(s1.contains("abefg"));
//		equals    将此字符串与指定的对象比较。
        String s3 = "abcdefg";
        System.out.println(s1.equals(s3));
//		copyValueOf 返回指定数组中表示该字符序列的 String。
        System.out.println(String.copyValueOf(new char[]{'a','b','c'}));
//		endWith 测试此字符串是否以指定的后缀结束。
        System.out.println(s1.endsWith("w"));
//		startWith 测试此字符串是否以指定的前缀开始。
        System.out.println(s1.startsWith("abc"));
//		getBytes   使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
        byte[] bytes = s1.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print((char)bytes[i]+" ");
        }
        System.out.println("************************");
//		getChars    将字符从此字符串复制到目标字符数组。
        char[] chs = new char[5];
        s1.getChars(0, 1, chs, 1);
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
//		toCharArray  将此字符串转换为一个新的字符数组。
        char[] charArray = s1.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
        }
        System.out.println("************************");
//		indexOf      返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。
        String s4 = "abcdeadklskdjflaksjdklfjaslkdjflaks";
        System.out.println(s4.indexOf("dk",8));
//      lastIndexOf  返回指定字符在此字符串中最后一次出现处的索引。
        System.out.println(s4.lastIndexOf("dk",11));
//		isEmpty      当且仅当 length() 为 0 时返回 true。
        System.out.println(s4.isEmpty());
//		正则表达式:是一种匹配规则
        Pattern pattern = Pattern.compile("\\D+");
        Matcher matcher = pattern.matcher("123");
        System.out.println(matcher.matches());

//		replace  返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。
        String s5 = "aba9bab";
        System.out.println(s5.replace("ab", "cd"));
//		replaceAll  使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
        System.out.println(s5.replaceAll("[a-z]", "0"));
//      replaceFirst 使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。
        System.out.println(s5.replaceFirst("[a-z]", "123"));
//		split   根据给定正则表达式的匹配拆分此字符串。
        String s6 = "192,168,1,1";
        String[] split = s6.split(",");
        System.out.println(split[1]);
        String s7 = "123a456b789";
//		limt对匹配结果进行限制
        String[] split2 = s7.split("[a-z]",3);
        System.out.println(split2[1]);
//		substring：字符串的截取
        String s8="abcdefg";
        System.out.println(s8.substring(1));
//		左闭右开
        System.out.println(s8.substring(2, 5));
//      toLowerCase 使用默认语言环境的规则将此 String 中的所有字符都转换为小写。
//      toUpperCase 使用默认语言环境的规则将此 String 中的所有字符都转换为大写。
        String s9 = "AbC";
        System.out.println(s9.toLowerCase().toUpperCase());
//      toString  返回此对象本身（它已经是一个字符串！）。
        System.out.println(s9.toString());
//		trim      返回字符串的副本，忽略前导空白和尾部空白。
        String s10 = "   ja    va   ";
        System.out.println(s10.trim());
//		valueOf:将其他类型转变成字符串
        String valueOf = String.valueOf(new char[]{'q','r','g'});
        System.out.println(valueOf);

    }
    //       java中的jdk_api文档（StringBuffer）
    private void setDemo20160718(){
        StringBuffer sb = new StringBuffer();
        // append   将指定的数据 追加到此字符序列。
        sb.append('a');
        sb.append(1);
        System.out.println(sb.toString());
        // capacity  返回当前容量。
        System.out.println(sb.capacity());
        // delete  移除此序列的子字符串中的字符。
        sb.delete(0, 1);
        System.out.println(sb);
        // insert 将指定的数据插入此字符序列中。
        sb.insert(0, 2);
        System.out.println(sb);
        // String和StringBuffer和StringBuilder
        // 1 - String是不可变的，而StringBuffer和StringBuilder是可以变的
        // 2 - StringBuffer是线程同步或者安全，StringBuilder是线程不安全的
        // 3 - StringBuffer的效率是低于StringBuilder
        // 4 - 当有大量字符串拼接的时候，使用StringBuffer和StringBuilder
        String s = "bcd";
        String s1 = "abc";
        String s2 = "mgk";
        String s3 = s + s1 + s2;
    }
    //       java中的集合
    private void setDemo20160719(){
        // 集合：只能存对象
        // 分类：
        // 1 - List:一个一个的存，分为LinkedList（底层是由双向链表实现的）和ArrayList（底层是由数组实现的）；
        // 1 - set:一个一个的存，和List的区别在于：1 - set中存的内容是不能重复的，而List是可以重复的 2 -
        // set是无序的，而List是有序的
        // 在插入和删除方面，LinkedList性能优于ArrayList，在查询ArrayList优于LinkedList
        // 2 - map：一对一对的存
        // 封装类：
        // 八大分装类：int-Integer boolean-Boolean char-character float-Float
        // byte-Byte double-Double long-Long
        ArrayList mList = new ArrayList();
        mList.add(5);
        // 自动装箱和自动拆箱
        Integer i = 5;// 自动装箱
        int i1 = i;// 自动拆箱
        Integer i2 = new Integer(5);
        int i3 = i2 + 5;
        Integer i4 = 150;
        Integer i5 = 150;
        // 在内存当中，有一个缓存数组【-128-127】的Integer对象
        System.out.println(i4 == i5);
        //
        Node n1 = new Node(4);// 起始节点
        Node n2 = new Node(5);
        Node n3 = new Node(6);
        n1.next = n2;
        n2.prev = n1;
        n2.next = n3;
        n3.prev = n2;
        n3.next = n1;
        n1.prev = n3;
        Node n4 = new Node(7);
        n3.next = n4;
        n4.prev = n3;
        n4.next = n1;
        n1.prev = n4;

        Set set = new HashSet();
        set.add(5);
        set.add(4);
        set.add(new Student("张三", 15));
        set.add(new Student("张三", 15));
        for (Object object : set) {
            System.out.println(object);
        }
        // 在Set这种集合里面，判断相同不相同使用的是equals方法和HashCode方法的双重协定
//		当equals方法返回为true，HashCode返回相同，这个时候Set集合会判定两个对象是同一个对象
    }
    //       java中的集合(1)
    private void setDemo20160720(){
        // 集合：
        // 自动装箱和自动拆箱 equals方法
        // Set判断两个对象是否相同的规则？equals方法和hashcode方法的协同作用
        // Set
        Set set = new HashSet();// 当执行此行代码的时候，脑海当中一定要有一个容器
        set.add("abc");
        set.add("bcd");
        set.add("bcd");
//		无序：放进去的顺序和取出来的顺序不一样
//		遍历集合
//		1 - 使用for-each循环
		/*for (Object object : set) {
			System.out.println(object);
		}*/
//		2 -iterator（迭代器）
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
//            iterator.remove();
//			在迭代的过程当中是不能使用集合的remove方法，只能使用Iterator的remove方法
//            set.remove(next);

        }
        System.out.println("**********************************");
        for (Object object : set) {
            System.out.println(object);
        }
        System.out.println("**********************************");
//        如果 set 不包含元素，则返回 true。
        System.out.println(set.isEmpty());
//        如果 set 包含指定的元素，则返回 true。
        System.out.println(set.contains("bcd"));
        //set.clear();
        System.out.println();
//        如果 set 中存在指定的元素，则将其移除（可选操作）。
        boolean remove = set.remove("abc");
        System.out.println(remove);
    }
    //       java中泛型
    private void setDemo20160720_(){

        List/* <String> */ mList = new ArrayList();
        mList.add("abc");
        mList.add("abc");
        mList.add(1, "bcd");
        Object object2 = mList.get(0);
        String s = (String) object2;
        List<Integer> list = new ArrayList<Integer>();
        list.add(123);
        list.add(456);
        Integer integer = list.get(0);
        mList.addAll(1, list);
        Object obj = mList.set(1, 789);
        System.out.println(obj);
        Object object = mList.get(0);
        for (int i = 0; i < mList.size(); i++) {
            System.out.println(mList.get(i));
        }
        System.out.println(mList.containsAll(list));
        System.out.println(mList.indexOf(123));
        // 泛型，限定的作用
        // 泛型有什么好处？
        // 1 - 避免类型丢失
        // 2 - 避免强转(转换异常)
        // 3 - 增强了程序安全性
		/*
		 * Object[] objs = mList.toArray(new String[0]); for (int i = 0; i <
		 * objs.length; i++) { System.out.println(objs[i]); }
		 */
    }
    //       java中的Map
    private void setDemo20160721_1(){
        //		Map 接口
//		HashMap/TreeMap
//		Map集合是一对一对的存，key（钥匙，别名）--value
//		key和value都可以为空
        Map<String,String> map = new HashMap<String,String>();
        map.put("Lee", "15");
        map.put("Lucy", 14+"");
        map.put("Lily", 14+"");
//      containsKey  如果此映射包含指定键的映射关系，则返回 true。
        System.out.println(map.containsKey("Lee"));
//      containsValue 如果此映射将一个或多个键映射到指定值，则返回 true。
        System.out.println(map.containsValue(15+""));
//      entrySet  返回此映射中包含的映射关系的 Set 视图。
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
//        使用迭代器来遍历集合
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println("key = "+next.getKey()+"   value = "+next.getValue());
        }
        System.out.println(map.get("Lee"));
        System.out.println(map.get("Lily"));
        map.put(null, "ZS");
        System.out.println(map.get(null));
//		key不能为空
        Map<String,String> map1 = new TreeMap<String,String>();
        map1.put("LS", null);


        Set<String> keySet = map.keySet();
        Iterator<String> iterator2 = keySet.iterator();
        while(iterator2.hasNext()){
            String key = iterator2.next();
            System.out.println("key  = "+key+"   value = "+map.get(key));
        }
        map.remove(null);
        Collection<String> values = map.values();
        System.out.println(values);
    }
    //       java中的内部类
    private void setDemo20160721_2(){
        Wu_Activity jd = new Wu_Activity();
//        jd.innerMethod();
        Wu_Activity.InnerClass innerClass = new Wu_Activity().new InnerClass();
        // 访问成员内部类的时候需要外部类对象
        System.out.println(StaticInnerClass.name);
        // 实例化静态内部类的时候可以直接使用new关键字，不需要外部类的对象
        Wu_Activity.StaticInnerClass sic = new StaticInnerClass();
        // 匿名内部类，包含实现或者继承关系
        OnClickListener listener = new OnClickListener() {

            @Override
            public void onClick() {
                // TODO Auto-generated method stub
                System.out.println(new Wu_Activity().age);
            }
        };

        new Wu_Activity() {

            @Override
            public void innerMethod() {
                // TODO Auto-generated method stub
//                super.innerMethod();
                System.out.println("我是子类的方法");
            }
        }.innerMethod();;
    }
    //       java中的File类(适合与用Eclipse运行，因为这个在电脑中创建文件)
    private void setDemo20160722(){
//		File类
//		"D:"+File.Separator+"Lee"+File.Separator+"name"=====D:\\Lee\\name
        File file = new File("D:\\age.txt");//当我们执行这一行代码的时候做了什么事情呢？
//		在内存当中存在一个File类型的对象，在实际的硬盘目录上是不存在此文件的
        try {
            file.createNewFile();//检查本地硬盘目录是否有此文件，如果有，则不创建，如果没有则创建一个空文件
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
//		所谓的parent指的是上级目录
        File file1 = new File("D:","name.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        File file2 = new File(new File("D:"),"height.txt");
        try {
            file2.createNewFile();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // canExecute 测试应用程序是否可以执行此抽象路径名表示的文件。
        System.out.println(file2.canExecute());
        // canRead 测试应用程序是否可以读取此抽象路径名表示的文件。
        System.out.println(file2.canRead());
        // canWrite 测试应用程序是否可以修改此抽象路径名表示的文件。
        System.out.println(file2.canWrite());
        // compareTo 按字母顺序比较两个抽象路径名。。
        System.out.println(file1.compareTo(file2));
        try {
        // createTempFile 在默认临时文件目录中创建一个空文件，使用给定前缀和后缀生成其名称。
            File createTempFile = File.createTempFile("weight", ".txt");
        //  getPath 将此抽象路径名转换为一个路径名字符串。
            System.out.println(createTempFile.getPath());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // delete 删除此抽象路径名表示的文件或目录。
        System.out.println(file2.delete());
        // exists 测试此抽象路径名表示的文件或目录是否存在。
        System.out.println(file2.exists());
        // getName 返回由此抽象路径名表示的文件或目录的名称。
        System.out.println(file.getName());
        // getParent 返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回 null。
        System.out.println(file1.getParent());
        // getParentFile 返回此抽象路径名父目录的抽象路径名；如果此路径名没有指定父目录，则返回 null。
        // getPath   将此抽象路径名转换为一个路径名字符串。
        System.out.println(file1.getParentFile().getPath());
        // isDirectory 测试此抽象路径名表示的文件是否是一个目录。
        System.out.println(file1.isDirectory());
        // isFile 测试此抽象路径名表示的文件是否是一个标准文件。
        System.out.println(file1.isFile());
        System.out.println(file1.getParentFile().isDirectory());
        // isHidden 测试此抽象路径名指定的文件是否是一个隐藏文件。
        System.out.println(file1.isHidden());
        // lastModified 返回此抽象路径名表示的文件最后一次被修改的时间。
        long lastModified = file1.lastModified();
        // SimpleDateFormat 日期和时间模式
        String format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(lastModified);
        System.out.println(format);
        System.out.println(file.length());
    }
    //       java中的File类（1）(适合与用Eclipse运行，因为这个在电脑中创建文件)
    private void setDemo20160722_1(){
        Wu_Activity jd = new Wu_Activity();
        jd.delete(new File("D:/Lucy"));

        // FileInputStream
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File("D:/age.txt"));// 这个时候就有一根数据管道连接到D:/age.txt文件
            int len = 0;
            //  len保存的是每次到底读取了多少个字节
            byte[] buffer = new byte[2];
            while ((len = fis.read()) != -1) {
                System.out.println(new String(buffer));
                System.out.print((char) len);
            }
            fis.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
    //       java中的File类（2）(适合与用Eclipse运行，因为这个在电脑中创建文件)
    private void setDemo20160725(){
        //		OutputStream 抽象类
        try {
//			第二个参数表示是否追加到文件末尾
            FileOutputStream fos = new FileOutputStream("D:/fos.txt",true);
            fos.write(97);
//			往文件写入一个字节
            fos.write("abc".getBytes());//将一个字节数组写入到输出流中
            fos.write("bcd".getBytes(), 1, 2);//从第一个开始，写入两个字节
            fos.flush();//刷新输出流，将输出流当中的字节强制写入目的地
            fos.close();
//			当文件不存在的时候，系统会帮我们创建此文件
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    //       java中的File类（3）(适合与用Eclipse运行，因为这个在电脑中创建文件)
    private void setDemo20160725_1(){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:/bw.txt"));
            bw.write("刘德华");
            bw.newLine();
            bw.write(97);
            bw.flush();
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("D:/bw.txt"));
            //String readLine = br.readLine();
            System.out.println(br.readLine());
            System.out.println(br.readLine());
            System.out.println(br.readLine());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

//		转换流(字节流转换为字符流)
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(isr);
        try {
            String readLine = br1.readLine();
            System.out.println(readLine);
            br1.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

//		File类 FileInputStream FileOutputStream（3个read，3个write，一个close，一个flush）Object流 BufferedWriter和BufferedReader
//		InputStreamReader
    }
    //       java中的日期
    private void setDemo20160725_2(){
        // 获取当前的日期,东八区
        System.out.println(new Date(System.currentTimeMillis()));
        System.out.println(System.currentTimeMillis());
        Date date1 = new Date();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Date date2 = new Date();
//        测试此日期是否在指定日期之前。
        System.out.println(date1.before(date2));
//        返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
        System.out.println(date2.getTime());

        // Calendar
        Calendar calendar = Calendar.getInstance();
//       构造一个带有指定时区和语言环境的 Calendar。
        calendar = Calendar.getInstance(TimeZone.getTimeZone("CST"), Locale.CHINA);
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        int month = calendar.get(Calendar.MONTH);
        System.out.println(month + 1);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        System.out.println(Calendar.HOUR);
        System.out.println(Calendar.MINUTE);
        System.out.println(Calendar.SECOND);
//		SimpleDateFormat日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 E hh时mm分ss秒");
        String format = sdf.format(new Date());
        System.out.println(format);
//      比任何其他值都更接近 pi（即圆的周长与直径之比）的 double 值。
        System.out.println(Math.PI);
    }
    //       java中的线程
    private void setDemo20160726(){
         // 线程的创建
        // 开启线程
        MyThread myThread = new MyThread();
        // 当开启一个线程以后，就会执行其run方法
        myThread.start();
        // myThread.run();
        Thread thread = new Thread(new MyThreadOne());
        thread.start();

        new Thread(){
            public void run() {
                System.out.println("One");
            };
        }.start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("Two");
            }
        }).start();
    }
    //       java中的线程（1）
    private void setDemo20160726_1(){
        MineThread mineThread = new MineThread();
        Thread thread1 = new Thread(mineThread, "chenxi");
        thread1.start();
        Thread thread2 = new Thread(mineThread);
        thread2.start();
        thread2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(thread1.getName());
		/*
		 * System.out.println(thread2.getName()); try { Thread.sleep(5000); }
		 * catch (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } synchronized (mineThread) {
		 * mineThread.notifyAll(); }
		 */
        new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                while (flag) {
                    System.out.println("我正在做某些事情");
                }

            }
        }).start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Wu_Activity.stopThread();
    }
    //       java中的Class与Method
    private void setDemo20160726_2(){
        // 1- Class.forName();
        Class<?> forName = null;
        try {
//          forName  返回与带有给定字符串名的类或接口相关联的 Class 对象。
            forName = Class.forName("com.myjava.Person");
            System.out.println(forName);
//			获取指定的属性
//          getField  返回一个 Field 对象，它反映此 Class 对象所表示的类或接口的指定公共成员字段。
            Field field = forName.getField("name");
            Person p1 = new Person("张三",15);
            System.out.println(field.get(p1));
            field.set(p1, "李四");
            System.out.println(field.get(p1));
//          getFields  返回一个包含某些 Field 对象的数组，这些对象反映此 Class 对象所表示的类或接口的所有可访问公共字段。
            Field[] fields = forName.getFields();
            for (Field field2 : fields) {
                System.out.println(field2);
            }
//			获取方法
//          getDeclaredMethod  返回一个 Method 对象，该对象反映此 Class 对象所表示的类或接口的指定已声明方法。
            Method method = forName.getDeclaredMethod("jump",String.class,String.class);
//          setAccessible     Method的父类的AccessibleObject方法：  将此对象的 accessible 标志设置为指示的布尔值。
            method.setAccessible(true);
            System.out.println(method);
//			动态的去执行方法
//          method.invoke 对带有指定参数的指定对象调用由此 Method 对象表示的底层方法。
            method.invoke(p1, "牛的一比","傻得一比");
//          getMethods  返回一个包含某些 Method 对象的数组，这些对象反映此 Class 对象所表示的类或接口（包括那些由该类或接口声明的以及从超类和超接口继承的那些的类或接口）的公共 member 方法。
            Method[] methods = forName.getMethods();
            for (Method method2 : methods) {
                System.out.println(method2);
            }
//
            Person newInstance = (Person)forName.newInstance();
            newInstance.jump();
//			动态的获取构造方法
            //Constructor<?> declaredConstructor = forName.getDeclaredConstructor(String.class,Integer.class);
            //Person newInstance2 = (Person)declaredConstructor.newInstance("王五",15);
            //Constructor<?>[] declaredConstructors = forName.getDeclaredConstructors();
            //declaredConstructor.setAccessible(true);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } /*catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/ catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } /*catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */ catch (NoSuchMethodException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    //       java练习题
    private void setDemo20160728(){
        // TODO Auto-generated method stub
        // 第一个题
        String s = "sjdkajsdjfskldjfksjdklas";
        int count = 0;
        while (s.length() != 0) {
            char charAt = s.charAt(0);
            String replace = s.replace(charAt + "", "");
            System.out.println((char) charAt + "字符有：" + (s.length() - replace.length()) + "个");
            s = replace;
            count++;
        }
        System.out.println("一共有：" + count + "字符");
        try {
            FileOutputStream fos = new FileOutputStream("D:/test.txt");
            FileInputStream fis = new FileInputStream("D:/test.txt");
            fos.write(count);
            fos.flush();
            fos.close();
            int len = 0;
            while ((len = fis.read()) != -1) {
                System.out.println(len);
            }
            fis.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

		/*// 第二题
		String s1 = "大连是一个美丽的海滨城市";
		for (int i = 1; i <= s1.length(); i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(s1.substring(0, i));
		}*/

//		第三题
        Ecrytion ecryption = new Ecrytion();
        String encrypt = ecryption.encrypt("abcd");
        System.out.println(encrypt);
        String decrypt = ecryption.decrypt(encrypt);
        System.out.println(decrypt);
    }






    private  void set(){
        PersonMemberInternal p = new PersonMemberInternal();
    }

    class PersonMemberInternal{
        public String name;
        public int age;
        //	public static int count = 0;
        public PersonMemberInternal(String name, int age) {
            super();
            this.name = name;
            this.age = age;
        }
        public PersonMemberInternal() {
            super();

        }

		/*public static int test(){

			return count;
		}*/


    }

    // 局部内部类====局部变量
    public void localMethod() {
        final String name = "王五";

        class LocalClass {

            public int age = 15;

            public void local() {
                System.out.println(name);
            }
        }

        new LocalClass().local();
    }
    // 成员内部类====成员变量
    public class InnerClass {
        // 不能有静态方法和变量
        public String name = "张三";

        public void function() {
            System.out.println(age);
        }
    }
    // 静态内部类 ======静态变量
    public static class StaticInnerClass {

        public static String name = "李四";

        // 只能访问外部类的静态变量
        // 如果要访问非静态的属性，那么必须有外部类对象
        public void staticMethod() {
            System.out.println(new Wu_Activity().age);
        }

    }
    //  匿名内部类
    public void innerMethod() {
        InnerClass innerClass = this.new InnerClass();
        System.out.println(innerClass.name);
        System.out.println("我是匿名内部类！");
    }

    /**
     * 递归删除:方法里面调方法
     *
     * @param file
     */
    public void delete(File file) {
        if (file.isFile()) {
            file.delete();
        }
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                delete(files[i]);
            }
            file.delete();
        }
    }

    public static void stopThread() {
        flag = false;
    }

}

class Person {
    // 类体
    // 类内可以包含哪些内容？
    // 1-属性（成员属性，成员变量）：特征(静态的)
    public String name;
    public int age;
    public double height;
    public double weight;


    //	构造方法，构造器，构造函数：用于实例化对象的
//	1 - 构造方法的调用是用new
//	2 - 构造方法的方法名和类名必须一致
//	3 - 构造方法没有返回值

    //	每个类有一个缺省的默认空构造（不带参数的构造器）
//	但是我们一写构造器，那这个默认的空构造就被取消了。
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name){
        this.name = name;
    }

    public Person(){

    }

    //	get和set方法
//	get方法的作用是获取对象的属性
//	set方法的作用是设置或者改变对象的属性
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // 访问修饰符：public、private、protected、default（什么都不写，默认）
    // public:在工程下的所有地方都可以访问
    // private：只能在本类当中访问
    // protected：只能在本包及其子类访问
    // default：只能在本包中访问
    // 2 - 方法（函数）：特征（动态的），功能
    // 方法的声明，void表示返回值为空，jump方法名
    public void jump() {

    }

    // int为返回值类型，方法名后面的括号是放参数的,此参数叫做形式参数？我们不知道a，b是多少具体值
    public int compute(int a, int b) {
        return a + b;
    }

    //  ...表示可变参数，也就是说方法在传参的时候，根据实际调用来确定参数
    public void compute(int a,int...is){
//		表示可以输入任意个参数
//		可变参数在方法内就当做数组来使用
//		可变参数，有什么规则呢？
//		1 - 它只能放到参数的末尾
//		2 - 在一个方法内，只能存在一个可变参数
        System.out.println(is[2]);
    }
    //	普通参数，你声明了几个，你就必须传几个
    public void fight(int a ,int b){

    }


    //	代码块
    {
        System.out.println("我是代码块");
    }

    //	静态代码块
    static {
//		静态代码块是先于代码块执行的，代码块是先于构造方法执行的
        System.out.println("我是静态代码块");
    }


}

class DogAttribute{
    public String color;
    public double weight;
    public String type;
    public int age;
    public String foodOfLove;
    public void jump(){
        System.out.println("这只狗能跳");
    }

    public void run(){
        System.out.println("这只狗能跑");
    }

    public void call(){
        System.out.println("汪汪汪");
    }
}

class Car{
    private String color;
    private String weight;
    private String size;
    private double distance;
    private String type;

    public Car(){
        System.out.print("Car被实例化了");
    }
    //方法重载：在同一个类当中，方法名相同，方法参数不同：1-参数的个数不同，2-参数的类型不同
    public Car(String color,String weight,String size,double distance){
        this();
        this.color = color;
        this.weight = weight;
        this.size = size;
        this.distance = distance;
    }
    //在一个构造器里面去调用另外一个构造器
    public Car(String color,String weight,String size,double distance,String type){
        //this（）构造方法只能放到方法的第一行
        this(color,weight,size,distance);//这个表示调用空构造
        this.type = type;

    }


    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getWeight(){
        return weight;
    }
    public void setWeight(String weight){
        this.weight = weight;
    }
    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }
    public double getDistance(){
        return distance;
    }
    public void setDistance(double distance){
        this.distance = distance;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public void Left(){
        System.out.print("这辆车能左转");
    }
    public void Right(){
        System.out.print("这辆车能右转");
    }
    public void Forward(){
        System.out.print("这辆车能向前开");
    }
    public void Back(){
        System.out.print("这辆车能后退");
    }
    public void PlayMusic(){
        System.out.print("这辆车能播放我们喜欢的音乐");
    }
}

class Point{
    private double x;
    private double y;
    private double z;

    public Point() {

    }

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    // 计算周长
    public double computePerimeter(Point pA,Point pB,Point pC) {

        return pA.computeDistance(pB)+pB.computeDistance(pC)+pA.computeDistance(pC);
    }

    // 计算两点之间的距离,计算方法的调用者和方法参数这两个点的距离
    public double computeDistance(Point point) {

        double total = (this.x - point.x) * (this.x - point.x) + (this.y - point.y) * (this.y - point.y)
                + (this.z - point.z) * (this.z - point.z);

        return Math.sqrt(total);
    }
}

class A{
  private int v= 100;

  public  int number=0;

    public A(){
        v = 100;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }


    public void guess(){
                if(this.v>this.number&&this.number<100){
                    System.out.println("你输入的数小了，请重新输入："+this.number);
                }else if(this.v<this.number&&this.number<100){
                    System.out.println("你输入的数大了，请重新输入："+this.number);
                }else if(this.v==this.number){
                    System.out.println("恭喜你，猜对了!"+this.number);
                }else if(this.number>101){
                }else{
                    System.out.println("你输入的数大了，请重新输入："+number);

                }

    }
}

class Student {
    private String name;

    private int age;

    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Student(String name) {
        super();
        this.name = name;
    }

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void changeOne(int a) {
        a = 5201314;
    }

    public void changeTwo(Student stu){
        stu = new Student("张三",15);
    }

    public void changeThree(Student stu){
        stu.setName("赵六");
    }

}

class Bird extends Animal{
    //	当子类的属性和父类的属性相同是，子类就覆盖（隐藏）掉了父类的属性
    public String color = "红色";

    public void run(){
//		this指的是当前对象，super指的是父类对象
        System.out.println(super.color);
    }

    @Override
    public Bird jump() throws FileNotFoundException {
        System.out.println("我是子类的jump");
        return null;
    }
//	方法重载：在同一个类中，方法名相同，方法参数不同，参数个数不同，参数的类型不同
//	方法重写：（子类对父类的方法不满意，就需要重写父类的方法），
//	在不同的类当中，一般来说都是具有继承关系的两个类，方法名一样，参数一样，这个方法就构成了方法的重写
//	重写遵循的规则：两同（方法名相同，参数相同），两小（返回值类型要小(返回值的类型只能是父类方法返回值类型的本身或者其子类)，抛出的异常要小），一大(访问修饰符的权限要大)
}

class Animal extends FatherAnimal{

    public String color = "黄色";

    protected Animal jump() throws IOException {
        System.out.println("我是父类的jump");
        return this;
    }

}

class FatherAnimal{

}

class Child extends Father{

    private String color = "黄色";
    static {
        System.out.println("我是Child的静态代码块");
    }

    {
        System.out.println("我是Child的代码块");
    }

    public Child() {

        // TODO Auto-generated constructor stub
        System.out.println("实例化了Child");
    }



    public Child(String color) {
//		表示调用父类的构造方法
        super(color);
        this.color = color;
    }



    public void run(){
        //setColor("红色");
        System.out.println(super.color);
    }


}

class Father extends GrandFather{

    public String color = "白色";

    public void setColor(String color){
        this.color = color;
    }
    static {
        System.out.println("我是Father的静态代码块");
    }

    {
        System.out.println("我是Father的代码块");
    }

    public Father() {
        //super();
        // TODO Auto-generated constructor stub
        System.out.println("实例化了Father");
    }

    public Father(String color) {
        super();
        this.color = color;
    }



}

class GrandFather{
    static {
        System.out.println("我是GrandFather的静态代码块");
    }

    {
        System.out.println("我是GrandFather的代码块");
    }

    public GrandFather() {
        //super();
        // TODO Auto-generated constructor stub
        System.out.println("实例化了GrandFather");
    }

}


// 单例模式（设计模式）
// 只能存在一个对象

class Singleton {
    // 1- 将构造方法生命为私有的
    private Singleton() {
        System.out.println("实例化了对象");
    }

    // 这种模式叫做懒汉模式（在需要的时候才去创建对象），缺点：在多线程当中勿用。
    private static Singleton singleton = null;

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    // 恶汉模式,这个可以在多线程当中使用
    private static final Singleton s = new Singleton();

    public static Singleton newInstance() {
        return s;
    }
}


class AnimalAttribute {
    public void run() {
        System.out.println("Animal is running！");
    }

    public void call() {

    }

    // 根据不同的动物发出不同的声音
    public void testCall(AnimalAttribute animal) {
        // instanceof否是某判断某个对象是个类的实例
        // 对象（对象引用）instanceof 类名
        if (animal != null) {
            animal.call();
        }

    }
}

class Dog extends AnimalAttribute {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        // super.run();
        System.out.println("Dog is running!");
    }

    @Override
    public void call() {
        // TODO Auto-generated method stub
        super.call();
        System.out.println("Dog is calling");
    }
}

class Cat extends AnimalAttribute {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();
    }

    @Override
    public void call() {
        // TODO Auto-generated method stub
        super.call();
        System.out.println("Cat is calling");
    }

}

class Sheep extends AnimalAttribute {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();
    }

    @Override
    public void call() {
        // TODO Auto-generated method stub
        super.call();
        System.out.println("Sheep is Calling");
    }

    public void eat(){
        System.out.println("Sheep is eatting");
    }

}

// 抽象
abstract class Shape {

    public abstract double computeArea();

    public void compute() {

    }

    public void set() {
        computeArea();
    }
}

class Square extends Shape {

    @Override
    public double computeArea() {
        // TODO Auto-generated method stub
        // 这里面写正方形的具体实现
        return 8.8;
    }
}

//  接口
interface Singer /*extends Painter*/{
    //	接口内的属性默认的是public static final
    String name = "Lee";

    public void sing();

    public void jump();
}

interface Painter{

    public void paint();
}

interface Runner{
    public void run();
}

class StudentInterFace implements Singer,Runner,Painter{


    @Override
    public void sing() {
        // TODO Auto-generated method stub

    }

    @Override
    public void jump() {
        // TODO Auto-generated method stub

    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

    }
    @Override
    public void paint() {
        // TODO Auto-generated method stub

    }
}

class Node {

    public int data;// 每块内存单元保存数据的地方
    public Node next;// 下一个内存单元的地址
    public Node prev;// 上一个内存单元的地址

    public Node(int data, Node next, Node prev) {
        super();
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public Node() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Node(int data) {
        super();
        this.data = data;
    }

}

interface OnClickListener {
    public void onClick();
}

// 1 - 继承于Thread类
class MyThread extends Thread {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();
        // 此地方写线程执行的逻辑代码
        System.out.println("开启了一个线程");
    }
}

// 2 - 实现Runnable，在实际开发当中，绝大多数都是使用第二种方式
class MyThreadOne implements Runnable {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("开启One线程");
    }
}

class MineThread implements Runnable {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        // 线程同步，在同一时间只有一个线程执行同步代码
        // 原子性操作
        // 同步锁
        // wait方法和notify方法必须放到同步代码块里面，锁住必须是同一个对象，且方法的调用者也是同一个对象
        synchronized (this) {
            for (int i = 0; i < 500; i++) {
				/*
				 * try { Thread.sleep(1000); } catch (InterruptedException e) {
				 * // TODO Auto-generated catch block e.printStackTrace(); }
				 */
                System.out.println(i);
                if (i == 50) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}


class Ecrytion {

    public String encrypt(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(s.length() - 1));
        for (int i = 0; i < s.length() - 1; i++) {
            sb.append((char)(s.charAt(i) + 3));
        }
        return sb.toString();
    }

    public String decrypt(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            sb.append((char)(s.charAt(i) - 3));
        }
        sb.append(s.charAt(0));
        return sb.toString();
    }
}
