package CollectionsAssignment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Question8 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat =  new SimpleDateFormat("dd-MMMMMM-yyyy");
        System.out.println(simpleDateFormat.format(date));
    }
}
