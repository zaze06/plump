package me.alien.plump.data;

public class DataPacket {
    int operation;
    Object data;

    public DataPacket(int operation, Object data) {
        this.operation = operation;
        this.data = data;
    }

    public static DataPacket fromDta(String rawData){
        int operation = 0;
        Object data = null;



        return new DataPacket(operation, data);
    }
}
