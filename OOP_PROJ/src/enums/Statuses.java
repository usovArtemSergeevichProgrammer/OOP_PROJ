package enums;

import java.io.ObjectInputStream.GetField;

class Person{
    String name;
}

class Colors{
    public final static String GREEN_CODE = "#008000";
}

public enum Statuses {
    RED("#FF0000") {
        @Override
        void action(int a) {
            System.out.println(a * (-1));
        }
    }, GREEN(Colors.GREEN_CODE) {
        @Override
        void action(int a) {
            System.out.println(a + 1);
            
        }
    }, BLACK("#000000") {
        @Override
        void action(int a) {
            System.out.println(a + a);
            
        }
    };
    
    
    Statuses(String code) {
        this.code = code;
    }
    private String code;
    
    public String getCode() {
        return code;
    }
    
    abstract void action(int a) ;
    
    
    static Statuses getColor(String key) {
        switch (key) {
        case Colors.GREEN_CODE:
            return GREEN;
        case "#000000":
            return BLACK;
        case "#FF0000":
            return RED;
        default:
            break;
        }
        return null;
        
    }
}



class Hello {
    public static void main(String[] args) {
        Statuses color = Statuses.BLACK;
        int x = 100;
        switch (color) {
        case BLACK:
            color.getCode();
            color.action(x);
            break;
        case GREEN:
            color.getCode();
            color.action(x);
            break;
        case RED:
            color.getCode();
            color.action(x);
            break;  
        default:
            break;
        }      
    }
}