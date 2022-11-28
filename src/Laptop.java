public class Laptop extends Device implements ElectronicDevice, CommunicationDevice {
    public Laptop() {
    }

    public Laptop(int deviceId, String deviceName, int devicePrice) {
        super(deviceId, deviceName, devicePrice);
    }

    public void SendMessage() {
        System.out.println("This laptop sent your message:" + " and has Device ID = " + this.getDeviceId() + " Device name = " + this.getDeviceName());
    }

    public void ReceivedMessage() {
        System.out.println("This laptop received your message: " + " and has Device ID = " + this.getDeviceId() + " Device name = " + this.getDeviceName());
    }

    @Override
    public void On() {
        System.out.println("Laptop has turned on : " + " and has Device ID = " + this.getDeviceId() + " Device name = " + this.getDeviceName());
    }

    @Override
    public void Off() {
        System.out.println("Laptop has turned off : " + " and has Device ID = " + this.getDeviceId() + " Device name = " + this.getDeviceName());
    }
}
