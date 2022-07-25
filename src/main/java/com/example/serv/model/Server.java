package com.example.serv.model;

import com.example.serv.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Server {
  @Id
  @GeneratedValue(strategy = AUTO)
  private Long id;
  private String ipAddress;
  private String name;
  private String type;
  private String imageUrl;
  private Status status;

}
