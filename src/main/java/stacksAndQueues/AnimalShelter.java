package stacksAndQueues;

public class AnimalShelter {

    protected Queue cat;
    protected Queue dog;

    public AnimalShelter() {
        this.cat = new Queue();
        this.dog = new Queue();
    }

    public void enqueue(Cat animal){
        this.cat.enqueue(animal);
    }

    public void enqueue(Dog animal){
        this.dog.enqueue(animal);
    }

    public Object dequeue(Cat animal){
        return this.cat.dequeue();
    }

    public Object dequeue(Dog animal){
        return this.dog.dequeue();
    }

    public Object dequeue(){
        return null;
    }


}

class Cat{
    public String name;

    public Cat(String name){
        this.name = name;
    }

    public String toString(){
        return this.name;
    }
}

class Dog{
    public String name;

    public Dog(String name){
        this.name = name;
    }

    public String toString(){
        return this.name;
    }
}
