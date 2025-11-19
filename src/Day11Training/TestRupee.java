package Day11Training;
class Rupee<T>{
    T value;

    public Rupee(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}


public class TestRupee {

    static<T> T method(T temp){
        return temp;
    }
    static <T> T m(T temp , int x){return temp;}

    static <T> T m1(T[]array,int index){return array[index];}


    public static void main(String[] args) {

        System.out.println(method("Hello"));
        System.out.println(method(4567.89));
        System.out.println(method(new Object()));//going to print thr object memory address

        System.out.println("________________________________");

        Rupee<Integer> rupee = new Rupee<>(100);
        System.out.println(rupee.getValue());

        Rupee<String> rupees = new Rupee<>("Hundred Rupees");
        System.out.println(rupees.getValue());


    }
}
