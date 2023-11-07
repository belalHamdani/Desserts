public class Main {
    public static void main(String[] args) {
        Main myFactory = new Main();

    }
    public Main() {

        Dessert Cookie;
        Cookie = new Dessert("Cookie", "circle", 5 , 1);
        Cookie.name = "Cookie";
        Cookie.shape = "circle";
        Cookie.numBites = 5;
        Cookie.numHeight = 1;
        Cookie.printInfo();

        Dessert Brownie;
        Brownie = new Dessert("Brownie", "square", 3 , 3);
        Brownie.name = "Brownie";
        Brownie.shape = "square";
        Brownie.numBites = 3;
        Brownie.numHeight = 3;
        Brownie.printInfo();
    }}