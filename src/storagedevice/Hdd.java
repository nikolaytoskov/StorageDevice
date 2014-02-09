
package storagedevice;

public class Hdd implements StorageDeviceInterface {
      @Override
    public String read(){
        return "I am The HDD reading";
    }
    @Override
    public  String write(String data){
        return "I am The HDD writing";
    }
    
}
