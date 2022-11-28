public class Iron extends Device implements ElectronicDevice {
    public Iron() {
    }

    public Iron(int deviceId, String deviceName, int devicePrice) {
        super(deviceId, deviceName, devicePrice);
    }

    @Override
    public void On() {
        System.out.println("Iron has turned on : " + " and has Device ID = " + this.getDeviceId() + " Device name = " + this.getDeviceName());
    }

    @Override
    public void Off() {
        System.out.println("Iron has turned off : " + " and has Device ID = " + this.getDeviceId() + " Device name = " + this.getDeviceName());
    }
}
