package datastructure;

import java.util.Scanner;

public class ArrayQueue {
    public static void main(String[] args) {
        // 创建一个三个元素的队列
        MyQueue arrayQueue = new MyQueue(3);
        // 创建获取键盘输入对象
        Scanner scanner = new Scanner(System.in);
        // 接收用户输入
        char key = ' ';
        Boolean loop = true;
        while (loop) {
            System.out.println("s(show): 显示队列");
            System.out.println("e(exit): 退出程序");
            System.out.println("a(add): 添加数据到队列");
            System.out.println("g(get): 从队列取出数据");
            System.out.println("h(head): 查看队列头的数据");
            // 接收一个字符
            key = scanner.next().charAt(0);
            switch (key) {
                case 'a':
                    System.out.println("输入一个数:");
                    int queueValue = scanner.nextInt();
                    arrayQueue.add(queueValue);;
                    break;
                case 'g':
                    try {
                        int getValue = arrayQueue.getValue();
                        System.out.printf("取出的数据是%d\n", getValue);
                    } catch (Exception e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    break;
                case 'h':
                    try {
                        int headValue = arrayQueue.getHead();
                        System.out.printf("队列头的数据是%d\n", headValue);
                    } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    break;
                case 's':
                    arrayQueue.show();
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
    }

}

//数组模拟队列结构
class MyQueue {
    //定义存放数据的数组
    int[] arr;
    //数组容量的大小
    int maxSize;
    //指向队头的指针
    int front;
    //指向对尾的指针
    int end;

    //初始化队列
    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        this.front = -1;
        this.end = -1;
    }

    //判断是否队满
    public boolean full() {
        return this.front==this.end;
    }
    //判断是否队空
    public boolean empty(){
        return this.end==this.maxSize-1;
    }
    //添加数据到队列
    public void add(int value){
        end++;
        arr[end]=value;
    }
    //从队列里取数据
    public int getValue(){
        int emp=arr[end];
        end--;
        return emp;
    }
    //查看队头数据
    public int getHead(){
        return arr[front+1];
    }
    //显示队列数据
    public void show(){
        System.out.println("队列中的元素：");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("["+arr[i]+"]");
        }
    }
}
