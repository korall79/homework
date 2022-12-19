package lesson_20.task_2;

public class Calculator {

    private  int a;
    private  int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public  void sum(){

        int var=5;

        class  Sum{

            private int innerA;
            private int innerB;

            public Sum(int innerA, int innerB) {
                this.innerA = innerA;
                this.innerB = innerB;
            }

            public void printSum(){
                System.out.println("Сумма-"+(innerA+innerB));

            }

        }
        Sum sum = new Sum(a,b);
        sum.printSum();
    }

    public void test(){

    }
}
