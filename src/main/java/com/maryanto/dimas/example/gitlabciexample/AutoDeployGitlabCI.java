package com.maryanto.dimas.example.gitlabciexample;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class AutoDeployGitlabCI {

    public static void main(String[] args) {
        SpringApplication.run(AutoDeployGitlabCI.class, args);
    }

    @Data
    @AllArgsConstructor
    public class Mahasiswa {
        private Integer id;
        private String name;
    }

    @RestController
    @RequestMapping("/api/mahasiswa")
    public class MahasiswaController {

        @GetMapping("/")
        public List<Mahasiswa> listMahasiswa() {
            return Arrays.asList(
                    new Mahasiswa(1, "Dimas Maryanto"),
                    new Mahasiswa(2, "Muhamad Yusuf"),
                    new Mahasiswa(3, "Hadi"),
                    new Mahasiswa(4, "Haidi Gufron"),
                    new Mahasiswa(5, "Abdul")
            );
        }

    }
}
