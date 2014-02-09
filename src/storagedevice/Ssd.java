
package storagedevice;

public class Ssd  implements StorageDeviceInterface {
     
    
    
    
    @Override
    public String read(){
        return "I am The SSD reading";
    }
    @Override
    public  String write(String data){
        return "I am The SSD writing";
    }
    
}
