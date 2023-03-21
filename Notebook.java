public class Notebook {
    private String name;
    private String ram;
    private String hardDisk;
    private String operatingSystem;
    private String colour;
    
    public Notebook(String name, String ram, String ssdDisk, String operatingSystem, String colour) {
        this.name = name;
        this.ram = ram;
        this.hardDisk = ssdDisk;
        this.operatingSystem = operatingSystem;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    
    public String getOperatingSystem() {
        return operatingSystem;
    }

    
    public String getColour() {
        return colour;
    }

    
    public String toString() {
        return "Notebook: Производитель " + name + ", ram=" + ram + ", Жесткий диск=" + hardDisk + ", Операционная система="
                + operatingSystem + ", Цвет=" + colour;
    }

}

