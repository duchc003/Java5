package com.example.demo.buoi2.controller;

import com.example.demo.buoi2.entity.SinhVien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/sinh-vien/")
public class SinhVienController {

    private List<SinhVien> listSinhVien = new ArrayList<>();

    @GetMapping("hien-thi")
    public String hienThi(Model model) {
        listSinhVien.add(new SinhVien("P01", "Hoàng Công Đức", "Ứng Dụng Phần Mềm", 19, "Đang học"));
        listSinhVien.add(new SinhVien("P02", "Vũ Đình Minh", "Ứng Dụng Phần Mềm", 19, "Đang học"));
        listSinhVien.add(new SinhVien("P03", "Lê Việt Hùng", "Ứng Dụng Phần Mềm", 19, "Đang học"));
        model.addAttribute("listSinhVien", listSinhVien);
        return "student/student";
    }

    @GetMapping("delete/{ma}")
    public String delete(@PathVariable("ma") String ma, Model model) {
        for (SinhVien sv : listSinhVien
        ) {
            if (sv.equals(ma)) {
                listSinhVien.remove(sv);
                break;
            }
        }
        model.addAttribute("listSinhVien", listSinhVien);
        return "student/student";
    }

    @GetMapping("detail/{ma}")
    public String detail(@PathVariable("ma") String ma, Model model) {
        for (SinhVien sv : listSinhVien) {
            if (sv.equals(ma)) {
                model.addAttribute(sv);
                break;
            }
        }
        return "student/student";
    }

    @PostMapping("them-moi")
    public String themMoi(Model model) {
        model.addAttribute("listSinhVien", listSinhVien);
        return "student/student";
    }

    @PostMapping("update")
    public String update(Model model) {
        model.addAttribute("listSinhVien", listSinhVien);
        return "";
    }

    @GetMapping("tim-kiem")
    public String timKiem(Model model) {
        model.addAttribute("listSinhVien", listSinhVien);
        return "";
    }
}
