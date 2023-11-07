public class Dessert {



    public String name;
    public String shape;
    public int numBites;
    public int numHeight;

    public void printInfo() {
        System.out.println("The dessert is called:" + name);
        System.out.println("The dessert is a:" + shape);
        System.out.println("The dessert takes (in bites):" + numBites);
        System.out.println("The dessert's height is:" + numHeight);

    }


    public Dessert(String paramName, String paramShape, int paramnumBites, int paramnumHeight) {
        name = paramName;
        numBites = 10;
        shape = paramShape;
        numHeight = 2;

    }
}


