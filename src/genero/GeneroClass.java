/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package genero;

/**
 *
 * @author Mirna
 */
public class GeneroClass {
private GeneroEnum genEnum;
private SubGeneroEnum subEnum;

    public GeneroClass() {
    }

    public GeneroClass(GeneroEnum genEnum, SubGeneroEnum subEnum) {
        this.genEnum = genEnum;
        this.subEnum = subEnum;
    }

    public GeneroEnum getGenEnum() {
        return genEnum;
    }

    public void setGenEnum(GeneroEnum genEnum) {
        this.genEnum = genEnum;
    }

    public SubGeneroEnum getSubEnum() {
        return subEnum;
    }

    public void setSubEnum(SubGeneroEnum subEnum) {
        this.subEnum = subEnum;
    }


}
