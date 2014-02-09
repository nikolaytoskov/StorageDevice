
package storagedevice;

public class OperationSystem {
     private StorageDeviceInterface defaultSD;
    
    public OperationSystem(StorageDeviceInterface defaultSD){
        this.defaultSD = defaultSD;
    }

    public void setDefaultSD(StorageDeviceInterface defaultSD) {
        this.defaultSD = defaultSD;
    }

    public StorageDeviceInterface getDefaultSD() {
        return defaultSD;
    }
     public void showSD(){
        System.out.println(defaultSD.read());
        System.out.println(defaultSD.write("I am the default"));
    }
}
