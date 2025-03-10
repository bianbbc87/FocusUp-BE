package com.focusup.entity;

import com.focusup.entity.base.BaseEntity;
import com.focusup.entity.enums.SocialType;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Entity
@Getter
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false, unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    private SocialType socialType;

    @Column
    private String accessToken;

    @Column(nullable = false)
    @Builder.Default
    private int life = 5;

    @Column(nullable = false)
    @Builder.Default
    private int point = 0;

    @Column
    private String curItem;
}
