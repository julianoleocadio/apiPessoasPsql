package com.api.pessoas.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "dadosPessoais")
public class DadosPessoais {

    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "uuid2")
    @Column(name = "id", length = 36, nullable = false, updatable = false)
    private UUID id;

    @Column(length = 1024)
    private String nome;

    @Column(length = 1024)
    private String nomePai;

    @Column(length = 1024)
    private String nomeMae;

}
