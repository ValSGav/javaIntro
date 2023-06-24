package Seminar6;

import java.util.HashMap;

public class Notebook {

    private float weight = 0;
    private float diagonal = 0;    
    private int sizeOfOperationMemoryInGb = 0;
    private Disk disk;
    private String operationSystem;

    public Notebook(float noteWeight,
                        float noteDiagonal,                        
                        int notesizeOfOperationMemoryInGb,
                        Disk notedisk,
                        String noteOS) {
        this.diagonal = noteDiagonal;
        this.weight = noteWeight;
        this.disk = notedisk;
        this.sizeOfOperationMemoryInGb = notesizeOfOperationMemoryInGb;
        this.operationSystem = noteOS;
    }

    public float getWeight(){
        return this.weight;
    }

    public float getDiagonal(){
        return this.diagonal;
    }

    public String getOS(){
        return this.operationSystem;
    }

    public int getSizeOfOperationMemory(){
        return this.sizeOfOperationMemoryInGb;
    }

    public Disk getDisk(){
        return this.disk;
    }

    @Override
    public boolean equals(Object obj){
        if(obj==null) 
            return false;
        if(obj.getClass() != this.getClass())
            return false;
        Notebook otherNotebook = (Notebook) obj;
        return this.disk == otherNotebook.getDisk() 
                    && this.diagonal == otherNotebook.getDiagonal()
                    && this.weight == otherNotebook.getWeight()
                    && this.sizeOfOperationMemoryInGb == otherNotebook.getSizeOfOperationMemory()
                    && this.operationSystem == otherNotebook.getOS();
    }

    public boolean isMeetsTheFilterCondition(HashMap<String, String> filter){
        boolean isCorr = true;
        if (filter.containsKey("diagonal"))
            isCorr = isCorr && Float.parseFloat(filter.get("diagonal"))<= this.diagonal;
        if (filter.containsKey("weight"))
            isCorr = isCorr && Float.parseFloat(filter.get("weight")) >= this.weight;        
        if (filter.containsKey("sizeOfOperationMemoryInGb"))
            isCorr = isCorr && Float.parseFloat(filter.get("sizeOfOperationMemoryInGb"))<= this.sizeOfOperationMemoryInGb;
        if (filter.containsKey("operationSystem"))
            isCorr = isCorr && filter.get("operationSystem").equals(this.operationSystem);
        if (filter.containsKey("diskType"))
            isCorr = isCorr && filter.get("diskType").equals(this.disk.getDiskType());
        if (filter.containsKey("diskCapacity"))
            isCorr = isCorr && Integer.parseInt(filter.get("diskCapacity")) <= this.disk.getDiskCapacity();
        
        return isCorr;
    }

    @Override
    public String toString(){
        return String.join("; ", "Ноутбук: ",
                                          String.format("память %d", this.sizeOfOperationMemoryInGb),
                                          String.format("системный диск(%s) (%s) размер %d гб. ", 
                                                                this.disk.getDiskType(), this.disk.getVendor(), this.disk.getDiskCapacity()),
                                          String.format("диагональ %f.2", this.diagonal),
                                          String.format("вес %f.2", this.weight),
                                          String.format("операционная система %s", this.operationSystem));
                                          
    }

}