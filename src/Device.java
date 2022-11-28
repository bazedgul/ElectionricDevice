public class Device {
    private int deviceId = 0;
    private String deviceName = null;
    private int devicePrice = 0;

    public Device() {
        this.deviceId = 0;
        this.deviceName = null;
        this.devicePrice = 0;
    }

    public Device(int deviceId, String deviceName, int devicePrice) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.devicePrice = devicePrice;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public int getDevicePrice() {
        return devicePrice;
    }

    public void setDevicePrice(int devicePrice) {
        this.devicePrice = devicePrice;
    }

    @Override
    public String toString() {
        return "Device{" +
                "deviceId = " + deviceId +
                ", deviceName = '" + deviceName + '\'' +
                ", devicePrice = " + devicePrice +
                '}';
    }
}
