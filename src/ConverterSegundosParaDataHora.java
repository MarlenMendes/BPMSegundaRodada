import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.Date;

public class ConverterSegundosParaDataHora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long segundos;

        segundos = input.nextLong();

        long millis = segundos * 1000;
        Date date = new Date(millis);

        SimpleDateFormat df = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));

        System.out.println(df.format(date));
    }
}
