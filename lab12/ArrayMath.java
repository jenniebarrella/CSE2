public class ArrayMath{
    public static void main(String [] arg){
        double x[]={2.3, 3, 4, -2.1, 82, 23},
            y[]={2.3, 3, 4, -2.1, 82, 23},
            z[]={2.3, 13, 14},
            w[]={2.3, 13, 14, 12}, 
            v[],
            u[]={2.3, 12, 14};
        v=addArrays(x,y);
        System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
        System.out.println(display(x)+" \n  + " + display(z) + "\n   = " +display(addArrays(x,z)));
        System.out.println("It is " + equals(x,y)+" that "+display(x)+
                           " == "+display(y));
        System.out.println("It is " + equals(z,w)+" that "+display(z)+
                           " == "+display(w));
        System.out.println("It is " + equals(u,z)+" that "+display(u)+
                           " == "+display(z));
    
      }
      
    public static String display(double [] x){
        String out="{";
        for(int j=0;j<x.length;j++){
            if(j>0){
                out+=", ";
            }
            out+=x[j];
        }
        return out+"}";
    }
    

    public static double [] addArrays(double [] x, double [] z){
        int n=x.length;
        if (x.length<z.length) {
            n=z.length;
        }
        double [] add = new double [n];
        for (int i = 0; i<n; i++) {
            if (i>=x.length) {
                add[i] = z[i];
            }
            else if (i>=z.length) {
                add[i] = x[i];
            }
            else {
                add[i] = x[i]+z[i];
            }
        }
        return add;
    }
    
    public static boolean equals(double [] one, double [] two) {
        if (one.length == two.length) {
            for (int i = 0; i<one.length; i++){
                if ( one[i] != two[i] ){
                    return false;
                } 
            }
            return true;
        }
        return false;
    }
    
}