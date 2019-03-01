import java.util.ArrayList;

public class Main {
    ArrayList<String> str = new ArrayList<String>();
    for(int x = 2; x <= 100; x++) {
        str.add("" + x);
    }
    for(int a = 0; a < str.size(); a++) {
        for(int b = a + 1; b < str.size(); b++) {
            if(Integer.ParseInt(str.get(b)) % Integer.ParseInt(str.get(a)) == 0) str.set(b,"NULL");
        }
    }
    for(int x = 0; x < str.size(); x++) {
        if(s.compareTo("NULL") == 1) str.remove(x);
    }
}
