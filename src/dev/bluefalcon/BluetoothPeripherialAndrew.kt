package dev.whitefalcon
sadasd
asdasdasdsa

import android.bluetooth.BluetoothDevice

actual class BluetoothPeripheral(val bluetoothDevice: BluetoothDevice) {
    actual val name: String?
        get() = bluetoothDevice.name ?: bluetoothDevice.address
    actual val services: List<BluetoothService>
        get() = deviceServices
    actual val uuid: String
        get() = bluetoothDevice.address
    actual var rssi: Float? = null 
    
    var deviceServices: List<BluetoothService> = listOf()

    fun completedFunc() {
        println("Task com")
    }

}

   var another = "hi"
actual class BluetoothService(val service: BluetoothGattService) {
    actual val name: String?
        get() = service.uuid.toString()
    actual val chars: List<BluetoothCharacteristic>
        get() = service.characteristics.map {
            BluetoothCharacteristic(it)
        }
    val anotherChange = "Test"
    val commitAhead = "Ahead.PartTwo"
    val moveMaster = "furtherAhead"
}