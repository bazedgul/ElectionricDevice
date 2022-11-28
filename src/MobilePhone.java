public class MobilePhone extends Device implements CommunicationDevice, ElectronicDevice {
    public MobilePhone() {
    }

    public MobilePhone(int deviceId, String deviceName, int devicePrice) {
        super(deviceId, deviceName, devicePrice);
    }

    @Override
    public void On() {
        System.out.println("Mobile has turned on: " + " and has Device ID = " + this.getDeviceId() + " Device name = " + this.getDeviceName());
    }

    @Override
    public void Off() {
        System.out.println("Mobile has turned off: " + " and has Device ID = " + this.getDeviceId() + " Device name = " + this.getDeviceName());
    }

    @Override
    public void SendMessage() {
        System.out.println("This Mobile sent your message: " + " and has Device ID = " + this.getDeviceId() + " Device name = " + this.getDeviceName());
    }

    @Override
    public void ReceivedMessage() {
        System.out.println("This Mobile received your message: " + " and has Device ID = " + this.getDeviceId() + " Device name = " + this.getDeviceName());
    }
}
