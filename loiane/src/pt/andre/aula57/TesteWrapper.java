package pt.andre.aula57;

public class TesteWrapper {

    public static void main(String[] args) {
        
        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 1000l;
        float num5 = 3.5f;
        double num6 = 3.5555;
        boolean flag = true;
        char a = 'a';
        
        Short num7 = new Short((short) 1);
        Byte num8 = new Byte((byte) 10);
        Integer num9 = new Integer(100);
        Long num10 = new Long(10000l);
        Float num11 = new Float(3.5f );
        Double num12 = new Double(3.5555);
        Boolean flag2 = new Boolean(true);
        Character b = new Character('b');
        
        Integer num13 = new Integer("1000");
        
        Double num14 = new Double("3.5");
        
        System.out.println(num13.intValue());
        System.out.println(num13.longValue());
        
        Long num15 = num13.longValue();
        
        int num16 = Integer.parseInt("1000");
        
        Integer num18 = Integer.valueOf(45851);
        System.out.println(num18);
        
        
    }

}