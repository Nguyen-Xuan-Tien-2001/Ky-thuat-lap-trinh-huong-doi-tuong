package com.example.Fiverr.Model;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity // Đánh dấu đây là table trong db
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CONGTY {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TenCTY",nullable = false, unique = true)
	private String TenCTY;

    @ManyToOne
    @JoinColumn(name = "User_id")
    private Users user;
}

