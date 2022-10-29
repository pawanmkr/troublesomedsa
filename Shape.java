class Shape {
    public int i;
    public int j;
    Shape() {
        i=1;
        j=2;
    }
}

class B extends Shape {
    int a;
    B() {
        super();
    }
}

class super_use {
    public static void main(String[] args) {
        Shape obj = new Shape();
        System.out.println(obj.i + " " + obj.j);
    }
}