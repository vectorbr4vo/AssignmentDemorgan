public class main {
    public static void main(String[] args) {
        //Question 1
        int x = 5;
        int y = 7;
        System.out.println(((x*4) < (y + 15)) && x < y);
        System.out.println(((3*4) < (2+15)) && 2<3);
        System.out.println((12<17)&&2<3);
        System.out.println((true)&&(true));
        System.out.println(true);
        System.out.println("");

        //Question 2
        x = 10;
        y = 20;
        int z = 30;
        System.out.println((( x == y) || (x < z)) && (x*2 + y)/5 > z);
        System.out.println(((2==2)||(2<3))&&(2*2+2)/5>3);
        System.out.println(((true)||(2<3))&&(6)/5>3);
        System.out.println(((true)||(true))&&(1.2>3));
        System.out.println(((true)||(true))&&(false));
        System.out.println("");

        //Question 3
        boolean a = true;
        boolean b = false;
        System.out.println((a || b) && ((a == b) || a));
        System.out.println(((2<3)||(2>3)&&((2<3)==(2>3)||(2<3))));
        System.out.println(((true)||(false)&&(((true)==(false)||(true)))));
        System.out.println(((true)||(false)&&((false||(true)))));
        System.out.println("");

        //Question 4
        a = false;
        b = false;
        x = 5;
        y = 10;
        System.out.println((a == b) && (x * 4) == (y % 6) * 5);
        System.out.println(((2>3)==(3>4)&&(5*4)==(10%6)*5));
        System.out.println(((false)==(false)&&(20)==(4)*5));
        System.out.println(((false)==(false)&&(true)));
        System.out.println("");

        //Question 5
        System.out.println((Math.abs(-2) == 2) || (Math.sqrt(Math.pow(9,2)) <= 9 && (-4 <= 4)));
        System.out.println(((2) == 2) || 9.0 <= 9 && (-4 <= 4));
        System.out.println(((2)==2)||9.0 <= 9 && (true));
        System.out.println(((true)||true)&&(true));
    }
}