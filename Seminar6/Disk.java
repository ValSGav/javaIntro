package Seminar6;

public class Disk {
    private int diskCapacityInGb = 0;
    private boolean isHDD = false;
    private boolean isSSD = false;
    private String vendor = "";

    public Disk(String vendor,
            boolean isHDD,
            boolean isSSD,
            int diskCapacityInGb) {

        this.diskCapacityInGb = diskCapacityInGb;
        this.isHDD = isHDD;
        this.isSSD = isSSD;
        this.vendor = vendor;

    }

    @Override
    public String toString(){
        
        return String.format("%s(%s) size:%d", this.vendor, this.getDiskType(), this.diskCapacityInGb);
    }

    public String getVendor(){
        return this.vendor;
    }

    public String getDiskType(){
        return this.isHDD? "HDD": this.isSSD? "SSD": "UNKNOWN";
    }

    public int getDiskCapacity(){
        return this.diskCapacityInGb;
    }
}
