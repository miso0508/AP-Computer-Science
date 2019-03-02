import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<String>();
        for(int x = 2; x <= 10000; x++) {
            str.add("" + x);
        }
        for(int a = 0; a < str.size(); a++) {
            for(int b = a + 1; b < str.size(); b++) {
                if(Integer.parseInt(str.get(b)) % (a + 2) == 0) {
                    str.set(b,"1");
                }
            }
        }
        for(int x = 0; x < str.size(); x++) {
            if(str.get(x).compareTo("1") == 0) {
                str.remove(x);
                x--;
            }
        }
        System.out.println("Index\tPrime Number");
        for(int x = 0; x < str.size(); x++) {
            System.out.println(x + "\t" + str.get(x));
        }
    }

    public static boolean isPrime(int p) {
        if(p == 1) return false;
        else {
            for(int x = 2; x < p; x++) {
                if(p % x == 0) return false;
            }
        }
        return true;
    }
}
