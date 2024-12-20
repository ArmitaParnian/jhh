class Animal{
    String name;
    void eat(){
        System.out.println("eat");
    }
}
class ma{
    public static void main(String[] args){
        Animal a = new Animal();
        String name= a.name;
        a.eat();
    }
}
