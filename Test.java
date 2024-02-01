package Demo6;

public class Test {
    public static void main(String[] args) {
        MyLinekdList<String> list = new MyLinekdList<>();
        System.out.println(list.isEmpty());
        System.out.println(list.len());
        list.add("沐风");
        list.add("安蓝");
        list.add("肖枫");
        try {
            list.remove("asda");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(list.len());
        list.forEach();
    }
}
