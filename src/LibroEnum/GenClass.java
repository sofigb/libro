package LibroEnum;

public class GenClass {
private GenEnum genEnum;
private SubGenderEnum subEnum;

    public GenClass() {
    }

    public GenClass(GenEnum genEnum, SubGenderEnum subEnum) {
        this.genEnum = genEnum;
        this.subEnum = subEnum;
    }

    public String getGenEnum() {
        return genEnum.toString();
    }

    public void setGenEnum(GenEnum genEnum) {
        this.genEnum = genEnum;
    }

    public String getSubEnum() {
        return subEnum.toString();
    }

    public void setSubEnum(SubGenderEnum subEnum) {
        this.subEnum = subEnum;
    }
    

}
