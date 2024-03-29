package com.snj.snjback.documents;

import lombok.*;


import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Messaging {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    @NonNull
    private String title;

    @Column
    private boolean isOpen;

    @OneToOne (mappedBy = "messagingP")
    private Project projectM;

    @OneToMany
    private List<Message> messages;

}
