
package storagedevice;

public class Usb implements StorageDeviceInterface{
    
    @Override
    public String read(){
        return "I am The USB reading";
    }
    @Override
    public  String write(String data){
        return "I am The USB writing";
    }
    
}
