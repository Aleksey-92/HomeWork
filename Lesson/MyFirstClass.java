public class MyFirstClass {
    public static void main(String[] args) {
//        int a = 15;
//        String str = "Hello Grey";
//        System.out.println(a);
//        System.out.println(str);
        Cat myCat = new Cat();
        Eat myEat = new Eat();
        myEat.Food = "Ribky";
        myCat.age = 3;
        myCat.name = "Sasha";
        Cat myCat2 = myCat;
        myCat2.name = "Red Fox";
        myCat2.age = 15;




        System.out.println(myCat.age);
        myCat.meow();
        myEat.myrluk();


    }

}
