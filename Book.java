

public class Book {
    public Book(int age,String name,String author){
        this.age = age;
        this.name = name;
        this.author = author;
        
    }
    int age;
    String name;
    String author;
    public void printState(){
       
        System.out.println("age:"+this.age+"name:"+this.name+"author:" + this.author);
    }

}


