/*
Създайте класове представящи различни устройства за запис и четене на информация. 
(USB drive, HDD, SSD)  Те имплементират общ интерфейс с 2 метода read(), write(). 
Дефинирайте клас за обект Операционна Система който ползва тези устройства. 
Той трябва да има метод който ни позволява да сменим устройството 
за четене и запис setStorageDevice(...). 
Демонстрирайте чете и запис на данни от обект от клас Операционна Система.
*/
package storagedevice;

public class Main {

    public static void main(String[] args) {
      
      StorageDeviceInterface ssd =  new Ssd();
      StorageDeviceInterface hdd =  new Hdd();
      StorageDeviceInterface usb =  new Usb();
      OperationSystem myBeautifulOS = new OperationSystem(hdd);
      myBeautifulOS.showSD();
    }
}
