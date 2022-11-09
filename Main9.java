public class Main9 {
    public static void main(String[] args) {
        Animal animal = new Animal("Type ","Razmer ","Mass");
        Cat cat = new Cat("Domashniy","small","3kg","Egypetskiy");

        Kenguru kenguru = new Kenguru("Dikiy","Sredniy","70kg","Moshnaia");

        System.out.println(animal);
        System.out.println(cat);
        cat.going();
        cat.zvuk();
        System.out.println(kenguru);
        kenguru.going();
        kenguru.zvuk();






    }
}
