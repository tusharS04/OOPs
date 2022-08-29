package OOPs.staticExample;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(22, "Kunal", 10000, false);
        Human rahul = new Human(23, "rahul", 150000, true);
        Human arpit = new Human(23, "arpit", 150000, true);

        System.out.println(kunal.name);
        System.out.println(rahul.name);
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);

        Main funn = new Main();
        funn.fun2();
       funn.greeting();
       fun();
    }

    static void fun(){
//      greeting(); we cannot use this bcoz it requires an instance
//      but the static function (fun) does not depend on instances
        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
//       to access the non-static method we need to create an instance of the class
        greeting();
    }

    void greeting(){
        System.out.println("Hello");
    }
}

