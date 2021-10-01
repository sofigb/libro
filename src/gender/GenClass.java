package gender;

public class GenClass {
private GenEnum genEnum;
private SubGenderEnum subEnum;

    public GenClass() {
    }

    public GenClass(GenEnum genEnum, SubGenderEnum subEnum) {
        this.genEnum = genEnum;
        this.subEnum = subEnum;
    }

    public GenEnum getGenEnum() {
        return genEnum;
    }

    public void setGenEnum(GenEnum genEnum) {
        this.genEnum = genEnum;
    }

    public SubGenderEnum getSubEnum() {
        return subEnum;
    }

    public void setSubEnum(SubGenderEnum subEnum) {
        this.subEnum = subEnum;
    }


}
