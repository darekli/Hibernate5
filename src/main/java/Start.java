import java.time.LocalDate;

public class Start {
    public static void main(String[] args) {

        CarDao carDao = new CarDao();
        Car car = new Car("FIAT", "126p", LocalDate.of(1990,1,23));
        carDao.add(car);
    }
}
