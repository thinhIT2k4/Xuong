/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Svieres;

import Duan1.duan;
import java.util.ArrayList;

/**
 *
 * @author pham7
 */
public class svieres1 {

    private ArrayList<duan> listHD = new ArrayList<>();

    public ArrayList<duan> fakeDATA() {
        listHD.add(new duan("HD1", "2022 - 03 - 12", "91", "Đã thanh toán"));
        listHD.add(new duan("HD31", "2022 - 03 - 09", "91", "chưa thanh toán"));
        listHD.add(new duan("HD32", " 2022 - 03 - 10", "91", "chưa"));
        listHD.add(new duan("HD33", "2022 - 04 - 12", "91", "chưa"));
        listHD.add(new duan("HD34", "2022 - 03 - 10", "91", "Đã thanh toán"));
        return listHD;
    }
}
