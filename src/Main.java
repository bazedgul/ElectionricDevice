public class Main {
    public static void main(String[] args) {
        ElectronicDevice[] electronicDevices = {
                // Iron
                new Iron(10, "National", 4500),
                new Iron(11, "National", 6000),
                new Iron(12, "National", 5000),
                new Iron(13, "National", 1000),
                new Iron(14, "National", 2000),
                // laptop
                new Laptop(1, "Lenovo", 40000),
                new Laptop(2, "Lenovo", 50000),
                new Laptop(3, "Lenovo", 60000),
                new Laptop(4, "Lenovo", 7000),
                new Laptop(5, "Lenovo", 80000),
                // Mobile Phone
                new MobilePhone(100, "Samsung", 20000),
                new MobilePhone(20, "iphone", 20000),
                new MobilePhone(30, "Samsung", 20000),
                new MobilePhone(60, "Samsung", 20000),
                new MobilePhone(20, "Samsung", 20000),

        };

        for (ElectronicDevice device : electronicDevices) {
            device.On();
            device.Off();
        }
    }
}