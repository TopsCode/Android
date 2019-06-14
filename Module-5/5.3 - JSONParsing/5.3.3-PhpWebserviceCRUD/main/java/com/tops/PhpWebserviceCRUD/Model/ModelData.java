/*
 * Copyright (c) Lukman Upt Pusat Data Dan Informasi UMJ
 */

package com.tops.PhpWebserviceCRUD.Model;


public class ModelData {
    String npm, name, prod;

    public ModelData(){}

    public ModelData(String npm, String name, String prod) {
        this.npm = npm;
        this.name = name;
        this.prod = prod;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }
}
