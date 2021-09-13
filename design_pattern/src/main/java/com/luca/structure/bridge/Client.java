package com.luca.structure.bridge;

import java.sql.Driver;
import java.sql.DriverManager;

public class Client {

    public static void main(String[] args) {
        //获取折叠式手机（样式 + 品牌）
        FoldedPhone phone1 = new FoldedPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();

        UpRightPhone phone2 = new UpRightPhone(new XiaoMi());
        phone2.open();
        phone2.call();
        phone2.close();
    }
}
