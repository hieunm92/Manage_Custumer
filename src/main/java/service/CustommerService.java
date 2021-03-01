package service;

import model.Custommer;

import java.util.ArrayList;
import java.util.List;

public class CustommerService implements ICustommer<Custommer> {

    @Override
    public List<Custommer> findAll() {
        List<Custommer> custommerList = new ArrayList<>();
        custommerList.add(new Custommer(1,"Nam","namct@gmail.com","Hanoi"));
        custommerList.add(new Custommer(2,"Huong","diemhuong@gmail.com","Thai Binh"));
        custommerList.add(new Custommer(3,"Mung","mung09@gmail.com","Nam Dinh"));
        custommerList.add(new Custommer(4,"Viet","vietok@gmail.com","Ha Nam"));
        custommerList.add(new Custommer(5,"Toan","toanden@gmail.com","Nghe An"));
        return custommerList ;
    }
}
