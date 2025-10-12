public class Findthesumandaverageofarrayelements {
    public static void main(String[] args) {
        int arr [] = {10,20,30,40,50};
        int sum  =0;

        for(int i=0; i<arr.length;i++){
sum+= arr[i];
        }
double Avarage = (double) sum/arr.length;
System.out.println("sum of the elements is "+ sum);
System.out.println("Avarage of the elements is "+Avarage);
    }
}
