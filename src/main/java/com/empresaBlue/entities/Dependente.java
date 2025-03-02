package com.empresaBlue.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "dependente")
public class Dependente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "nome", nullable = false, length = 255)
	private String nome;

	@Column(name = "cpf", nullable = false, length = 255)
	private String cpf;
	
	@Column(name = "telefone", nullable = false, length = 255)
	private String telefone;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_funcionario", nullable = false)
	private Funcionario funcionario;
}
