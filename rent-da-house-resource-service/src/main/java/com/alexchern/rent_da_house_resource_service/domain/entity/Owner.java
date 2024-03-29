package com.alexchern.rent_da_house_resource_service.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "owners")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OWNER_SEQUENCE_GENERATOR")
    @SequenceGenerator(name = "OWNER_SEQUENCE_GENERATOR", sequenceName = "S_OWNER_SEQUENCE")
    private Long id;

    @Version
    private long version;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @Builder.Default
    @Column(name = "is_agent")
    private Boolean isAgent = false;

    @NotBlank
    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToOne(cascade = CascadeType.MERGE)
    private Flat flat;
}
