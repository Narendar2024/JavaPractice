class Calculator{
    public int add(int n1, int n2){
        int r = n1+n2;
        return r;
    }

    public int add(int n1,int n2,int n3){
        int r = n1+n2+n3;
        return r;
    }

    public double add(double n1,int n2){
        double r = n1+n2;
        return r;
    }
    
}

public class MethodOverLoading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(1, 3,5);
        System.out.println(result);
    }
}
