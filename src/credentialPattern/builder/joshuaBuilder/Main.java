package credentialPattern.builder.joshuaBuilder;

public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone.Builder()
                .price(1000000)
                .companyName("samsung")
                .name("galaxy20")
                .isAndroid(true)
                .build();

        System.out.println("this phone " + phone);
    }
}
