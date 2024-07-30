import java.util.Scanner;

public class temperature_unit_converter {
    public static float convert(float measure, String unit){
        if(unit.equals("celcius") || unit.equals("c")){
                float convert = (measure - 32) * (5.0f/9.0f);
                System.out.println("The temperature is " + convert+"C");
            }else if(unit.equals("fahrenheit") || unit.equals("f")){
                float convert = (float)(measure * 1.8) + 32;
                System.out.println("The temperature is " + convert+"F");
             }
            else{
                System.out.println("Wrong input detected; pleae try again. ");
                temperature_unit_converter.main(null);
                return Float.NaN;

            }
            return measure;

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        float measure;
        String unit; 
        System.out.println("Enter the temperature:");
        measure = inp.nextInt();
        inp.nextLine();
        System.out.println("Enter the unit to be converted into:");
        unit = inp.nextLine().toLowerCase();
        temperature_unit_converter.convert(measure,unit);

    }
}
