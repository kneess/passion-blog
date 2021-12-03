package com.campos.brainamplified.models;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tutorialpost")
public class TutorialPost {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String heading;
    @OneToMany
    List<Instruction> instructionArrayList;

}
