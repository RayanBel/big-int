public class Kata {
    public static String add(String a, String b) {
        String sumaTotal = "";
        String carry="0";
      
        while (a.length() < b.length()) a = "0" + a;
        while (b.length() < a.length()) b = "0" + b;
      
        for(int i=a.length()-1;i>=0;i--){
            String suma = String.valueOf(a.charAt(i)+b.charAt(i)+carry.charAt(0)-144);
            sumaTotal = (suma.charAt(suma.length()-1)) + sumaTotal;
            carry = suma.length()>1?String.valueOf(suma.charAt(0)):"0";
        }
              
        return (carry+sumaTotal).replaceFirst("^0+", "");
    }
}
