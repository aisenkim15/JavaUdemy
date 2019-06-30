package polymorphism;

class Movie {
    private String name;

    public Movie(String name){
        this.name = name;
    }
    public String plot(){
        return "No Plot Here";
    }
}

class Jaws extends Movie {
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot(){
        return "Shark eats a lot of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("Independence Day");
    }
    @Override
    public String plot(){
        return "Aliens try to take over Earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Trying to escape Maze";
    }
}

class Forgettable extends Movie{
    public Forgettable(){
        super("Forgettable");
    }
    //didn't provide any plot
}

public class main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {

        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random Number generator was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new Forgettable();
            default :
                return null;
        }
    }
}
