public class program {
    public static void main(String[] args) {
        int a = 3;
        int b = 10;
        int c = 2;
        int d = 1;
        Solve(a, b, c, d, ""); 
    }
    public static void Solve(int a, int b, int c, int d, String result){
        if (a > b) return;
        if (b == a) {
          System.out.println(result);
          return;
        }
  Solve(a + d, b, c, d, result + " +1");
  Solve(a * c, b, c, d, result + " *2");
  
    }
    
  }