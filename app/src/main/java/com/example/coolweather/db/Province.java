package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * 省
 */

//LitePal进行表管理操作时不需要模型类有任何的继承结构，但是进行CRUD操作时就不行了，必 须要继承自DataSupport 类才行，因此这里我们需要先把继承结构给加上。
public class Province extends LitePalSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
