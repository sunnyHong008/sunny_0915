package com.sunny.list;


public class ArrayLearn {



    public static void main(String[] args) {

        //静态初始化
        int[] array = {1,2,3,5,8};

//        try {
//            array[5] = 1;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        array[5] = 1;

//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);

//        int i = 0;
//         {
//            System.out.println(array[i]);
//            i++;
//        } while (true);

//        while (true){
//            System.out.println(array[i]);
//            i++;
//        }

        //增强for循环
//        for(int j:array){
//            System.out.println(j);
//        }

        //动态初始化

        int[] h = new int[5];
        //默认值为0
        for(int j:h){
            System.out.println(j);
        }

        char[] cs = new char[5];
        //默认值为0对应的ASCII码
        for(char j:cs){
            System.out.println(j);
        }

        String[] strings = new String[5];
        //默认值为null
        for(String j:strings){
            System.out.println(j);
        }

        //基本数据类型存储值
        int a = 10;
        int b = a;//复制值
        b = 100;
        System.out.println(a);//10

        //引用数据类型存储引用
        int[] a1 = {10};
        int[] b1 = a1;//复制地址
        b1[0] = 100;
        System.out.println(a1[0]);//100

        System.out.println("========================================================================");
//        setArray(10);

//        bubbleArray();

        ArrayBox arrayBox = new ArrayBox();

        for (int i = 1;i <= 50;i++) {
            arrayBox.add(i);
        }

        System.out.println(arrayBox.get(51));

    }

    /**
     * 冒泡排序
     */
    public static void bubbleArray(){

        int[] old = {1,8,6,5,9,-9};

        for(int i = 1; i < old.length; i++){
        for(int j = 5; j >= i; j--) {
            if (old[j] < old[j - 1]) {
                int temp = old[j];
                old[j] = old[j - 1];
                old[j - 1] = temp;
            }
        }
        }
        getArray(old);

    }


    /**
     * 存储素(质)数
     */
    public static void primeNumber(){


        int count = 0;
        for(int number = 2; number <= 100; number++){
            boolean b = false;
            for (int j = 2; j <= number/2; j++){
                if(number%j==0){
                    b = true;
                    System.out.println(number+"不是质数");
                    break;
                }
            }
            if(!b){
                count++;
            }
        }
        System.out.println(count);


    }

    /**
     * 删除数组中指定元素
     */
    public static void remove(){
        int[] oldArray = {-5,38,1,100,15,-5,100,28,-3};
        int count = 0;
        for(int i = 0; i < oldArray.length; i++){

            if(oldArray[i] != -5){
                count ++;
            }
        }
        //创建新数组
        int[] newArray = new int[count];
        //另一个思路：int[] newArray = new int[oldArray.length];

        int index = 0;
        for(int i = 0; i < oldArray.length; i++){
            if(oldArray[i] != -5){
                newArray[index] = oldArray[i];
                index ++;
            }
        }

        oldArray = null;
        getArray(newArray);



    }

    /**
     * 拆分数组
     */
   public static void splitArray(){

       int[] oldArray = {-5,38,1,100,15,-5,100,28,-3};

       int max = oldArray[0];
       int maxsIndex = 0;
       for(int i = 1; i < oldArray.length; i++){

           if(oldArray[i] >= max){

               max = oldArray[i];
               maxsIndex = i;
           }
       }


       System.out.println(maxsIndex);

   }

    /**
     * 合并数组
     */
    public static void joinArray(){

        int[] part1 = {1,2,5};
        int[] part2 = {2,9};

        int[] newArray = new int[part1.length + part2.length];
        //思路一
//        for(int i = 0; i < part1.length; i++){
//
//            newArray[i] = part1[i];
//        }
//        for(int i = 0; i < part2.length; i++){
//
//            newArray[part1.length+i] = part2[i];
//        }
        //思路二
        for(int i = 0; i < newArray.length; i++){

            if(i < part1.length){
                newArray[i] = part1[i];
            } else{
                newArray[i] = part2[i-part1.length];
            }

        }


        getArray(newArray);

    }

    /**
     * 找寻最大最小值
     */
    public static void min_max(){
        int[] a = {-5,38,1,-100,15,-5,28,-3};

        int max = a[0];
        int min = a[0];
        for(int i = 1; i < a.length; i++){

            if(a[i]>max){
                max = a[i];
            }else if(a[i]<min){
                min = a[i];
            }

        }

        System.out.println(max);
        System.out.println(min);

    }


    /**
     * 头尾互换位置
     */
    public static void exchange(){
        int[] a = {6,7,8,9,10,11,12};

        for(int i = 0; i < a.length/2; i++){

            int temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }

        getArray(a);
    }


    public static void swap() {
        int aa = 10;
        int bb = 20;

        int temp = aa;
        aa = bb;
        bb = temp;
        System.out.println("交换后： aa = " + aa + "； bb = " + bb);
    };

    /**
     * 交换两个数组（交换元素）
     */
    public static void exchangeAB1(){

        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10};

        for (int i = 0; i < a.length; i++){

            //临时变量法
            int x = a[i];
            a[i] = b[i];
            b[i] = x;

            //加减法计算
            a[i] = a[i] + b[i];
            b[i] = a[i] - b[i];
            a[i] = a[i] - b[i];


            //异或运算
            a[i] = a[i] ^ b[i];
            b[i] = a[i] ^ b[i];
            a[i] = a[i] ^ b[i];

        }

        System.out.println(a[4]);
        System.out.println(b[4]);
    }

    /**
     * 交换两个数组（交换地址）
     */
    public static void exchangeAB2(){

        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10,11,12};

        int [] temp = a;
        a = b;
        b = temp;


        System.out.println(a[4]);
        System.out.println(b[4]);
        System.out.println(temp[4]);
    }

    /**
     * 保存奇数/偶数
     * @param range
     * @return
     */
    public static boolean setArray(int range){

        int[] array = new int[range];
        for(int i = 0; i < array.length; i++){

            array[i] = i*2+1;//奇数
//            array[i] = i*2+2;//偶数

        }
        System.out.println("========================================================================");
        getArray(array);
        return true;
    }

    public static boolean getArray(int[] array){

        for(int a:array){
            System.out.println(a);
        }
        return true;
    }






}
