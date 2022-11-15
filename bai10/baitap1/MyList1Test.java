package bai10.baitap1;



public class MyList1Test {
    public static void main(String[] args) {
        MyList1<Integer> listInteger = new MyList1<>();
        listInteger.add(0,1);
        listInteger.add(1,1);
        listInteger.add(2,8);
        listInteger.add(3,-1);
        listInteger.add(4,5);
        listInteger.add(5,4);
        listInteger.remove(2);

//        listInteger.clear();

        System.out.println(listInteger);

    }

}
