import java.math.BigInteger;
class Solution {
    public int[] solution(int denom1, int numer1, int denom2, int numer2) {
        int[] answer = {};
        
        int a = numer1 * denom2 + numer2 * denom1;
        int b = numer1 * numer2;
        BigInteger y = BigInteger.valueOf(a);
        BigInteger x = BigInteger.valueOf(b);
        
        int tmp = y.gcd(x).intValue();
        // System.out.printf("a: %d , b: %d %n", a,b);
        // System.out.println(tmp);
        
        return new int[]{a/tmp,b/tmp};
    }
    /*
        int mother = num1 * num2;
        int son1 = num1 * denum2;
        int son2 = num2 * denum1;
        int totalSon = son1 + son2;
        //int qwe = 1;
        int tmp = Math.max(totalSon,mother);
        for(int i = 1; i <= tmp; i++){
            if(totalSon % i == 0 && mother % i == 0){
                totalSon /= i;
                mother /= i;
                //qwe = i;
            }
        }
        
        return int[]{totalSon, mother};
    */
}